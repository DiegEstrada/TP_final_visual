
package aplicacion.test;

import aplicacion.hibernate.dao.IAlmacenDao;
import aplicacion.hibernate.dao.IProductoDao;
import aplicacion.hibernate.dao.ITipoHeladoDao;
import aplicacion.hibernate.dao.imp.AlmacenDaoImp;
import aplicacion.hibernate.dao.imp.ProductoDaoImp;
import aplicacion.hibernate.dao.imp.TipoHeladoDaoImp;
import aplicacion.modelo.dominio.Almacen;
import aplicacion.modelo.dominio.Producto;
import aplicacion.modelo.dominio.TipoHelado;

/**
 *
 * @author LENOVO
 */
public class TestCrearProducto {

    public static void main(String[] args) {
        IProductoDao productoDao= new ProductoDaoImp();
        IAlmacenDao almacenDao= new AlmacenDaoImp();
        ITipoHeladoDao tipoHeladoDao= new TipoHeladoDaoImp();
        
        Almacen almacen = new Almacen();
        TipoHelado tipoHelado= new TipoHelado();
        
        tipoHelado= tipoHeladoDao.obtenerTipoHelados().get(0);//con get(0) se obtiene el TipoHelado que esta en la
                                                              //posicion 1 y lo guardo en tipoHelado
        
        almacen.setStock(0);                            
        almacenDao.create(almacen);                         //Creo y guardo primero un almacen antes del producto
        
        byte estado=1;
        Producto producto= new Producto();
        
        producto.setAlmacen(almacen);                       //el almacen creado anteriormente lo pongo en el producto a crear
        producto.setDescripcion("Helado de fruta Sabor kiwi");
        producto.setEstado(estado);
        producto.setNombre("helado3");
        producto.setPrecio(20.00);
        producto.setTipoHelado(tipoHelado);                 //el tipo de helado obtenido anteriormente lo pongo en el producto a crear
        productoDao.create(producto);                   //el producto se guarda estando relacionado con su almacen y tipo de helado 
    
    }
}
