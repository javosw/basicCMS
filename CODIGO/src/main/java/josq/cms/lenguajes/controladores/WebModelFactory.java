/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package josq.cms.lenguajes.controladores;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import josq.cms.archivos.MiArchivo;
import josq.cms.archivos.Ruta;
import josq.cms.lenguajes.automatas.modelos.Indicador;
import josq.cms.lenguajes.automatas.modelos.cup.Accion;
import josq.cms.lenguajes.automatas.modelos.cup.Atributo;
import josq.cms.lenguajes.automatas.modelos.cup.Parametro;
import josq.cms.web.modelos.Componente;
import josq.cms.web.modelos.Pagina;
import josq.cms.web.modelos.Sitio;
import josq.cms.web.modelos.componentes.Imagen;
import josq.cms.web.modelos.componentes.Menu;
import josq.cms.web.modelos.componentes.Parrafo;
import josq.cms.web.modelos.componentes.Titulo;
import josq.cms.web.modelos.componentes.Video;

/**
 *
 * @author JavierOswaldo
 */
public class WebModelFactory
{
    
    public static Sitio newSitioForCreation(Accion miAccion)
    {
        ArrayList<Parametro> listParametros = miAccion.getParametros();
        Map<Indicador,Object> mapParametros = new HashMap<>();
        for (Parametro p : listParametros) mapParametros.put(p.getTipo(), p.getContenido());
        
        Object idSite = mapParametros.get(Indicador.P_ID);
        Object userNew = mapParametros.get(Indicador.P_USER_NEW);
        Object userMod = mapParametros.get(Indicador.P_USER_MOD);
        Object dateNew = mapParametros.get(Indicador.P_FECHA_NEW);
        Object dateMod = mapParametros.get(Indicador.P_FECHA_MOD);

        boolean is_idSite = idSite != null && idSite instanceof String;
        boolean is_userNew = userNew != null && userNew instanceof String;
        boolean is_userMod = userMod != null && userMod instanceof String;
        boolean is_dateNew = dateNew != null && dateNew instanceof String;
        boolean is_dateMod = dateMod != null && dateMod instanceof String;

        Sitio miSitio = null;
        if (is_idSite) 
        {
            miSitio = new Sitio((String) idSite);
            if(is_userNew) miSitio.setUserNew((String) userNew);
            if(is_userMod) miSitio.setUserMod((String) userMod);
            if(is_dateNew) miSitio.setDateNew((String) dateNew);
            if(is_dateMod) miSitio.setDateMod((String) dateMod);
        }
        
        return miSitio;
    }
    
    public static Sitio newSitioForDeletion(Accion miAccion)
    {
        ArrayList<Parametro> listParametros = miAccion.getParametros();
        Map<Indicador,Object> mapParametros = new HashMap<>();
        for (Parametro p : listParametros) mapParametros.put(p.getTipo(), p.getContenido());
        
        Object idSite = mapParametros.get(Indicador.P_ID);

        boolean is_idSite = idSite != null && idSite instanceof String;

        Sitio miSitio = null;
        if (is_idSite) 
        {
            miSitio = new Sitio((String) idSite);
        }
        
        return miSitio;
    }

    public static Pagina newPaginaForCreation(Accion miAccion)
    {
        ArrayList<Parametro> listParametros = miAccion.getParametros();
        Map<Indicador,Object> mapParametros = new HashMap<>();
        for (Parametro p : listParametros) mapParametros.put(p.getTipo(), p.getContenido());
        
        Object idPage = mapParametros.get(Indicador.P_ID);
        Object idPageRoot = mapParametros.get(Indicador.P_PADRE);
        Object idSite = mapParametros.get(Indicador.P_SITIO);
        Object title = mapParametros.get(Indicador.P_TITULO);
        Object userNew = mapParametros.get(Indicador.P_USER_NEW);
        Object userMod = mapParametros.get(Indicador.P_USER_MOD);
        Object dateNew = mapParametros.get(Indicador.P_FECHA_NEW);
        Object dateMod = mapParametros.get(Indicador.P_FECHA_MOD);
        ArrayList<String> labels = miAccion.getEtiquetas();

        boolean is_idPage = idPage != null && idPage instanceof String;
        boolean is_idSite = idSite != null && idSite instanceof String;
        boolean is_idPageRoot = idPageRoot != null && idPageRoot instanceof String;
        boolean is_title = title != null && title instanceof String;
        boolean is_userNew = userNew != null && userNew instanceof String;
        boolean is_userMod = userMod != null && userMod instanceof String;
        boolean is_dateNew = dateNew != null && dateNew instanceof String;
        boolean is_dateMod = dateMod != null && dateMod instanceof String;

        Pagina miPagina = null;
        if (is_idPage && is_idSite) 
        {
            miPagina = new Pagina((String) idPage, (String) idSite);
            if(is_idPageRoot) miPagina.setIdPageRoot((String) idPageRoot);
            if(is_title) miPagina.setTitle((String) title);
            if(is_userNew) miPagina.setUserNew((String) userNew);
            if(is_userMod) miPagina.setUserMod((String) userMod);
            if(is_dateNew) miPagina.setDateNew((String) dateNew);
            if(is_dateMod) miPagina.setDateMod((String) dateMod);
            for (String l : labels) miPagina.addEtiqueta(l);
        }
        
        return miPagina;
    }
    
