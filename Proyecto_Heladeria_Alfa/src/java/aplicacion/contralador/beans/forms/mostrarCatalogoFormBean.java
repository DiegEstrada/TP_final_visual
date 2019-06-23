/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.contralador.beans.forms;

import aplicacion.contralador.beans.CatalogoBean;
import aplicacion.modelo.dominio.Catalogo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Diego
 */
@ManagedBean
@SessionScoped
public class mostrarCatalogoFormBean  implements Serializable{
         @ManagedProperty(value = "#{catalogoBean}")
         private CatalogoBean catalogoBean;
        
        
        List<Catalogo> catalogos;
        Catalogo catalogo;
        
        @PostConstruct
        public void init() {
        //catalogo = new Catalogo();
        //catalogoBean.crearCatalogo(catalogo);
        obtenerListaDeCatalogos();
        }      

    /**
     * Creates a new instance of mostrarCatalogoFormBean
     */
    public mostrarCatalogoFormBean() {
         catalogos = new ArrayList<>(); 
         catalogo=new Catalogo();
    }

    public CatalogoBean getCatalogoBean() {
        return catalogoBean;
    }

    public void setCatalogoBean(CatalogoBean catalogoBean) {
        this.catalogoBean = catalogoBean;
    }

    public List<Catalogo> getCatalogos() {
        return catalogos;
    }

    public void setCatalogos(List<Catalogo> catalogos) {
        this.catalogos = catalogos;
    }

    public Catalogo getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(Catalogo catalogo) {
        this.catalogo = catalogo;
    }

    private void obtenerListaDeCatalogos() {
         catalogos = catalogoBean.obtenerCatalogos();
    }
    
    
}
