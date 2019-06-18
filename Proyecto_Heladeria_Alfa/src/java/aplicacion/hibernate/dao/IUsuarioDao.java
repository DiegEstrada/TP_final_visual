
package aplicacion.hibernate.dao;

import aplicacion.modelo.dominio.Usuario;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public interface IUsuarioDao extends IGenericDao<Usuario, Integer>{
    public List<Usuario> obtenerUsuarios();
    public Usuario validarUsuario(String username, String password);   
    
}
