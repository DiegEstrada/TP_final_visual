/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.test;

import aplicacion.hibernate.dao.ICatalogoDao;
import aplicacion.hibernate.dao.imp.CatalogoDaoImp;
import aplicacion.modelo.dominio.Catalogo;
import aplicacion.modelo.util.Carrito;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class TestCarrito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ICatalogoDao catalogoDao = new CatalogoDaoImp();
        Carrito carrito = new Carrito();
        List<Catalogo> listaDeCatalogo = catalogoDao.obtenerCatalogos();
        List<Catalogo> tipoAgua = new ArrayList<>();

        /*for (int i = 0; i < listaDeCatalogo.size(); i++) {                     //Agrega toda la lista de Catalogo al Carrito
            carrito.agregarCatalogoAlCarrito(listaDeCatalogo.get(i));
        }
        for (int i = 0; i < carrito.getCarrito().size(); i++) {                //Muestra toda lista del carrito
            System.out.println("ID: " + carrito.getCarrito().get(i).getIdCatalogo() 
                    + " - Nombre: " + carrito.getCarrito().get(i).getNombre()
                    + " - Producto: " + carrito.getCarrito().get(i).getProducto().getNombre()
                    + " - Precio: " + carrito.getCarrito().get(i).getProducto().getPrecio()
                    + " - Precio con descuento: " + carrito.calcularPrecioConDescuento(carrito.getCarrito().get(i)));
        }
        
        System.out.println("Total: " + carrito.calcularPrecioTotal());  */
 //Muestra el precio total

        for(int i = 0; i < listaDeCatalogo.size(); i++){
            if(listaDeCatalogo.get(i).getProducto().getTipoHelado().getNombre().equalsIgnoreCase("Helado de Leche")){
                tipoAgua.add(listaDeCatalogo.get(i));
            }
        }
        
        System.out.println(tipoAgua.get(0).getProducto().getTipoHelado().getNombre());
    }

}
