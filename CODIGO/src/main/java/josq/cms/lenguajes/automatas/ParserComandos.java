
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package josq.cms.lenguajes.automatas;

import java.util.ArrayList;
import josq.cms.lenguajes.automatas.modelos.Indicador;
import josq.cms.lenguajes.automatas.modelos.cup.Comando;
import josq.cms.lenguajes.automatas.modelos.cup.Par;
import josq.cms.lenguajes.automatas.modelos.cup.Atributo;
import josq.cms.lenguajes.automatas.modelos.cup.Parametro;
import josq.cms.lenguajes.automatas.modelos.cup.Accion;
import josq.cms.lenguajes.controladores.EjecutarComandos;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class ParserComandos extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return ParserComandosSym.class;
}

  /** Default constructor. */
  @Deprecated
  public ParserComandos() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public ParserComandos(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public ParserComandos(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\034\000\002\002\004\000\002\002\003\000\002\002" +
    "\004\000\002\003\006\000\002\003\004\000\002\004\003" +
    "\000\002\004\003\000\002\004\003\000\002\004\004\000" +
    "\002\004\004\000\002\004\004\000\002\004\004\000\002" +
    "\004\004\000\002\004\004\000\002\005\003\000\002\005" +
    "\003\000\002\005\003\000\002\005\003\000\002\007\004" +
    "\000\002\007\005\000\002\007\004\000\002\006\005\000" +
    "\002\012\004\000\002\012\005\000\002\012\004\000\002" +
    "\010\006\000\002\011\004\000\002\011\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\053\000\006\003\006\004\004\001\002\000\012\011" +
    "\014\012\017\013\015\014\016\001\002\000\010\002\012" +
    "\003\006\004\004\001\002\000\004\005\010\001\002\000" +
    "\010\002\000\003\000\004\000\001\002\000\010\002\ufffd" +
    "\003\ufffd\004\ufffd\001\002\000\010\002\uffff\003\uffff\004" +
    "\uffff\001\002\000\004\002\001\001\002\000\004\006\026" +
    "\001\002\000\004\006\ufffc\001\002\000\004\006\ufffa\001" +
    "\002\000\016\015\021\016\020\017\022\020\023\021\024" +
    "\022\025\001\002\000\004\006\ufffb\001\002\000\004\006" +
    "\ufff8\001\002\000\004\006\ufff9\001\002\000\004\006\ufff7" +
    "\001\002\000\004\006\ufff6\001\002\000\004\006\ufff5\001" +
    "\002\000\004\006\ufff4\001\002\000\004\023\055\001\002" +
    "\000\004\005\054\001\002\000\006\005\ufff1\007\053\001" +
    "\002\000\006\005\ufff3\006\046\001\002\000\006\005\ufff0" +
    "\007\045\001\002\000\006\005\ufff2\006\034\001\002\000" +
    "\004\023\037\001\002\000\010\005\uffe9\006\uffe9\007\036" +
    "\001\002\000\006\005\uffea\006\uffea\001\002\000\004\010" +
    "\044\001\002\000\004\023\041\001\002\000\006\006\042" +
    "\010\043\001\002\000\010\005\uffe8\006\uffe8\007\uffe8\001" +
    "\002\000\004\023\uffe6\001\002\000\004\023\uffe7\001\002" +
    "\000\006\005\uffeb\006\uffeb\001\002\000\004\023\051\001" +
    "\002\000\010\005\uffed\006\uffed\007\050\001\002\000\006" +
    "\005\uffee\006\uffee\001\002\000\004\006\052\001\002\000" +
    "\010\005\uffec\006\uffec\007\uffec\001\002\000\006\005\uffef" +
    "\006\uffef\001\002\000\010\002\ufffe\003\ufffe\004\ufffe\001" +
    "\002\000\006\006\052\010\044\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\053\000\006\002\004\003\006\001\001\000\004\004" +
    "\012\001\001\000\004\003\010\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\014\005\026\006\027\007\030\010\031" +
    "\012\032\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\011\037\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\006\046\001\001\000" +
    "\002\001\001\000\004\010\034\001\001\000\004\011\037" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$ParserComandos$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$ParserComandos$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$ParserComandos$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$ParserComandos$actions {


    void print(String texto){ System.out.print(texto); } 

    StringBuilder log(String text) 
    {
        EjecutarComandos.logSintaxis.append(text); 
        return EjecutarComandos.logSintaxis; 
    }

  private final ParserComandos parser;

  /** Constructor */
  CUP$ParserComandos$actions(ParserComandos parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$ParserComandos$do_action_part00000000(
    int                        CUP$ParserComandos$act_num,
    java_cup.runtime.lr_parser CUP$ParserComandos$parser,
    java.util.Stack            CUP$ParserComandos$stack,
    int                        CUP$ParserComandos$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$ParserComandos$result;

      /* select the action based on the action number */
      switch (CUP$ParserComandos$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= sqcms EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)).right;
		ArrayList<Comando> start_val = (ArrayList<Comando>)((java_cup.runtime.Symbol) CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)).value;
		RESULT = start_val;
              CUP$ParserComandos$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)), ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$ParserComandos$parser.done_parsing();
          return CUP$ParserComandos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // sqcms ::= comando 
            {
              ArrayList<Comando> RESULT =null;
		int w1left = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.peek()).left;
		int w1right = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.peek()).right;
		Comando w1 = (Comando)((java_cup.runtime.Symbol) CUP$ParserComandos$stack.peek()).value;
		 ArrayList<Comando> list = new ArrayList<>(); list.add(w1); RESULT=list; 
              CUP$ParserComandos$result = parser.getSymbolFactory().newSymbol("sqcms",0, ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.peek()), RESULT);
            }
          return CUP$ParserComandos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // sqcms ::= sqcms comando 
            {
              ArrayList<Comando> RESULT =null;
		int w1left = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)).left;
		int w1right = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)).right;
		ArrayList<Comando> w1 = (ArrayList<Comando>)((java_cup.runtime.Symbol) CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)).value;
		int w2left = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.peek()).left;
		int w2right = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.peek()).right;
		Comando w2 = (Comando)((java_cup.runtime.Symbol) CUP$ParserComandos$stack.peek()).value;
		 w1.add(w2); RESULT=w1; 
              CUP$ParserComandos$result = parser.getSymbolFactory().newSymbol("sqcms",0, ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)), ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.peek()), RESULT);
            }
          return CUP$ParserComandos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // comando ::= CONSULT operador argumentos PUNCOM 
            {
              Comando RESULT =null;
		int w1left = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-2)).left;
		int w1right = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-2)).right;
		Indicador w1 = (Indicador)((java_cup.runtime.Symbol) CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-2)).value;
		int w2left = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)).left;
		int w2right = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)).right;
		Par w2 = (Par)((java_cup.runtime.Symbol) CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)).value;
		 RESULT= new Comando(w1, w2);  
              CUP$ParserComandos$result = parser.getSymbolFactory().newSymbol("comando",1, ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-3)), ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.peek()), RESULT);
            }
          return CUP$ParserComandos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // comando ::= error PUNCOM 
            {
              Comando RESULT =null;
		int w1left = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)).left;
		int w1right = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)).right;
		Object w1 = (Object)((java_cup.runtime.Symbol) CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)).value;
		 log("@parser: l="+w1left+",r="+w1right+"\n"); RESULT= new Comando(); 
              CUP$ParserComandos$result = parser.getSymbolFactory().newSymbol("comando",1, ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)), ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.peek()), RESULT);
            }
          return CUP$ParserComandos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // operador ::= SITE_VIEWS 
            {
              Indicador RESULT =null;
		 RESULT=Indicador.SQ_SITE_VIEWS; 
              CUP$ParserComandos$result = parser.getSymbolFactory().newSymbol("operador",2, ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.peek()), RESULT);
            }
          return CUP$ParserComandos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // operador ::= PAGE_VIEWS 
            {
              Indicador RESULT =null;
		 RESULT=Indicador.SQ_PAGE_VIEWS; 
              CUP$ParserComandos$result = parser.getSymbolFactory().newSymbol("operador",2, ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.peek()), RESULT);
            }
          return CUP$ParserComandos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // operador ::= PAGE_POP 
            {
              Indicador RESULT =null;
		 RESULT=Indicador.SQ_PAGE_POP; 
              CUP$ParserComandos$result = parser.getSymbolFactory().newSymbol("operador",2, ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.peek()), RESULT);
            }
          return CUP$ParserComandos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // operador ::= COMP TODOS 
            {
              Indicador RESULT =null;
		 RESULT=Indicador.SQ_TODOS; 
              CUP$ParserComandos$result = parser.getSymbolFactory().newSymbol("operador",2, ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)), ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.peek()), RESULT);
            }
          return CUP$ParserComandos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // operador ::= COMP TITULO 
            {
              Indicador RESULT =null;
		 RESULT=Indicador.SQ_TITULO; 
              CUP$ParserComandos$result = parser.getSymbolFactory().newSymbol("operador",2, ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)), ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.peek()), RESULT);
            }
          return CUP$ParserComandos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // operador ::= COMP MENU 
            {
              Indicador RESULT =null;
		 RESULT=Indicador.SQ_MENU; 
              CUP$ParserComandos$result = parser.getSymbolFactory().newSymbol("operador",2, ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)), ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.peek()), RESULT);
            }
          return CUP$ParserComandos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // operador ::= COMP IMAGEN 
            {
              Indicador RESULT =null;
		 RESULT=Indicador.SQ_IMAGEN; 
              CUP$ParserComandos$result = parser.getSymbolFactory().newSymbol("operador",2, ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)), ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.peek()), RESULT);
            }
          return CUP$ParserComandos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // operador ::= COMP VIDEO 
            {
              Indicador RESULT =null;
		 RESULT=Indicador.SQ_VIDEO; 
              CUP$ParserComandos$result = parser.getSymbolFactory().newSymbol("operador",2, ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)), ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.peek()), RESULT);
            }
          return CUP$ParserComandos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // operador ::= COMP PARRAFO 
            {
              Indicador RESULT =null;
		 RESULT=Indicador.SQ_PARRAFO; 
              CUP$ParserComandos$result = parser.getSymbolFactory().newSymbol("operador",2, ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)), ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.peek()), RESULT);
            }
          return CUP$ParserComandos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // argumentos ::= idList 
            {
              Par RESULT =null;
		int w1left = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.peek()).left;
		int w1right = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.peek()).right;
		ArrayList<String> w1 = (ArrayList<String>)((java_cup.runtime.Symbol) CUP$ParserComandos$stack.peek()).value;
		 RESULT= new Par(Indicador.SQ_ARG_SITES,w1); 
              CUP$ParserComandos$result = parser.getSymbolFactory().newSymbol("argumentos",3, ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.peek()), RESULT);
            }
          return CUP$ParserComandos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // argumentos ::= pathList 
            {
              Par RESULT =null;
		int w1left = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.peek()).left;
		int w1right = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.peek()).right;
		ArrayList<ArrayList<String>> w1 = (ArrayList<ArrayList<String>>)((java_cup.runtime.Symbol) CUP$ParserComandos$stack.peek()).value;
		 RESULT= new Par(Indicador.SQ_ARG_PATHS,w1); 
              CUP$ParserComandos$result = parser.getSymbolFactory().newSymbol("argumentos",3, ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.peek()), RESULT);
            }
          return CUP$ParserComandos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // argumentos ::= idWebModel 
            {
              Par RESULT =null;
		int w1left = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.peek()).left;
		int w1right = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.peek()).right;
		String w1 = (String)((java_cup.runtime.Symbol) CUP$ParserComandos$stack.peek()).value;
		 RESULT= new Par(Indicador.SQ_ARG_SITE,w1); 
              CUP$ParserComandos$result = parser.getSymbolFactory().newSymbol("argumentos",3, ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.peek()), RESULT);
            }
          return CUP$ParserComandos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // argumentos ::= path 
            {
              Par RESULT =null;
		int w1left = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.peek()).left;
		int w1right = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.peek()).right;
		ArrayList<String> w1 = (ArrayList<String>)((java_cup.runtime.Symbol) CUP$ParserComandos$stack.peek()).value;
		 RESULT= new Par(Indicador.SQ_ARG_PATH,w1); 
              CUP$ParserComandos$result = parser.getSymbolFactory().newSymbol("argumentos",3, ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.peek()), RESULT);
            }
          return CUP$ParserComandos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // idList ::= idWebModel COMA 
            {
              ArrayList<String> RESULT =null;
		int w1left = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)).left;
		int w1right = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)).right;
		String w1 = (String)((java_cup.runtime.Symbol) CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)).value;
		 ArrayList<String> list = new ArrayList<>(); list.add(w1); RESULT=list; 
              CUP$ParserComandos$result = parser.getSymbolFactory().newSymbol("idList",5, ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)), ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.peek()), RESULT);
            }
          return CUP$ParserComandos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // idList ::= idList idWebModel COMA 
            {
              ArrayList<String> RESULT =null;
		int w1left = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-2)).left;
		int w1right = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-2)).right;
		ArrayList<String> w1 = (ArrayList<String>)((java_cup.runtime.Symbol) CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-2)).value;
		int w2left = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)).left;
		int w2right = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)).right;
		String w2 = (String)((java_cup.runtime.Symbol) CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)).value;
		 w1.add(w2); RESULT=w1; 
              CUP$ParserComandos$result = parser.getSymbolFactory().newSymbol("idList",5, ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-2)), ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.peek()), RESULT);
            }
          return CUP$ParserComandos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // idList ::= idList idWebModel 
            {
              ArrayList<String> RESULT =null;
		int w1left = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)).left;
		int w1right = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)).right;
		ArrayList<String> w1 = (ArrayList<String>)((java_cup.runtime.Symbol) CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)).value;
		int w2left = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.peek()).left;
		int w2right = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.peek()).right;
		String w2 = (String)((java_cup.runtime.Symbol) CUP$ParserComandos$stack.peek()).value;
		 w1.add(w2); RESULT=w1; 
              CUP$ParserComandos$result = parser.getSymbolFactory().newSymbol("idList",5, ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)), ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.peek()), RESULT);
            }
          return CUP$ParserComandos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // idWebModel ::= COMI ID COMI 
            {
              String RESULT =null;
		int w1left = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)).left;
		int w1right = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)).right;
		String w1 = (String)((java_cup.runtime.Symbol) CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)).value;
		 RESULT=w1; 
              CUP$ParserComandos$result = parser.getSymbolFactory().newSymbol("idWebModel",4, ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-2)), ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.peek()), RESULT);
            }
          return CUP$ParserComandos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // pathList ::= path COMA 
            {
              ArrayList<ArrayList<String>> RESULT =null;
		int w1left = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)).left;
		int w1right = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)).right;
		ArrayList<String> w1 = (ArrayList<String>)((java_cup.runtime.Symbol) CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)).value;
		ArrayList<ArrayList<String>> list = new ArrayList<>(); list.add(w1); RESULT=list; 
              CUP$ParserComandos$result = parser.getSymbolFactory().newSymbol("pathList",8, ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)), ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.peek()), RESULT);
            }
          return CUP$ParserComandos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // pathList ::= pathList path COMA 
            {
              ArrayList<ArrayList<String>> RESULT =null;
		int w1left = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-2)).left;
		int w1right = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-2)).right;
		ArrayList<ArrayList<String>> w1 = (ArrayList<ArrayList<String>>)((java_cup.runtime.Symbol) CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-2)).value;
		int w2left = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)).left;
		int w2right = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)).right;
		ArrayList<String> w2 = (ArrayList<String>)((java_cup.runtime.Symbol) CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)).value;
		 w1.add(w2); RESULT=w1; 
              CUP$ParserComandos$result = parser.getSymbolFactory().newSymbol("pathList",8, ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-2)), ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.peek()), RESULT);
            }
          return CUP$ParserComandos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // pathList ::= pathList path 
            {
              ArrayList<ArrayList<String>> RESULT =null;
		int w1left = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)).left;
		int w1right = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)).right;
		ArrayList<ArrayList<String>> w1 = (ArrayList<ArrayList<String>>)((java_cup.runtime.Symbol) CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)).value;
		int w2left = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.peek()).left;
		int w2right = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.peek()).right;
		ArrayList<String> w2 = (ArrayList<String>)((java_cup.runtime.Symbol) CUP$ParserComandos$stack.peek()).value;
		 w1.add(w2); RESULT=w1; 
              CUP$ParserComandos$result = parser.getSymbolFactory().newSymbol("pathList",8, ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)), ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.peek()), RESULT);
            }
          return CUP$ParserComandos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // path ::= COMI dottedList ID COMI 
            {
              ArrayList<String> RESULT =null;
		int w1left = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-2)).left;
		int w1right = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-2)).right;
		ArrayList<String> w1 = (ArrayList<String>)((java_cup.runtime.Symbol) CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-2)).value;
		int w2left = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)).left;
		int w2right = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)).right;
		String w2 = (String)((java_cup.runtime.Symbol) CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)).value;
		 w1.add(w2); RESULT=w1; 
              CUP$ParserComandos$result = parser.getSymbolFactory().newSymbol("path",6, ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-3)), ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.peek()), RESULT);
            }
          return CUP$ParserComandos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // dottedList ::= ID DOT 
            {
              ArrayList<String> RESULT =null;
		int w1left = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)).left;
		int w1right = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)).right;
		String w1 = (String)((java_cup.runtime.Symbol) CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)).value;
		 ArrayList<String> list = new ArrayList<>(); list.add(w1); RESULT=list; 
              CUP$ParserComandos$result = parser.getSymbolFactory().newSymbol("dottedList",7, ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)), ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.peek()), RESULT);
            }
          return CUP$ParserComandos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // dottedList ::= dottedList ID DOT 
            {
              ArrayList<String> RESULT =null;
		int w1left = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-2)).left;
		int w1right = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-2)).right;
		ArrayList<String> w1 = (ArrayList<String>)((java_cup.runtime.Symbol) CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-2)).value;
		int w2left = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)).left;
		int w2right = ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)).right;
		String w2 = (String)((java_cup.runtime.Symbol) CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-1)).value;
		 w1.add(w2); RESULT=w1; 
              CUP$ParserComandos$result = parser.getSymbolFactory().newSymbol("dottedList",7, ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.elementAt(CUP$ParserComandos$top-2)), ((java_cup.runtime.Symbol)CUP$ParserComandos$stack.peek()), RESULT);
            }
          return CUP$ParserComandos$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$ParserComandos$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$ParserComandos$do_action(
    int                        CUP$ParserComandos$act_num,
    java_cup.runtime.lr_parser CUP$ParserComandos$parser,
    java.util.Stack            CUP$ParserComandos$stack,
    int                        CUP$ParserComandos$top)
    throws java.lang.Exception
    {
              return CUP$ParserComandos$do_action_part00000000(
                               CUP$ParserComandos$act_num,
                               CUP$ParserComandos$parser,
                               CUP$ParserComandos$stack,
                               CUP$ParserComandos$top);
    }
}

}
