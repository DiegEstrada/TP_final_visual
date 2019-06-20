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

/**
 *
 * @author LENOVO
 */
@ManagedBean
@SessionScoped
public class UsuarioBean implements Serializable{

    private IUsuarioDao usuarioDao;
    private Usuario usuario;
    private List<TipoUsuario> listaTipoDeUsuarios;
    

    /**
     * Creates a new instance of UsuarioBean
     */
    public UsuarioBean() {
        usuarioDao = new UsuarioDaoImp();
        usuario = new Usuario();
    }

    public void crearUsuario(Usuario usuarioACrear) {
        usuarioDao.create(usuarioACrear);
    }
    public void modificarUsuario(Usuario usuarioAModificar){
        usuarioDao.update(usuarioAModificar);
    }
    public void eliminarUsuario(Usuario usuarioAEliminar){
        usuarioDao.delete(usuarioAEliminar);
    }
    public List<Usuario> obtenerUsuarios() {
        return usuarioDao.obtenerUsuarios();
    }
    public void registrarUsuario(){
        byte estado=1;
        TipoUsuario tu = new TipoUsuario();
        tu.setIdTipoUsuario(1);
        tu.setNombre("comun");
        usuario.setEstado(estado);
        usuario.setTipoUsuario(tu);
        usuarioDao.create(usuario);
    }
     public void registrarUsuarioAdmi(){
        byte estado=1;
        TipoUsuario tu = new TipoUsuario();
        tu.setIdTipoUsuario(2);
        tu.setNombre("administrador");
        usuario.setEstado(estado);
        usuario.setTipoUsuario(tu);
        usuarioDao.create(usuario);
    }

    public IUsuarioDao getUsuarioDao() {
        return usuarioDao;
    }

    public void setUsuarioDao(IUsuarioDao usuarioDao) {
        this.usuarioDao = usuarioDao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<TipoUsuario> getListaTipoDeUsuarios() {
        return listaTipoDeUsuarios;
    }

    public void setListaTipoDeUsuarios(List<TipoUsuario> listaTipoDeUsuarios) {
        this.listaTipoDeUsuarios = listaTipoDeUsuarios;
    }

}
