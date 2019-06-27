/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.carrousel;


import aplicacion.contralador.beans.CatalogoBean;
import aplicacion.modelo.dominio.Catalogo;
import aplicacion.modelo.util.imagen.Helado;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Diego
 */
@ManagedBean
@ViewScoped
public class CarouselHeladoFomrBean implements Serializable {

    @ManagedProperty(value = "#{catalogoBean}")
    private CatalogoBean catalogoBean;
    
    private List<Catalogo> catalogos;

    //private List<Helado> helados;

    private Helado selectedHelado;

    
   

    @PostConstruct
    public void init() {
        //helados = service.createHelados(9);
        obtenerListaDeCatalogos();

    }

    public CarouselHeladoFomrBean() {
        catalogos=new ArrayList<>();
    }

        private void obtenerListaDeCatalogos() {
         catalogos = catalogoBean.obtenerCatalogos();
    }
    
    
 /*   public List<Helado> getHelados() {
        return helados;

    }*/

    

    public Helado getSelectedHelado() {
        return selectedHelado;
    }

    public void setSelectedHelado(Helado selectedHelado) {
        this.selectedHelado = selectedHelado;
    }

    public List<Catalogo> getCatalogos() {
        return catalogos;
    }

    public void setCatalogos(List<Catalogo> catalogos) {
        this.catalogos = catalogos;
    }

    public CatalogoBean getCatalogoBean() {
        return catalogoBean;
    }

    public void setCatalogoBean(CatalogoBean catalogoBean) {
        this.catalogoBean = catalogoBean;
    }
    

}
