/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.contralador.beans;

import aplicacion.hibernate.dao.IUsuarioDao;
import aplicacion.hibernate.dao.imp.UsuarioDaoImp;
import aplicacion.modelo.dominio.Usuario;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author mi pc
 */
@ManagedBean
@ViewScoped
public class LogueoBean implements Serializable{

    private IUsuarioDao usuarioDao;
    /**
     * Creates a new instance of LogueoBean
     */
    public LogueoBean() {
        usuarioDao=new UsuarioDaoImp();
    }
    public Usuario ValidarUnUsuario(String nombreUsuario, String password){
       Usuario usuario=usuarioDao.validarUsuario(nombreUsuario, password);
       return usuario;
    }

    
    
    
    
    public IUsuarioDao getUsuarioDao() {
        return usuarioDao;
    }

    public void setUsuarioDao(IUsuarioDao usuarioDao) {
        this.usuarioDao = usuarioDao;
    }
       
    
}
