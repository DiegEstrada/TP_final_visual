package aplicacion.modelo.dominio;

import java.util.HashSet;
import java.util.Set;

public class Almacen  implements java.io.Serializable {


     private Integer idAlmacen;
     private Integer stock;
     private Set productos = new HashSet(0);

    public Almacen() {
    }

    public Almacen(Integer stock) {
       this.stock = stock;
    }
    public Almacen(Integer stock, Set productos) {
       this.stock = stock;
       this.productos = productos;
    }
   
    public Integer getIdAlmacen() {
        return this.idAlmacen;
    }
    
    public void setIdAlmacen(Integer idAlmacen) {
        this.idAlmacen = idAlmacen;
    }
    public Integer getStock() {
        return this.stock;
    }
    
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Set getProductos() {
        return productos;
    }

    public void setProductos(Set productos) {
        this.productos = productos;
    }
}


