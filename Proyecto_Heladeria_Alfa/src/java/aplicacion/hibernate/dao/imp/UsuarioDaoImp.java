/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.hibernate.dao.imp;

import aplicacion.hibernate.dao.IUsuarioDao;
import aplicacion.hibernate.configuracion.HibernateUtil;
import aplicacion.modelo.dominio.Usuario;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author LENOVO
 */
public class UsuarioDaoImp extends GenericDaoImp<Usuario, Integer>implements IUsuarioDao,Serializable{

    @Override
    public List<Usuario> obtenerUsuarios() {
        List<Usuario> usuariosActivos=new ArrayList<>();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria=session.createCriteria(Usuario.class);
        List<Usuario> usuarios=criteria.list();
        session.close();
        /*
        for(int x=0;x<usuarios.size();x++){
          if(usuarios.get(x).getEstado()==1){
          usuariosActivos.add(x, usuarios.get(x));
          }
        }
        
        return usuariosActivos; */
       return usuarios;
    }

    @Override
    public Usuario  validarUsuario(String username, String password) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Usuario.class);
        criteria.add(Restrictions.like("username", username));
        criteria.add(Restrictions.like("password", password));
        Usuario usuario = null;
        if (!criteria.list().isEmpty()) {
            usuario= (Usuario)criteria.list().get(0);            
        }
        session.close();
        return usuario;        
    }

    
}
