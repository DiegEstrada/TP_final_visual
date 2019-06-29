/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.test;

import aplicacion.hibernate.configuracion.HibernateUtil;
import aplicacion.hibernate.dao.ITipoUsuarioDao;
import aplicacion.hibernate.dao.IUsuarioDao;
import aplicacion.hibernate.dao.imp.TipoUsuarioDaoImp;
import aplicacion.hibernate.dao.imp.UsuarioDaoImp;
import aplicacion.modelo.dominio.TipoUsuario;
import aplicacion.modelo.dominio.Usuario;
import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class TestCrearUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TipoUsuario tu = new TipoUsuario();
        ITipoUsuarioDao tipoUsuarioDao = new TipoUsuarioDaoImp();
        tu = tipoUsuarioDao.obtenerTipoUsuarios().get(0);
        byte estado = 1;
        IUsuarioDao usuarioDao= new UsuarioDaoImp();
        Usuario usuarioTest = new Usuario(tu, "comun", "comun", "comun", "comun", "comun@gmail.com", "39200034", new Date(), estado);

        usuarioDao.create(usuarioTest);
        System.out.println("NOMBRE DEL USUARIO: " + usuarioDao.obtenerUsuarios().get(usuarioDao.obtenerUsuarios().size() - 1).getUsername());
        System.out.println("NOMBRE DEL USUARIO: " + usuarioDao.obtenerUsuarios().get(usuarioDao.obtenerUsuarios().size() - 1).getPassword());

    }

}
