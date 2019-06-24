/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.contralador.beans;

import aplicacion.hibernate.dao.IAlmacenDao;
import aplicacion.hibernate.dao.IProductoDao;
import aplicacion.hibernate.dao.imp.AlmacenDaoImp;
import aplicacion.hibernate.dao.imp.ProductoDaoImp;
import aplicacion.modelo.dominio.Almacen;
import aplicacion.modelo.dominio.Producto;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author LENOVO
 */
@ManagedBean
@SessionScoped
public class ProductoBean implements Serializable {

    private IProductoDao productoDao;
    private IAlmacenDao almacenDao;
    private Producto producto;
    private Almacen almacen;

    public ProductoBean() {
        productoDao = new ProductoDaoImp();
        almacenDao= new AlmacenDaoImp();
        producto= new Producto();
        almacen= new Almacen();
    }

    public void crearProducto() {
        byte estado= 1;
        producto.setEstado(estado);
        productoDao.create(producto);
    }

    public void eliminarProducto(Producto productoAEliminar) {
        productoDao.delete(productoAEliminar);
    }

    public void modificarProducto(Producto productoAModificar) {
        productoDao.update(productoAModificar);
    }

    public List<Producto> obtenerProductos() {
        return productoDao.obtenerProductos();
    }

    public IProductoDao getProductoDao() {
        return productoDao;
    }

    public void setProductoDao(IProductoDao productoDao) {
        this.productoDao = productoDao;
    }

    public IAlmacenDao getAlmacenDao() {
        return almacenDao;
    }

    public void setAlmacenDao(IAlmacenDao almacenDao) {
        this.almacenDao = almacenDao;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }

}
