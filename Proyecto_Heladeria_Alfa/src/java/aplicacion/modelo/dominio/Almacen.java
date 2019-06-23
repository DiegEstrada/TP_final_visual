package aplicacion.modelo.dominio;
// Generated 12/06/2019 18:02:32 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Almacen  implements java.io.Serializable {


     private Integer idAlmacen;
     private Integer stock;
    // private Set productos = new HashSet(0);

    public Almacen() {
    }

    public Almacen(Integer stock, Set productos) {
       this.stock = stock;
  //     this.productos = productos;
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
  /*  public Set getProductos() {
        return this.productos;
    }
    
    public void setProductos(Set productos) {
        this.productos = productos;
    }  */

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.idAlmacen);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Almacen other = (Almacen) obj;
        if (!Objects.equals(this.idAlmacen, other.idAlmacen)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Almacen{" + "idAlmacen=" + idAlmacen + ", stock=" + stock + ", productos=" + '}';
    }




}


