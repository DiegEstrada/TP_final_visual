package aplicacion.modelo.dominio;
// Generated 12/06/2019 18:02:32 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Venta generated by hbm2java
 */
public class Venta  implements java.io.Serializable {


     private int idVenta;
     private Catalogo catalogo;
     private Usuario usuarioByIdCliente;
     private Usuario usuarioByIdVendedor;
     private Date fecha;
     private Set ventaProductos = new HashSet(0);

    public Venta() {
    }

	
    public Venta(int idVenta, Catalogo catalogo, Usuario usuarioByIdCliente, Usuario usuarioByIdVendedor) {
        this.idVenta = idVenta;
        this.catalogo = catalogo;
        this.usuarioByIdCliente = usuarioByIdCliente;
        this.usuarioByIdVendedor = usuarioByIdVendedor;
    }
    public Venta(int idVenta, Catalogo catalogo, Usuario usuarioByIdCliente, Usuario usuarioByIdVendedor, Date fecha, Set ventaProductos) {
       this.idVenta = idVenta;
       this.catalogo = catalogo;
       this.usuarioByIdCliente = usuarioByIdCliente;
       this.usuarioByIdVendedor = usuarioByIdVendedor;
       this.fecha = fecha;
       this.ventaProductos = ventaProductos;
    }
   
    public int getIdVenta() {
        return this.idVenta;
    }
    
    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }
    public Catalogo getCatalogo() {
        return this.catalogo;
    }
    
    public void setCatalogo(Catalogo catalogo) {
        this.catalogo = catalogo;
    }
    public Usuario getUsuarioByIdCliente() {
        return this.usuarioByIdCliente;
    }
    
    public void setUsuarioByIdCliente(Usuario usuarioByIdCliente) {
        this.usuarioByIdCliente = usuarioByIdCliente;
    }
    public Usuario getUsuarioByIdVendedor() {
        return this.usuarioByIdVendedor;
    }
    
    public void setUsuarioByIdVendedor(Usuario usuarioByIdVendedor) {
        this.usuarioByIdVendedor = usuarioByIdVendedor;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Set getVentaProductos() {
        return this.ventaProductos;
    }
    
    public void setVentaProductos(Set ventaProductos) {
        this.ventaProductos = ventaProductos;
    }




}


