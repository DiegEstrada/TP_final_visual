package aplicacion.hibernate.mapeos.desdeclase;
// Generated 08/06/2019 20:22:06 by Hibernate Tools 4.3.1


import aplicacion.modelo.dominio.*;
import aplicacion.modelo.dominio.Producto;
import aplicacion.modelo.dominio.Promocion;
import java.util.HashSet;
import java.util.Set;

/**
 * Catalogo generated by hbm2java
 */
public class Catalogo  implements java.io.Serializable {


     private Integer idCatalogo;
     private Producto producto;
     private Promocion promocion;
     private String nombre;
     private boolean estado;
    public Catalogo() {
    }

	
    public Catalogo(Producto producto, Promocion promocion, boolean estado) {
        this.producto = producto;
        this.promocion = promocion;
        this.estado = estado;
    }
   
    public Integer getIdCatalogo() {
        return this.idCatalogo;
    }
    
    public void setIdCatalogo(Integer idCatalogo) {
        this.idCatalogo = idCatalogo;
    }
    public Producto getProducto() {
        return this.producto;
    }
    
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public Promocion getPromocion() {
        return this.promocion;
    }
    
    public void setPromocion(Promocion promocion) {
        this.promocion = promocion;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public boolean getEstado() {
        return this.estado;
    }
    
    public void setEstado(boolean estado) {
        this.estado = estado;
    }



}


