/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.test;

import aplicacion.hibernate.configuracion.HibernateUtil;
import aplicacion.hibernate.dao.IUsuarioDao;
import aplicacion.hibernate.dao.imp.UsuarioDaoImp;
import aplicacion.modelo.dominio.TipoUsuario;
import aplicacion.modelo.dominio.Usuario;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;

/**
 *
 * @author LENOVO
 */
public class TestCrearUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria =session.createCriteria(TipoUsuario.class);
        List<TipoUsuario> tipoUsuarios=criteria.list();
        TipoUsuario tu = new TipoUsuario();
        tu= tipoUsuarios.get(1);
        session.close();
        Boolean bol=true;
        byte estado=0;
        
        Usuario usuarioTest= new Usuario(tu, "exito", "ape2", "usuario2", "usuario2", "matias@gmaail.com", "308092", new Date(),estado);
        IUsuarioDao usuarioDao = new UsuarioDaoImp();
        usuarioDao.create(usuarioTest);
        
    }
    
}
