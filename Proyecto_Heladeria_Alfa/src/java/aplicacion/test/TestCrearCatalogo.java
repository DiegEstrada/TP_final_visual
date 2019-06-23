/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.test;

import aplicacion.hibernate.dao.ICatalogoDao;
import aplicacion.hibernate.dao.IProductoDao;
import aplicacion.hibernate.dao.IPromocionDao;
import aplicacion.hibernate.dao.imp.CatalogoDaoImp;
import aplicacion.hibernate.dao.imp.ProductoDaoImp;
import aplicacion.hibernate.dao.imp.PromocionDaoImp;
import aplicacion.modelo.dominio.Catalogo;
import aplicacion.modelo.dominio.Producto;
import aplicacion.modelo.dominio.Promocion;

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
        IProductoDao productoDao= new ProductoDaoImp();
        IPromocionDao promocionDao= new PromocionDaoImp();
        byte estado=1;
        Catalogo catalogo= new Catalogo();
        catalogo.setNombre("Agua anana");
        catalogo.setProducto(productoDao.obtenerProductos().get(0));
        catalogo.setPromocion(promocionDao.obtenerPromociones().get(0));
        catalogo.setEstado(estado);
        catalogoDao.create(catalogo);
        
    }
    
}