    public static Pagina newPaginaForModification(Accion miAccion)
    {
        ArrayList<Parametro> listParametros = miAccion.getParametros();
        Map<Indicador,Object> mapParametros = new HashMap<>();
        for (Parametro p : listParametros) mapParametros.put(p.getTipo(), p.getContenido());
        
        Object idPage = mapParametros.get(Indicador.P_ID);
        Object title = mapParametros.get(Indicador.P_TITULO);
        ArrayList<String> labels = miAccion.getEtiquetas();

        boolean is_idPage = idPage != null && idPage instanceof String;
        boolean is_title = title != null && title instanceof String;

        Pagina miPagina = null;
        if (is_idPage) 
        {
            miPagina = new Pagina((String) idPage);
            if(is_title) miPagina.setTitle((String) title);
            for (String l : labels) miPagina.addEtiqueta(l);
        }
        
        return miPagina;
    }

    public static Pagina newPaginaForDeletion(Accion miAccion)
    {
        ArrayList<Parametro> listParametros = miAccion.getParametros();
        Map<Indicador,Object> mapParametros = new HashMap<>();
        for (Parametro p : listParametros) mapParametros.put(p.getTipo(), p.getContenido());
        
        Object idPage = mapParametros.get(Indicador.P_ID);

        boolean is_idPage = idPage != null && idPage instanceof String;

        Pagina miPagina = null;
        if (is_idPage) 
        {
            miPagina = new Pagina((String) idPage);
        }
        
        return miPagina;
    }
    
    public static Componente newComponente(Accion miAccion)
    {
        ArrayList<Parametro> paramsList = miAccion.getParametros();
        Map<Indicador,Object> paramsMap = new HashMap<>();
        for (Parametro p : paramsList) paramsMap.put(p.getTipo(), p.getContenido());
                
        Object idComp = paramsMap.get(Indicador.P_ID);
        Object idPage = paramsMap.get(Indicador.P_PAGINA);
        Object clase = paramsMap.get(Indicador.P_CLASE);
        
        boolean is_idComp = idComp != null && idComp instanceof String;
        boolean is_idPage = idPage != null && idPage instanceof String;
        boolean is_clase = clase != null && clase instanceof Indicador;

        Componente miComp = null;
        if(is_idComp && is_idPage && is_clase)
        {
            miComp = new Componente((String)idComp,(String)idPage);
            
            ArrayList<Atributo> atribsList = miAccion.getAtributos();
            Map<Indicador,Object> atribsMap = new HashMap<>();
            for (Atributo a : atribsList) atribsMap.put(a.getTipo(), a.getContenido());

            Object widget = getWidget((Indicador) clase, atribsMap);
            miComp.setWidget(widget);
        }
        
        return miComp;
    }
    
