/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.test;

import aplicacion.hibernate.dao.ICatalogoDao;
import aplicacion.hibernate.dao.IUsuarioDao;
import aplicacion.hibernate.dao.IVentaDao;
import aplicacion.hibernate.dao.IVentaProductoDao;
import aplicacion.hibernate.dao.imp.CatalogoDaoImp;
import aplicacion.hibernate.dao.imp.UsuarioDaoImp;
import aplicacion.hibernate.dao.imp.VentaDaoImp;
import aplicacion.hibernate.dao.imp.VentaProductoDaoImp;
import aplicacion.modelo.dominio.Catalogo;
import aplicacion.modelo.dominio.Producto;
import aplicacion.modelo.dominio.Usuario;
import aplicacion.modelo.dominio.Venta;
import aplicacion.modelo.dominio.VentaProducto;
import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class TestCrearVenta {

    public static void main(String[] args) {
        IVentaDao ventaDao = new VentaDaoImp();
        Venta venta = new Venta();

        ICatalogoDao catalogoDao = new CatalogoDaoImp();
        Catalogo catalogo = new Catalogo();
        catalogo= catalogoDao.obtenerCatalogos().get(0);

        IUsuarioDao usuarioDao = new UsuarioDaoImp();
        Usuario usuarioCliente = new Usuario();
        usuarioCliente= usuarioDao.obtenerUsuarios().get(0);
        Usuario usuarioVendedor= new Usuario();
        usuarioVendedor= usuarioDao.obtenerUsuarios().get(3);

        IVentaProductoDao ventaProductoDao = new VentaProductoDaoImp();
        VentaProducto ventaProducto = new VentaProducto();

        
        venta.setCatalogo(catalogo);
        venta.setFecha(new Date());
        venta.setUsuarioByIdCliente(usuarioCliente);
        venta.setUsuarioByIdVendedor(usuarioVendedor);
        ventaDao.create(venta);
        
        Producto producto= new Producto();
        producto= catalogo.getProducto();
        double precio= producto.getPrecio();
        Integer cantidad=5;
        ventaProducto.setCantidad(cantidad);
        ventaProducto.setProducto(catalogo.getProducto());
        ventaProducto.setTotal(precio*(double)cantidad);
        ventaProducto.setVenta(venta);
        ventaProductoDao.create(ventaProducto);

    }

}
