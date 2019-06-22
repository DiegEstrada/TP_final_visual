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
        //Session session = HibernateUtil.getSessionFactory().openSession();
        //Criteria criteria =session.createCriteria(TipoUsuario.class);
        //List<TipoUsuario> tipoUsuarios=criteria.list();
        TipoUsuario tu = new TipoUsuario();
        //tu= tipoUsuarios.get(1);
        tu.setIdTipoUsuario(1);
        tu.setNombre("comun");        
        //session.close();
        
        byte estado=1;
        
        Usuario usuarioTest= new Usuario(tu, "jose", "lopez", "ricardo", "jose", "josegmail.com", "39200034", new Date(),estado);
        IUsuarioDao usuarioDao = new UsuarioDaoImp();
        usuarioDao.create(usuarioTest);
        
        System.out.println("NOMBRE DEL USUARIO: "+usuarioDao.obtenerUsuarios().get(usuarioDao.obtenerUsuarios().size()-1).getUsername());
        System.out.println("NOMBRE DEL USUARIO: "+usuarioDao.obtenerUsuarios().get(usuarioDao.obtenerUsuarios().size()-1).getPassword());

    }
    
}
