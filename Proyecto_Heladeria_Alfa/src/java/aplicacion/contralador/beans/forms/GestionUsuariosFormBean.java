/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.contralador.beans.forms;

import aplicacion.hibernate.dao.IUsuarioDao;
import aplicacion.modelo.dominio.TipoUsuario;
import aplicacion.modelo.dominio.Usuario;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author LENOVO
 */
@ManagedBean
@SessionScoped
public class GestionUsuariosFormBean {
    
    private IUsuarioDao usuarioDao;
    private Usuario usuario;
    private List<TipoUsuario> listaTipoDeUsuarios;


    public GestionUsuariosFormBean() {
    }
    
}
