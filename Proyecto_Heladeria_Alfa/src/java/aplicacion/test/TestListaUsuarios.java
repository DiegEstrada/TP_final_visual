/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.test;

import aplicacion.hibernate.dao.IUsuarioDao;
import aplicacion.hibernate.dao.imp.UsuarioDaoImp;
import aplicacion.modelo.dominio.Usuario;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class TestListaUsuarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IUsuarioDao usuarioDao= new UsuarioDaoImp();
        List<Usuario> listaUsuario = usuarioDao.obtenerUsuarios();
        for (int i=0;i<listaUsuario.size();i++ ) {
            System.out.println(listaUsuario.get(i).getIdUsuario());
        }
    }
    
}
