package aplicacion.contralador.beans.forms;

import aplicacion.contralador.beans.CatalogoBean;
import aplicacion.contralador.beans.ProductoBean;
import aplicacion.contralador.beans.PromocionBean;
import aplicacion.modelo.dominio.Catalogo;
import aplicacion.modelo.dominio.Producto;
import aplicacion.modelo.dominio.Promocion;
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
public class GestionCatalogosFormBean implements Serializable {

    @ManagedProperty(value = "#{catalogoBean}")
    private CatalogoBean catalogoBean;

    @ManagedProperty(value = "#{productoBean}")
    private ProductoBean productoBean;

    @ManagedProperty(value = "#{promocionBean}")
    private PromocionBean promocionBean;

    List<Catalogo> catalogos;
    List<Producto> productos;
    List<Promocion> promociones;
    Catalogo catalogo;

    @PostConstruct
    public void init() {
        obtenerListaDeCatalogos();
        obtenerListaDeProductos();
        obtenerListaDePromociones();
        catalogo = new Catalogo();
    }

    public GestionCatalogosFormBean() {
    }

    public void crearCatalogo() {
        byte estado = 1;
        catalogo.setEstado(estado);
        catalogoBean.crearCatalogo(catalogo);
        catalogo = new Catalogo();
        obtenerListaDeCatalogos();
    }

    public void obtenerListaDeCatalogos() {
        catalogos = catalogoBean.obtenerCatalogos();
    }

    public void obtenerListaDePromociones() {
        promociones = promocionBean.obtenerPromociones();
    }

    public void obtenerListaDeProductos() {
        productos = productoBean.obtenerProductos();
    }

    public void onRowEdit(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Catalogo modificado", "");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edicion cancelada", "");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public CatalogoBean getCatalogoBean() {
        return catalogoBean;
    }

    public void setCatalogoBean(CatalogoBean catalogoBean) {
        this.catalogoBean = catalogoBean;
    }

    public ProductoBean getProductoBean() {
        return productoBean;
    }

    public void setProductoBean(ProductoBean productoBean) {
        this.productoBean = productoBean;
    }

    public PromocionBean getPromocionBean() {
        return promocionBean;
    }

    public void setPromocionBean(PromocionBean promocionBean) {
        this.promocionBean = promocionBean;
    }

    public List<Catalogo> getCatalogos() {
        return catalogos;
    }

    public void setCatalogos(List<Catalogo> catalogos) {
        this.catalogos = catalogos;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public List<Promocion> getPromociones() {
        return promociones;
    }

    public void setPromociones(List<Promocion> promociones) {
        this.promociones = promociones;
    }

    public Catalogo getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(Catalogo catalogo) {
        this.catalogo = catalogo;
    }

}
