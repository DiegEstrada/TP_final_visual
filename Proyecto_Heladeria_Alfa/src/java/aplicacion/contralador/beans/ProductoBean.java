/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.contralador.beans;

import aplicacion.hibernate.dao.IProductoDao;
import aplicacion.hibernate.dao.imp.ProductoDaoImp;
import aplicacion.modelo.dominio.Producto;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author LENOVO
 */
@ManagedBean
@SessionScoped
public class ProductoBean {
    private IProductoDao productoDao;
    
    public ProductoBean() {
        productoDao= new ProductoDaoImp();
    }
    public void crearProducto(Producto productoACrear){
        productoDao.create(productoACrear);
    }
    public void eliminarProducto(Producto productoAEliminar){
        productoDao.delete(productoAEliminar);
    }
    public void modificarProducto(Producto productoAModificar){
        productoDao.update(productoAModificar);
    }
    public List<Producto> obtenerProductos(){
        return productoDao.obtenerProductos();
    }

    public IProductoDao getProductoDao() {
        return productoDao;
    }

    public void setProductoDao(IProductoDao productoDao) {
        this.productoDao = productoDao;
    }
    
    
    
}
