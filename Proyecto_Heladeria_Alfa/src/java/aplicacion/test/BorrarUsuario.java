/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.test;

import aplicacion.hibernate.dao.IUsuarioDao;
import aplicacion.hibernate.dao.imp.UsuarioDaoImp;

/**
 *
 * @author LENOVO
 */
public class BorrarUsuario {

    public static void main(String[] args) {
        IUsuarioDao usuariodao = new UsuarioDaoImp();
        System.out.println(usuariodao.obtenerUsuarios().get(0).getIdUsuario());
        usuariodao.delete(usuariodao.obtenerUsuarios().get(0));
        System.out.println(usuariodao.obtenerUsuarios().get(0).getIdUsuario());

    }

}