    private static Object getWidget(Indicador clase, Map<Indicador,Object> atribsMap)
    {
        if(clase == Indicador.UI_TITULO)
        {
            Object text = atribsMap.get(Indicador.A_TEXTO);
            Object align = atribsMap.get(Indicador.A_ALIGN);
            Object color = atribsMap.get(Indicador.A_COLOR);

            boolean is_text = text != null && text instanceof String;
            boolean is_align = align != null && align instanceof String;
            boolean is_color = color != null && color instanceof String;

            Titulo miTitulo = null;
            if (is_text) 
            {
                miTitulo = new Titulo((String) text);
                if(is_align) miTitulo.setAlign((Indicador) align);
                if(is_color) miTitulo.setColor((String) color);
            }
            return  miTitulo;
        }
        else if(clase == Indicador.UI_PARRAFO) 
        {
            Object text = atribsMap.get(Indicador.A_TEXTO);
            Object align = atribsMap.get(Indicador.A_ALIGN);
            Object color = atribsMap.get(Indicador.A_COLOR);

            boolean is_text = text != null && text instanceof String;
            boolean is_align = align != null && align instanceof String;
            boolean is_color = color != null && color instanceof String;

            Parrafo miParrafo = null;
            if (is_text) 
            {
                miParrafo = new Parrafo((String) text);
                if(is_align) miParrafo.setAlign((Indicador) align);
                if(is_color) miParrafo.setColor((String) color);
            }
            return miParrafo;
        }
        else if(clase == Indicador.UI_IMAGEN) 
        {
            Object url = atribsMap.get(Indicador.A_ORIGEN);
            Object align = atribsMap.get(Indicador.A_ALIGN);
            Object sizeX = atribsMap.get(Indicador.A_ANCHO);
            Object sizeY = atribsMap.get(Indicador.A_ALTO);

            boolean is_url = url != null && url instanceof String;
            boolean is_align = align != null && align instanceof Indicador;
            boolean is_sizeX = sizeX != null && sizeX instanceof String;
            boolean is_sizeY = sizeY != null && sizeY instanceof String;

            Imagen miImagen = null;
            if (is_url) 
            {
                miImagen = new Imagen((String) url);
                try
                {
                    if(is_sizeX && is_sizeY) miImagen.setArea(Integer.parseInt((String) sizeX), Integer.parseInt((String) sizeY));
                }
                catch (Exception ex) 
                {
                    System.out.print("@Integer.parseInt: ");
                    System.out.println(ex.getMessage());
                }
                if(is_align) miImagen.setAlign((Indicador) align);
            }
            return  miImagen;
        }
        else if(clase == Indicador.UI_VIDEO) 
        {
            Object url = atribsMap.get(Indicador.A_ORIGEN);
            Object sizeX = atribsMap.get(Indicador.A_ANCHO);
            Object sizeY = atribsMap.get(Indicador.A_ALTO);

            boolean is_url = url != null && url instanceof String;
            boolean is_sizeX = sizeX != null && sizeX instanceof String;
            boolean is_sizeY = sizeY != null && sizeY instanceof String;

            Video miVideo = null;
            if (is_url) 
            {
                miVideo = new Video((String) url);
                try
                {
                    if(is_sizeX && is_sizeY) miVideo.setArea(Integer.parseInt((String) sizeX), Integer.parseInt((String) sizeY));
                }
                catch (Exception ex) 
                {
                    System.out.print("@Integer.parseInt: ");
                    System.out.println(ex.getMessage());
                }
            }
            return  miVideo;
        }
        else if(clase == Indicador.UI_MENU) 
        {
            Object idPageRoot = atribsMap.get(Indicador.A_PADRE);
            Object labels = atribsMap.get(Indicador.A_ETIQS);

            boolean is_idPageRoot = idPageRoot != null && idPageRoot instanceof String;
            boolean is_labels = labels != null && labels instanceof ArrayList;

            Menu miMenu = null;
            if(is_idPageRoot)
            {
                miMenu = new Menu((String) idPageRoot);
                
                if(!is_labels) return miMenu;

                Set<String> labelsSet = new HashSet<>((ArrayList<String>) labels);
                Set<String> pagesCollected = new HashSet<>();                
                collectLabeledPages((String) idPageRoot, labelsSet, pagesCollected);
                miMenu.getPaginas().addAll(pagesCollected);
            }
            return miMenu;
        }
        
        return null;
    }
    
    private static void collectLabeledPages(String idPagina, Set<String> labels, Set<String> menuPages)
    {
        String file = Ruta.cms+idPagina;
        File pageFile = new File(file); 
        if (!pageFile.exists()) return;
        
        try
        {
            Pagina miPagina = (Pagina) MiArchivo.readObject(file);
            
            for(String l : labels) if(miPagina.hasEtiqueta(l)) { menuPages.add(idPagina); break; }
            
            Set<String> subPaginas = miPagina.getPaginas();
            for (String subPage : subPaginas) collectLabeledPages(subPage, labels, menuPages);
        }
        catch (Exception ex)
        {
            System.out.print("@collectLabeledPages: ");
            System.out.println(ex.getMessage());
        }
    }

    public static Componente newComponenteForDeletion(Accion miAccion)
    {
        ArrayList<Parametro> listParametros = miAccion.getParametros();
        Map<Indicador,Object> mapParametros = new HashMap<>();
        for (Parametro p : listParametros) mapParametros.put(p.getTipo(), p.getContenido());
                
        Object idComp = mapParametros.get(Indicador.P_ID);
        Object idPage = mapParametros.get(Indicador.P_PAGINA);
        
        boolean is_idComp = idComp != null && idComp instanceof String;
        boolean is_idPage = idPage != null && idPage instanceof String;

        Componente miComp = null;
        if(is_idComp && is_idPage)
        {
            miComp = new Componente((String)idComp,(String)idPage);
        }
        
        return miComp;
    }
}
