/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.contralador.beans.forms;

import aplicacion.contralador.beans.ProductoBean;
import aplicacion.contralador.beans.TipoHeladoBean;
import aplicacion.modelo.dominio.Producto;
import aplicacion.modelo.dominio.TipoHelado;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author LENOVO
 */
@ManagedBean
@SessionScoped
public class GestionProductosFormBean implements Serializable {

    @ManagedProperty(value = "#{productoBean}")
    private ProductoBean productoBean;

    @ManagedProperty(value = "#{tipoHeladoBean}")
    private TipoHeladoBean tipoHeladoBean;

    List<Producto> listaDeProductos;
    List<TipoHelado> listaDeTiposDeProducto;

    @PostConstruct
    public void init() {
        obtenerListaDeProductos();
        obtenerListaDeTipos();

    }

    public GestionProductosFormBean() {

    }

    public void crearProducto() {
        productoBean.crearProducto();
        obtenerListaDeProductos();
        FacesMessage msg = new FacesMessage("Producto creado", "");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void eliminarProducto(Producto productoAEliminar) {
        productoBean.eliminarProducto(productoAEliminar);
        FacesMessage msg = new FacesMessage("Producto eliminado", "");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
    public void onRowEdit(RowEditEvent event) {
        Producto productoModificado= ((Producto) event.getObject());
        productoBean.modificarProducto(productoModificado);
        FacesMessage msg = new FacesMessage("Producto modificado", "");
        FacesContext.getCurrentInstance().addMessage(null, msg);
        obtenerListaDeProductos();
    }
    public void obtenerListaDeProductos() {
        listaDeProductos = productoBean.obtenerProductos();
    }

    public void obtenerListaDeTipos(){
        listaDeTiposDeProducto = tipoHeladoBean.obtenerTiposDeHelados();
    }
    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edicion cancelada", "");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public ProductoBean getProductoBean() {
        return productoBean;
    }

    public void setProductoBean(ProductoBean productoBean) {
        this.productoBean = productoBean;
    }

    public TipoHeladoBean getTipoHeladoBean() {
        return tipoHeladoBean;
    }

    public void setTipoHeladoBean(TipoHeladoBean tipoHeladoBean) {
        this.tipoHeladoBean = tipoHeladoBean;
    }

    public List<Producto> getListaDeProductos() {
        return listaDeProductos;
    }

    public void setListaDeProductos(List<Producto> listaDeProductos) {
        this.listaDeProductos = listaDeProductos;
    }

    public List<TipoHelado> getListaDeTiposDeProducto() {
        return listaDeTiposDeProducto;
    }

    public void setListaDeTiposDeProducto(List<TipoHelado> listaDeTiposDeProducto) {
        this.listaDeTiposDeProducto = listaDeTiposDeProducto;
    }

    


    
}
