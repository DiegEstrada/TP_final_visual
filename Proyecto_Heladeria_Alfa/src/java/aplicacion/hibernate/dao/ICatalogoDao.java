/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.hibernate.dao;

import aplicacion.modelo.dominio.Catalogo;
import java.util.List;


public interface ICatalogoDao extends IGenericDao<Catalogo,Integer>{
    public List<Catalogo> obtenerCatalogos();
    
}
