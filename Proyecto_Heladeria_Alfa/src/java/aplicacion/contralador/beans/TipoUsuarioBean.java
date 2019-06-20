/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.contralador.beans;

import aplicacion.hibernate.dao.ITipoUsuarioDao;
import aplicacion.hibernate.dao.imp.TipoUsuarioDaoImp;
import aplicacion.modelo.dominio.TipoUsuario;
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
public class TipoUsuarioBean implements Serializable{
    ITipoUsuarioDao tipoUsuarioDao;
    
    public TipoUsuarioBean() {
        tipoUsuarioDao= new TipoUsuarioDaoImp();
    }
    public List<TipoUsuario> obtenerTiposDeUsuarios(){
        return tipoUsuarioDao.obtenerTipoUsuarios();
    }

    public ITipoUsuarioDao getTipoUsuarioDao() {
        return tipoUsuarioDao;
    }

    public void setTipoUsuarioDao(ITipoUsuarioDao tipoUsuarioDao) {
        this.tipoUsuarioDao = tipoUsuarioDao;
    }
    
}
