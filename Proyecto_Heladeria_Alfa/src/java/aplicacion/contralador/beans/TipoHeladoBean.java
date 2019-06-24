/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.contralador.beans;

import aplicacion.hibernate.dao.ITipoHeladoDao;
import aplicacion.hibernate.dao.ITipoUsuarioDao;
import aplicacion.hibernate.dao.imp.TipoHeladoDaoImp;
import aplicacion.modelo.dominio.TipoHelado;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author LENOVO
 */
@ManagedBean
@SessionScoped
public class TipoHeladoBean implements Serializable {

    private ITipoHeladoDao tipoHeladoDao;
    private List<TipoHelado> listaDeHelados;

    public TipoHeladoBean() {
        tipoHeladoDao = new TipoHeladoDaoImp();
        listaDeHelados = new ArrayList<>();

    }

    public List<TipoHelado> obtenerTiposDeHelados() {
        return tipoHeladoDao.obtenerTipoHelados();
    }

    public ITipoHeladoDao getTipoHeladoDao() {
        return tipoHeladoDao;
    }

    public void setTipoHeladoDao(ITipoHeladoDao tipoHeladoDao) {
        this.tipoHeladoDao = tipoHeladoDao;
    }

    public List<TipoHelado> getListaDeHelados() {
        return listaDeHelados;
    }

    public void setListaDeHelados(List<TipoHelado> listaDeHelados) {
        this.listaDeHelados = listaDeHelados;
    }
    
}
