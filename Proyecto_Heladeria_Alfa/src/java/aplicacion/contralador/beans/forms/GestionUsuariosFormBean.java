/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.contralador.beans.forms;

import aplicacion.contralador.beans.TipoUsuarioBean;
import aplicacion.contralador.beans.UsuarioBean;
import aplicacion.hibernate.dao.ITipoUsuarioDao;
import aplicacion.hibernate.dao.IUsuarioDao;
import aplicacion.modelo.dominio.TipoUsuario;
import aplicacion.modelo.dominio.Usuario;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.RowEditEvent;

@ManagedBean
@SessionScoped
public class GestionUsuariosFormBean implements Serializable{

    @ManagedProperty(value = "#{usuarioBean}")
    private UsuarioBean usuarioBean;
    
    @ManagedProperty(value = "#{tipoUsuarioBean}")
    private TipoUsuarioBean tipoUsuarioBean;
    
    private List<Usuario> listaUsuarios;
    private Usuario usuario;
    private List<TipoUsuario> listaTipoDeUsuarios;
    private ITipoUsuarioDao tipoUsuarioDao;

    @PostConstruct
    public void init() {
        obtenerListaDeUsuarios();
        obtenerListaDeTiposDeUsuarios();
        usuario= new Usuario();
    }

    public GestionUsuariosFormBean() {

    }
    public void crearUsuario(){
        byte estado =1;
        usuario.setEstado(estado);
        usuarioBean.crearUsuario(usuario);
        usuario= new Usuario();
        obtenerListaDeUsuarios();
        
        FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Se Agrego Correctamente", ""));
    }
    public void eliminarUsuario(Usuario usuarioAEliminar){
        usuarioBean.eliminarUsuario(usuarioAEliminar);
        obtenerListaDeUsuarios();
        
        FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Se Elimino Correctamente", ""));
    }

    public void obtenerListaDeUsuarios() {
        listaUsuarios = usuarioBean.obtenerUsuarios();
    }

    public void obtenerListaDeTiposDeUsuarios() {
        listaTipoDeUsuarios = tipoUsuarioBean.obtenerTiposDeUsuarios();
    }
    public void onRowEdit(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Usuario editado", "");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edicion cancelada", "");
        FacesContext.getCurrentInstance().addMessage(null, msg);
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

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public ITipoUsuarioDao getTipoUsuarioDao() {
        return tipoUsuarioDao;
    }

    public void setTipoUsuarioDao(ITipoUsuarioDao tipoUsuarioDao) {
        this.tipoUsuarioDao = tipoUsuarioDao;
    }

    public UsuarioBean getUsuarioBean() {
        return usuarioBean;
    }

    public void setUsuarioBean(UsuarioBean usuarioBean) {
        this.usuarioBean = usuarioBean;
    }

    public TipoUsuarioBean getTipoUsuarioBean() {
        return tipoUsuarioBean;
    }

    public void setTipoUsuarioBean(TipoUsuarioBean tipoUsuarioBean) {
        this.tipoUsuarioBean = tipoUsuarioBean;
    }

}
