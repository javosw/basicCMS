// meta characters:  |  (  )  {  }  [  ]  < >  \  .  *  +  ?  ^  $  / . " ~ !

// codigo antes de la clase lexer
package josq.cms.lenguajes.automatas;

import java.io.Reader;

//import java_cup.runtime.*;
import java_cup.runtime.Symbol;
import java_cup.runtime.SymbolFactory;
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ComplexSymbolFactory.Location;
import java_cup.runtime.DefaultSymbolFactory;

import josq.cms.archivos.MiArchivo;
import josq.cms.lenguajes.automatas.ParserAccionesSym;
import josq.cms.lenguajes.automatas.modelos.jflex.Punto;
import josq.cms.lenguajes.controladores.EjecutarAcciones;

%%
// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% %%%%%%%%%%%%%%%%%%%%

// configuracion de jflex
//%debug
%16bit
// configuracion de la clase lexer
%class LexerAcciones
%public
//%apiprivate 
%cupsym ParserAccionesSym
%cup
%line
%column
%char

// codigo dentro de la clase lexer
%{
    public LexerAcciones(Reader myReader, DefaultSymbolFactory myFactory) { this(myReader); this.myFactory = myFactory; }

    private DefaultSymbolFactory myFactory = null;

    private Symbol symbol(String name, int sym) {
        int izq = (int)yychar+1;
        int der = (int)yychar+yylength();
        Symbol mySymbol = myFactory.newSymbol(name, sym, izq, der);
        return mySymbol;
    }
    private Symbol symbol(String name, int sym, Object val) {
        int izq = (int)yychar+1;
        int der = (int)yychar+yylength();
        Symbol mySymbol = myFactory.newSymbol(name, sym, izq, der, val);
        return mySymbol;
    }

    // para errores lexicos
    public Punto getPunto(){ return new Punto(yycolumn, yyline, yylength(), (int)yychar+1); };
    StringBuilder log(String text) 
    {
        EjecutarAcciones.logSintaxis.append(text); 
        return EjecutarAcciones.logSintaxis; 
    }
    
    // para manejo de contextos lexicos
    private boolean accioncEsInpar = false;
    private boolean parametroEsInpar = false;
    private boolean atributoEsInpar = false;

    private void setContextoDe(int sym)
    {
        if(sym == ParserAccionesSym.ACCI)
        { 
            if (accioncEsInpar) { yybegin(YYINITIAL); }
            else { yybegin(MI_ACCION); }
            accioncEsInpar = !accioncEsInpar;
        }
        else if(sym == ParserAccionesSym.PARAM)
        { 
            if (parametroEsInpar) { yybegin(YYINITIAL); }
            else { yybegin(MI_PARAMETRO); }
            parametroEsInpar = !parametroEsInpar;
        }
        else if(sym == ParserAccionesSym.ATRIB)
        { 
            if (atributoEsInpar) { yybegin(YYINITIAL); }
            else { yybegin(MI_ATRIBUTO); }
            atributoEsInpar = !atributoEsInpar;
        }
    }

    /*
    ComplexSymbolFactory myFactory = null;

    public LexerAcciones(Reader in, ComplexSymbolFactory sf) { this(in); myFactory = sf; }

    private Symbol symbol(String name, int sym) {
        Location izq = new Location(yyline+1, yycolumn+1, (int)yychar);
        Location der = new Location(yyline+1, yycolumn+yylength(), (int)yychar+yylength());
        Symbol mySymbol = myFactory.newSymbol(name, sym, izq, der);
        return mySymbol;
    }
    private Symbol symbol(String name, int sym, Object val) {
        Location izq = new Location(yyline+1, yycolumn+1, (int)yychar);
        Location der = new Location(yyline+1, yycolumn+yylength(), (int)yychar+yylength());
        Symbol mySymbol = myFactory.newSymbol(name, sym, izq, der, val);
        return mySymbol;
    }*/
%}

// estados lexicos
//%xstate CONTEXTO_1
%state MI_ACCION, MI_PARAMETRO, MI_ATRIBUTO
%state MI_ID, MI_ID_USER
%state MI_NUMERO
%state MI_TEXTO, MI_TITULO, MI_ETIQUETA, MIS_ETIQUETAS
%state MI_COLOR, MI_FECHA, MI_URL
%state UI_WEB, MI_ALIGN

// macros para regex

InvisibleVertical    =  \r|\n|\r\n
InvisibleHorizontal  =  [ \t\f]
Invisible            =  {InvisibleHorizontal} | {InvisibleVertical}
_                    =  {Invisible}

