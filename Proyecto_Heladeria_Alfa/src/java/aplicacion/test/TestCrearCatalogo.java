/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.test;

import aplicacion.hibernate.dao.ICatalogoDao;
import aplicacion.hibernate.dao.imp.CatalogoDaoImp;
import aplicacion.modelo.dominio.Catalogo;

/**
 *
 * @author LENOVO
 */
public class TestCrearCatalogo {
    // Al momento de eliminar un producto tambien se tendra que eliminar el catalogo que contenga a ese producto.
    // Para ello habra que hacer un metodo que se invoque antes de cargar la lista y que recorra toda la lista que traera y 
    // verifique si el producto esta activo. Si el producto esta dado de bajo no apaceran en la lista porque el metodo
    // las filtra.
    
    public static void main(String[] args) {
        ICatalogoDao catalogoDao=new CatalogoDaoImp();
        Catalogo catalogo;
        
    }
    
}
