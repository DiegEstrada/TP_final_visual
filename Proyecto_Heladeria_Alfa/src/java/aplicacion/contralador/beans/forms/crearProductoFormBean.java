/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.contralador.beans.forms;

import aplicacion.hibernate.dao.IAlmacenDao;
import aplicacion.hibernate.dao.IProductoDao;
import aplicacion.hibernate.dao.ITipoHeladoDao;
import aplicacion.hibernate.dao.imp.AlmacenDaoImp;
import aplicacion.hibernate.dao.imp.ProductoDaoImp;
import aplicacion.hibernate.dao.imp.TipoHeladoDaoImp;
import aplicacion.modelo.dominio.Almacen;
import aplicacion.modelo.dominio.Producto;
import aplicacion.modelo.dominio.TipoHelado;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Diego
 */
@ManagedBean
@SessionScoped
public class crearProductoFormBean implements Serializable{ 
    private ITipoHeladoDao tipoHeladoDao;
    private IProductoDao productoDao;
    private List<Producto> listaProducto;
    private List<TipoHelado> listaTipoHelado;
    private Producto producto;
    private Almacen almacen;
    
     @PostConstruct
    public void init() {
         obtenerProducto();
         obtenerTipoHelado();
        
    }

    public crearProductoFormBean() {
        almacen= new Almacen();
        productoDao = new ProductoDaoImp();
        listaProducto = new ArrayList();
        productoDao = new ProductoDaoImp();
        listaTipoHelado = new ArrayList();
        tipoHeladoDao = new TipoHeladoDaoImp();
        producto = new Producto();
        
        
    }

    /**
     *
     */
    public void crearAlmacen(){
        IAlmacenDao almacenDao = new AlmacenDaoImp();
        producto = new Producto();
        almacenDao.create(almacen);
           
    }
    public void crearProducto(){
        crearAlmacen();
        producto.setAlmacen(almacen);
        productoDao.create(producto);
        
    }

    public ITipoHeladoDao getTipoHeladoDao() {
        return tipoHeladoDao;
    }

    public void setTipoHeladoDao(ITipoHeladoDao tipoHeladoDao) {
        this.tipoHeladoDao = tipoHeladoDao;
    }

    public IProductoDao getProductoDao() {
        return productoDao;
    }

    public void setProductoDao(IProductoDao productoDao) {
        this.productoDao = productoDao;
    }

    public List<Producto> getListaProducto() {
        return listaProducto;
    }

    public void setListaProducto(List<Producto> listaProducto) {
        this.listaProducto = listaProducto;
    }

    public List<TipoHelado> getListaTipoHelado() {
        return listaTipoHelado;
    }

    public void setListaTipoHelado(List<TipoHelado> listaTipoHelado) {
        this.listaTipoHelado = listaTipoHelado;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    private void obtenerProducto() {
        listaProducto = productoDao.obtenerProductos();
    }

    private void obtenerTipoHelado() {
        listaTipoHelado = tipoHeladoDao.obtenerTipoHelados();
    }

    public Almacen getAlamcen() {
        return almacen;
    }

    public void setAlamcen(Almacen almacen) {
        this.almacen = almacen;
    }
    
}
