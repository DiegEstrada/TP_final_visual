/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.contralador.beans;

import aplicacion.hibernate.dao.IUsuarioDao;
import aplicacion.hibernate.dao.imp.UsuarioDaoImp;
import aplicacion.modelo.dominio.TipoUsuario;
import aplicacion.modelo.dominio.Usuario;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Gtupo Alfa
 */
@ManagedBean
@SessionScoped
public class UsuarioBean implements Serializable{

    private IUsuarioDao usuarioDao;
    

    /**
     * Creates a new instance of UsuarioBean
     */
    public UsuarioBean() {
        usuarioDao = new UsuarioDaoImp();
    }

    public void crearUsuario(Usuario usuarioACrear) {
        usuarioDao.create(usuarioACrear);
    }
    public void modificarUsuario(Usuario usuarioAModificar){
        usuarioDao.update(usuarioAModificar);
    }
    public void eliminarUsuario(Usuario usuarioAEliminar){
        byte inactivo=0;
        usuarioAEliminar.setEstado(inactivo);
        usuarioDao.delete(usuarioAEliminar);
    }
    
    /*public void registrarUsuarioComun(Usuario newUsuario){
        byte estado=1;
        TipoUsuario tipoUsuario = new TipoUsuario();
        tipoUsuario.setIdTipoUsuario(1);
        tipoUsuario.setNombre("comun");
        newUsuario.setEstado(estado);
        newUsuario.setTipoUsuario(tipoUsuario);
        usuarioDao.create(newUsuario);
    }
    
    public void registrarUsuarioAdministrador(Usuario newUsuario){
        byte estado=1;
        TipoUsuario tipoUsuario = new TipoUsuario();
        tipoUsuario.setIdTipoUsuario(2);
        tipoUsuario.setNombre("administrador");
        newUsuario.setEstado(estado);
        newUsuario.setTipoUsuario(tipoUsuario);
        usuarioDao.create(newUsuario);
    }*/
    
    public List<Usuario> obtenerUsuarios() {
        return usuarioDao.obtenerUsuarios();
    }

    
    public IUsuarioDao getUsuarioDao() {
        return usuarioDao;
    }

    public void setUsuarioDao(IUsuarioDao usuarioDao) {
        this.usuarioDao = usuarioDao;
    }

    
}
