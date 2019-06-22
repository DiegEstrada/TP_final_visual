/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.contralador.beans.forms;

import aplicacion.contralador.beans.LogueoBean;
import aplicacion.contralador.beans.UsuarioBean;
import aplicacion.modelo.dominio.Usuario;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Grupo Alfa
 */
@ManagedBean
@ViewScoped
public class LogueoFormBean implements Serializable {

    @ManagedProperty(value = "#{logueoBean}")
    private LogueoBean logueoBean;

    private String nombreUsuario;
    private String password;

    public LogueoFormBean() {
        logueoBean = new LogueoBean();
    }

    public String validarUsuario() {
        String irPagina = null;
        Usuario usuario;
        usuario = logueoBean.ValidarUnUsuario(nombreUsuario, password);
        if (usuario != null) {
            if (usuario.getTipoUsuario().getIdTipoUsuario().equals(2)) { // indica usuario administrador
                irPagina = "creacionAdmin";//?faces-redirect=true";
                //FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario Valido", "Usuario Valido");
                //FacesContext.getCurrentInstance().addMessage(null, facesMessage);
                //FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuarioValido", usuario);
            }

        
        if (usuario.getTipoUsuario().getIdTipoUsuario().equals(1)) { //1 indica usuario comun
            irPagina = "catalogo";//?faces-redirect=true";
            //FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario Valido", "Usuario Valido");
            //FacesContext.getCurrentInstance().addMessage(null, facesMessage);
            //FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuarioValido", usuario);
        }
        }
        return irPagina;
    }

    public String obtenerNombreUsuarioValido() {
        Usuario usuario = (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuarioValido");
        return usuario.getUsername();
    }

    public String cerrarSesion() {
        String irPagina = null;
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_INFO, "Sesion cerrada", "Sesion Cerrada");
        FacesContext.getCurrentInstance().addMessage(null, fm);
        irPagina = "/inicio?faces-redirect=true";
        return irPagina;
    }

    public boolean verificarSesion() {
        boolean sesionValida = false;
        if (FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuarioValido") != null) {
            sesionValida = true;
        }
        return sesionValida;
    }

    public boolean verificarAdministrador() {
        boolean tipoUsuario = false;
        Usuario usuario = (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuarioValido");
        if (usuario.getTipoUsuario().getNombre().equals("administrador")) {
            tipoUsuario = true;
        }
        return tipoUsuario;
    }

    public boolean verificarComun() {
        boolean tipoUsuario = false;
        Usuario usuario = (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuarioValido");
        if (usuario.getTipoUsuario().getNombre().equals("comun")) {
            tipoUsuario = true;
        }
        return tipoUsuario;
    }

    public LogueoBean getLogueoBean() {
        return logueoBean;
    }

    public void setLogueoBean(LogueoBean logueoBean) {
        this.logueoBean = logueoBean;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
