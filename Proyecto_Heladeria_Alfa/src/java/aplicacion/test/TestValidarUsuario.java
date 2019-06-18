/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.test;

import aplicacion.hibernate.dao.IUsuarioDao;
import aplicacion.hibernate.dao.imp.UsuarioDaoImp;
import aplicacion.modelo.dominio.Usuario;

/**
 *
 * @author LENOVO
 */
public class TestValidarUsuario {

    public static void main(String[] args) {
        IUsuarioDao usuarioDao= new UsuarioDaoImp();
        Usuario usuario=null;
        usuario= usuarioDao.obtenerUsuarios().get(0);
        System.out.println(usuario.getUsername());
        System.out.println(usuarioDao.validarUsuario("usuario2", "usuario2").getUsername());
    }
    
}
