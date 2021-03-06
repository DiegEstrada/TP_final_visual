package aplicacion.modelo.dominio;
// Generated 12/06/2019 18:02:32 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Producto  implements java.io.Serializable {


     private Integer idProducto;
     private Almacen almacen;
     private TipoHelado tipoHelado;
     private String nombre;
     private String descripcion;
     private Double precio;
     private byte estado;
     private Set ventaProductos = new HashSet(0);
     private Set catalogos = new HashSet(0);

    public Producto() {
    }

	
    public Producto(Almacen almacen, TipoHelado tipoHelado, byte estado) {
        this.almacen = almacen;
        this.tipoHelado = tipoHelado;
        this.estado = estado;
    }
    public Producto(Almacen almacen, TipoHelado tipoHelado, String nombre, String descripcion, Double precio, byte estado, Set ventaProductos, Set catalogos) {
       this.almacen = almacen;
       this.tipoHelado = tipoHelado;
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.precio = precio;
       this.estado = estado;
       this.ventaProductos = ventaProductos;
       this.catalogos = catalogos;
    }
   
    public Integer getIdProducto() {
        return this.idProducto;
    }
    
    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }
    public Almacen getAlmacen() {
        return this.almacen;
    }
    
    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }
    public TipoHelado getTipoHelado() {
        return this.tipoHelado;
    }
    
    public void setTipoHelado(TipoHelado tipoHelado) {
        this.tipoHelado = tipoHelado;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Double getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public byte getEstado() {
        return this.estado;
    }
    
    public void setEstado(byte estado) {
        this.estado = estado;
    }
    public Set getVentaProductos() {
        return this.ventaProductos;
    }
    
    public void setVentaProductos(Set ventaProductos) {
        this.ventaProductos = ventaProductos;
    }
    public Set getCatalogos() {
        return this.catalogos;
    }
    
    public void setCatalogos(Set catalogos) {
        this.catalogos = catalogos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.idProducto);
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
        final Producto other = (Producto) obj;
        if (!Objects.equals(this.idProducto, other.idProducto)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", almacen=" + almacen + ", tipoHelado=" + tipoHelado + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio + ", estado=" + estado + ", ventaProductos=" + ventaProductos + ", catalogos=" + catalogos + '}';
    }




}


