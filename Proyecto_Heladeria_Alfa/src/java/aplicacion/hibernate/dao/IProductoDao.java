/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.hibernate.dao;

import aplicacion.modelo.dominio.Producto;
import java.util.List;


public interface IProductoDao extends IGenericDao<Producto, Integer>{
    public List<Producto> obtenerProductos();
    
}
