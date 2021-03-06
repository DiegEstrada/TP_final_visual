package aplicacion.modelo.dominio;
// Generated 12/06/2019 18:02:32 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

public class TipoHelado  implements java.io.Serializable {


     private Integer idTipoHelado;
     private String nombre;
     private Set productos = new HashSet(0);

    public TipoHelado() {
    }

    public TipoHelado(String nombre, Set productos) {
       this.nombre = nombre;
       this.productos = productos;
    }
   
    public Integer getIdTipoHelado() {
        return this.idTipoHelado;
    }
    
    public void setIdTipoHelado(Integer idTipoHelado) {
        this.idTipoHelado = idTipoHelado;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set getProductos() {
        return this.productos;
    }
    
    public void setProductos(Set productos) {
        this.productos = productos;
    }




}


