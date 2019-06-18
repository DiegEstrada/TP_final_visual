/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.contralador.beans.forms;

import aplicacion.contralador.beans.UsuarioBean;
import aplicacion.hibernate.dao.ITipoUsuarioDao;
import aplicacion.hibernate.dao.IUsuarioDao;
import aplicacion.hibernate.dao.imp.TipoUsuarioDaoImp;
import aplicacion.hibernate.dao.imp.UsuarioDaoImp;
import aplicacion.modelo.dominio.TipoUsuario;
import aplicacion.modelo.dominio.Usuario;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author LENOVO
 */
@ManagedBean
@SessionScoped
public class CrearUsuarioFormBean implements Serializable {

    private ITipoUsuarioDao tipoUsuarioDao;
    private IUsuarioDao usuarioDao;
    private List<Usuario> listaUsuarios;
    private List<TipoUsuario> listaTipoDeUsuarios;
    private Usuario usuario;

    @PostConstruct
    public void init() {
        obtenerUsuarios();
        obtenerTipoDeUsuarios();
    }

    public CrearUsuarioFormBean() {
        listaUsuarios = new ArrayList<>();
        usuario = new Usuario();
        usuarioDao = new UsuarioDaoImp();
        tipoUsuarioDao = new TipoUsuarioDaoImp();
    }

    public void crearUsuarioComun() {
        TipoUsuario tipoComun = tipoUsuarioDao.obtenerTipoUsuarios().get(0);
        Byte estadoActivo = 1;
        usuario.setEstado(estadoActivo);
        usuario.setTipoUsuario(tipoComun);
        usuarioDao.create(usuario);
        usuario = new Usuario();
    }

    public void crearUsuario() {
        Byte estadoActivo = 1;
        usuario.setEstado(estadoActivo);
        usuarioDao.create(usuario);
        usuario = new Usuario();
    }

    public void obtenerUsuarios() {
        listaUsuarios = usuarioDao.obtenerUsuarios();
    }

    public void obtenerTipoDeUsuarios() {
        listaTipoDeUsuarios = tipoUsuarioDao.obtenerTipoUsuarios();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public List<TipoUsuario> getListaTipoDeUsuarios() {
        return listaTipoDeUsuarios;
    }

    public void setListaTipoDeUsuarios(List<TipoUsuario> listaTipoDeUsuarios) {
        this.listaTipoDeUsuarios = listaTipoDeUsuarios;
    }

}
