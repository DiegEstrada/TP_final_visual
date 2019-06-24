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
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
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
    

    @PostConstruct
    public void init() {
        obtenerListaDeUsuarios();
        obtenerListaDeTiposDeUsuarios();
        usuario= new Usuario();
    }

    public GestionUsuariosFormBean() {

    }
    public void crearUsuario() {
        usuarioBean.crearUsuario();
        obtenerListaDeUsuarios();
        FacesMessage msg = new FacesMessage("Usuario creado", "");
        FacesContext.getCurrentInstance().addMessage(null, msg);
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

    
    public void listarArrayUsuarioPdf()
 throws JRException, IOException{
 Map<String, Object> parametros = new HashMap<String, Object>();
 //puedo pasar parametros al report, siempre que el diseño lo soporte
 //parametros.put("usuario", "pepito");
 List<Usuario> usuarios = new ArrayList();
 usuarios =usuarioBean.obtenerUsuarios();  //this.obtenerListaUsuariosActivos(); 
 File jasper = new File(FacesContext.getCurrentInstance().getExternalContext().getRealPath("/usuarios.jasper"));
 JasperPrint jasperPrint = JasperFillManager.fillReport(jasper.getPath(), parametros, new JRBeanCollectionDataSource(usuarios));
 HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
 response.setContentType("application/pdf");
 response.addHeader("Content-disposition", "attachment; filename=usuario-report.pdf");
 ServletOutputStream stream = response.getOutputStream();
 JasperExportManager.exportReportToPdfStream(jasperPrint, stream);
 //exportamos a un archivo en disco
 //JasperExportManager.exportReportToPdfFile(jasperPrint, "e:/reporte.pdf");
 //mostrar en visor jasper
 //JasperViewer.viewReport(jasperPrint,false);
 stream.flush();
 stream.close();
 FacesContext.getCurrentInstance().responseComplete();
 }
}
