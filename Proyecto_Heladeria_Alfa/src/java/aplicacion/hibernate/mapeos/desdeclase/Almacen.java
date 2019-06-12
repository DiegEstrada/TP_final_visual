package aplicacion.hibernate.mapeos.desdeclase;

import aplicacion.modelo.dominio.*;

public class Almacen  implements java.io.Serializable {


     private Integer idAlmacen;
     private Integer stock;

    public Almacen() {
    }

    public Almacen(Integer stock) {
       this.stock = stock;
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
}


