/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.contralador.beans.forms;

import aplicacion.contralador.beans.UsuarioBean;
import aplicacion.modelo.dominio.Usuario;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author mi pc
 */
@ManagedBean
@SessionScoped
public class UsuarioFormBean {

    @ManagedProperty(value="#{usuarioBean}")
    private UsuarioBean usuarioBean;
    private Usuario nuevoUsuario;
    /**
     * Creates a new instance of UsuarioFormBean
     */
    public UsuarioFormBean() {
        usuarioBean=new UsuarioBean();
        nuevoUsuario=new Usuario();
    }

    public void agregarUnUsuarioComun(){
    usuarioBean.registrarUsuarioComun(nuevoUsuario);
    }
    
    public void agregarUnUsuarioAdministrador(){
    usuarioBean.registrarUsuarioAdministrador(nuevoUsuario);
    }
    
    
    
    
    
    public UsuarioBean getUsuarioBean() {
        return usuarioBean;
    }

    public void setUsuarioBean(UsuarioBean usuarioBean) {
        this.usuarioBean = usuarioBean;
    }

    public Usuario getNuevoUsuario() {
        return nuevoUsuario;
    }

    public void setNuevoUsuario(Usuario nuevoUsuario) {
        this.nuevoUsuario = nuevoUsuario;
    }
    
    
    
}