pre  =  _ | - | \$
id   =  {pre}([a-zA-Z0-9]|{pre})*
//idSitio 
//idPagina 
//idComponente 
//idUsuario

miChar      =  [a-zA-Z0-9\:\;\,\.\!\@\#\%\&\+\*\(\)]
miTexto     =  {_}*({miChar}+{_}*)+
//miTitulo

miNumero      =  [1-9][0-9]*
miColor       =  #[0-9a-fA-F]{6}
miURL         =  [a-zA-Z0-9\:\.\/\?\=]+
miFecha       =  [0-9]{4}\-[0-9]{2}\-[0-9]{2}
miEtiqueta    =  [a-zA-Z0-9]+


nombre    =  [nN][oO][mM][bB][rR][eE]
valor     =  [vV][aA][lL][oO][rR]

%%
// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% %%%%%%%%%%%%%%%%%%%%

<YYINITIAL> {
// nodos
"acciones"    { return symbol("",ParserAccionesSym.ACCIS); }
"parametros"  { return symbol("",ParserAccionesSym.PARAMS); }
"atributos"   { return symbol("",ParserAccionesSym.ATRIBS); }

"accion"      { setContextoDe(ParserAccionesSym.ACCI);   return symbol("",ParserAccionesSym.ACCI); }
"parametro"   { setContextoDe(ParserAccionesSym.PARAM);  return symbol("",ParserAccionesSym.PARAM); }
"atributo"    { setContextoDe(ParserAccionesSym.ATRIB);  return symbol("",ParserAccionesSym.ATRIB); }

"etiquetas"   { return symbol("",ParserAccionesSym.ETIQS); }
"etiqueta"    { return symbol("",ParserAccionesSym.ETIQ); }
// etiqueta.valor
{valor}       { yybegin(MI_ETIQUETA); return symbol("",ParserAccionesSym.VALOR); }
}


<MI_ACCION, MI_PARAMETRO, MI_ATRIBUTO> {
// nodo.nombre
{nombre} { return symbol("",ParserAccionesSym.NOMBRE); }
}

<MI_ACCION>{
// accion.nombre="MI_ACCION"
"NUEVO_SITIO_WEB"       { yybegin(YYINITIAL); return symbol("",ParserAccionesSym.SITE_NEW); }
"BORRAR_SITIO_WEB"      { yybegin(YYINITIAL); return symbol("",ParserAccionesSym.SITE_DEL); }
"NUEVA_PAGINA"          { yybegin(YYINITIAL); return symbol("",ParserAccionesSym.PAGE_NEW); }
"MODIFICAR_PAGINA"      { yybegin(YYINITIAL); return symbol("",ParserAccionesSym.PAGE_MOD); }
"BORRAR_PAGINA"         { yybegin(YYINITIAL); return symbol("",ParserAccionesSym.PAGE_DEL); }
"AGREGAR_COMPONENTE"    { yybegin(YYINITIAL); return symbol("",ParserAccionesSym.COMP_NEW); }
"MODIFICAR_COMPONENTE"  { yybegin(YYINITIAL); return symbol("",ParserAccionesSym.COMP_MOD); }
"BORRAR_COMPONENTE"     { yybegin(YYINITIAL); return symbol("",ParserAccionesSym.COMP_DEL); }
}

<MI_PARAMETRO>{
// parametro.nombre="MI_PARAMETRO"
"ID"                    { yybegin(MI_ID);    return symbol("",ParserAccionesSym.P_ID); }
"SITIO"                 { yybegin(MI_ID);    return symbol("",ParserAccionesSym.P_SITIO); }
"PADRE"                 { yybegin(MI_ID);    return symbol("",ParserAccionesSym.P_PADRE); }
"PAGINA"                { yybegin(MI_ID);    return symbol("",ParserAccionesSym.P_PAGINA); }
"USUARIO_CREACION"      { yybegin(MI_ID);    return symbol("",ParserAccionesSym.P_USER_NEW); }
"USUARIO_MODIFICACION"  { yybegin(MI_ID);    return symbol("",ParserAccionesSym.P_USER_MOD); }
"TITULO"                { yybegin(MI_TEXTO); return symbol("",ParserAccionesSym.P_TITULO); }
"FECHA_CREACION"        { yybegin(MI_FECHA); return symbol("",ParserAccionesSym.P_FECHA_NEW); }
"FECHA_MODIFICACION"    { yybegin(MI_FECHA); return symbol("",ParserAccionesSym.P_FECHA_MOD); }
"CLASE"                 { yybegin(UI_WEB);   return symbol("",ParserAccionesSym.P_CLASE); }
}

<MI_ATRIBUTO>{
// atributo.nombre="MI_ATRIBUTO"
"PADRE"       { yybegin(MI_ID);         return symbol("",ParserAccionesSym.A_PADRE); }
"TEXTO"       { yybegin(MI_TEXTO);      return symbol("",ParserAccionesSym.A_TEXTO); }
"ALTURA"      { yybegin(MI_NUMERO);     return symbol("",ParserAccionesSym.A_ALTO); }
"ANCHO"       { yybegin(MI_NUMERO);     return symbol("",ParserAccionesSym.A_ANCHO); }
"COLOR"       { yybegin(MI_COLOR);      return symbol("",ParserAccionesSym.A_COLOR); }
"ORIGEN"      { yybegin(MI_URL);        return symbol("",ParserAccionesSym.A_ORIGEN); }
"ETIQUETAS"   { yybegin(MIS_ETIQUETAS); return symbol("",ParserAccionesSym.A_ETIQS); }
"ALINEACION"  { yybegin(MI_ALIGN);      return symbol("",ParserAccionesSym.A_ALIGN); }
}

<MI_ID, MI_FECHA, MI_TEXTO, MI_COLOR, MI_NUMERO, MI_URL, MIS_ETIQUETAS, MI_ALIGN, UI_WEB>{
"]"  { yybegin(YYINITIAL);  return symbol("",ParserAccionesSym.DERCOR); }
}

<UI_WEB> {
// parametro.nombre="clase".[UI_WEB]
"TITULO"   { return symbol("",ParserAccionesSym.UI_TITULO); }
"PARRAFO"  { return symbol("",ParserAccionesSym.UI_PARRAFO); }
"IMAGEN"   { return symbol("",ParserAccionesSym.UI_IMAGEN); }
"VIDEO"    { return symbol("",ParserAccionesSym.UI_VIDEO); }
"MENU"     { return symbol("",ParserAccionesSym.UI_MENU); }
}

<MI_ALIGN>{
// atributo.nombre="alineacion".[MI_ALIGN]
"IZQUIERDA"   { return symbol("",ParserAccionesSym.T_IZQUIERDA); }
"CENTRAR"     { return symbol("",ParserAccionesSym.T_CENTRAR); }
"DERECHA"     { return symbol("",ParserAccionesSym.T_DERECHA); }
"JUSTIFICAR"  { return symbol("",ParserAccionesSym.T_JUSTIFICAR); }
}

<MI_ID> {
    {id}            { return symbol("",ParserAccionesSym.MI_ID, yytext()); }
}
<MI_FECHA> {
    {miFecha}       { return symbol("",ParserAccionesSym.MI_FECHA, yytext()); }
}
<MI_TEXTO> {
    {miTexto}    { return symbol("",ParserAccionesSym.MI_TEXTO, yytext()); }
}
<MI_COLOR> {
    {miColor}       { return symbol("",ParserAccionesSym.MI_COLOR, yytext()); }
}
<MI_NUMERO> {
    {miNumero}      { return symbol("",ParserAccionesSym.MI_NUMERO, yytext()); }
}
<MI_URL> {
    {miURL}         { return symbol("",ParserAccionesSym.MI_URL, yytext()); }
}
<MI_ETIQUETA>{
{miEtiqueta}        { yybegin(YYINITIAL); return symbol("",ParserAccionesSym.MI_ETIQUETA, yytext().toLowerCase()); }
}
<MIS_ETIQUETAS> {
{miEtiqueta}        { return symbol("",ParserAccionesSym.MI_ETIQUETA, yytext()); }
\|                  { return symbol("",ParserAccionesSym.OR); }
}

// puntuacion
"<"  { return symbol("",ParserAccionesSym.IZQ); }
">"  { return symbol("",ParserAccionesSym.DER); }
"/"  { return symbol("",ParserAccionesSym.BARRA); }
\"   { return symbol("",ParserAccionesSym.COMI); }
"["  { return symbol("",ParserAccionesSym.IZQCOR); }
"]"  { return symbol("",ParserAccionesSym.DERCOR); }
\=   { return symbol("",ParserAccionesSym.IGUAL); }

// ignorados
{Invisible}+  { }

// error
[^]  { log("@lexer: ").append(getPunto().toString()).append("\n"); return symbol("",ParserAccionesSym.error); }
