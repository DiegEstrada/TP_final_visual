/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.contralador.beans;

import aplicacion.hibernate.dao.ICatalogoDao;
import aplicacion.hibernate.dao.imp.CatalogoDaoImp;
import aplicacion.modelo.dominio.Catalogo;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author LENOVO
 */
@ManagedBean
@SessionScoped
public class CatalogoBean implements Serializable {

    private ICatalogoDao catalogoDao;
    private Catalogo catalogo;

    public CatalogoBean() {
        catalogoDao = new CatalogoDaoImp();
        catalogo = new Catalogo();
    }

    public void crearCatalogo(Catalogo catalogoACrear) {
        catalogoDao.create(catalogoACrear);
    }

    public void eliminarCatalogo(Catalogo catalogoAEliminar) {
        catalogoDao.delete(catalogoAEliminar);
    }

    public void modificarCatalogo(Catalogo catalogoAModificar) {
        catalogoDao.update(catalogoAModificar);
    }

    public List<Catalogo> obtenerCatalogos() {
        return catalogoDao.obtenerCatalogos();
    }

    public ICatalogoDao getCatalogoDao() {
        return catalogoDao;
    }

    public void setCatalogoDao(ICatalogoDao catalogoDao) {
        this.catalogoDao = catalogoDao;
    }

    public Catalogo getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(Catalogo catalogo) {
        this.catalogo = catalogo;
    }
    

}
