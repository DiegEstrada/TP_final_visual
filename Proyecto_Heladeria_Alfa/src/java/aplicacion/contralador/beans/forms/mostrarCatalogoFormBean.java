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
         
        private List<Catalogo> catalogos;
        private List<Catalogo> tipoAgua;
        private List<Catalogo> tipoCrema;
        private List<Catalogo> tipoLeche;
        private List<Catalogo> tipoGranizado;
         
        
        @PostConstruct
        public void init() {
            tipoLeche=new ArrayList<>();
            
        obtenerListaDeCatalogos();
       
        obtenerCatalogoPorAgua();
        obtenerCatalogoPorCrema();
        obtenerCatalogoPorGranizado();
        obtenerCatalogoPorLeche();
        
        }      

    /**
     * Creates a new instance of mostrarCatalogoFormBean
     */
    public mostrarCatalogoFormBean() {
          
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
    
    private void obtenerListaDeCatalogos() {
         this.catalogoBean.obtenerCatalogos();
    }
    
  
     private void obtenerCatalogoPorLeche(){
       
        for(int i = 0; i < catalogoBean.obtenerCatalogos().size(); i++){
            if(catalogoBean.obtenerCatalogos().get(i).getProducto().getTipoHelado().getNombre().equalsIgnoreCase("Helado de Leche")){
                tipoLeche.add(catalogoBean.obtenerCatalogos().get(i));
            }
        }
        
    }
     private void obtenerCatalogoPorAgua(){
       
        for(int i = 0; i < catalogoBean.obtenerCatalogos().size(); i++){
            if(catalogoBean.obtenerCatalogos().get(i).getProducto().getTipoHelado().getNombre().equalsIgnoreCase("Helado de Agua")){
                tipoLeche.add(catalogoBean.obtenerCatalogos().get(i));
            }
        }
    }
     private void obtenerCatalogoPorCrema(){
       
        for(int i = 0; i < catalogoBean.obtenerCatalogos().size(); i++){
            if(catalogoBean.obtenerCatalogos().get(i).getProducto().getTipoHelado().getNombre().equalsIgnoreCase("Helado de Crema")){
                tipoLeche.add(catalogoBean.obtenerCatalogos().get(i));
            }
        }
    }
    private void obtenerCatalogoPorGranizado(){
       
        for(int i = 0; i < catalogoBean.obtenerCatalogos().size(); i++){
            if(catalogoBean.obtenerCatalogos().get(i).getProducto().getTipoHelado().getNombre().equalsIgnoreCase("Granizado")){
                tipoLeche.add(catalogoBean.obtenerCatalogos().get(i));
            }
        }
    }
    

    /**
     * @return the tipoAgua
     */
    public List<Catalogo> getTipoAgua() {
        return tipoAgua;
    }

    /**
     * @param tipoAgua the tipoAgua to set
     */
    public void setTipoAgua(List<Catalogo> tipoAgua) {
        this.tipoAgua = tipoAgua;
    }

    /**
     * @return the tipoCrema
     */
    public List<Catalogo> getTipoCrema() {
        return tipoCrema;
    }

    /**
     * @param tipoCrema the tipoCrema to set
     */
    public void setTipoCrema(List<Catalogo> tipoCrema) {
        this.tipoCrema = tipoCrema;
    }

    /**
     * @return the tipoLeche
     */
    public List<Catalogo> getTipoLeche() {
        return tipoLeche;
    }

    /**
     * @param tipoLeche the tipoLeche to set
     */
    public void setTipoLeche(List<Catalogo> tipoLeche) {
        this.tipoLeche = tipoLeche;
    }

    /**
     * @return the tipoGranizado
     */
    public List<Catalogo> getTipoGranizado() {
        return tipoGranizado;
    }

    /**
     * @param tipoGranizado the tipoGranizado to set
     */
    public void setTipoGranizado(List<Catalogo> tipoGranizado) {
        this.tipoGranizado = tipoGranizado;
    }
    
}
