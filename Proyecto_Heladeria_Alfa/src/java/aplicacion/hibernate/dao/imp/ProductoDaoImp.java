package aplicacion.hibernate.dao.imp;

import aplicacion.hibernate.configuracion.HibernateUtil;
import aplicacion.hibernate.dao.IProductoDao;
import aplicacion.modelo.dominio.Producto;
import aplicacion.modelo.dominio.Usuario;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GrupoAlfa
 */
public class ProductoDaoImp extends GenericDaoImp<Producto, Integer>implements IProductoDao,Serializable {

    @Override
    public List<Producto> obtenerProductos() {
        List<Producto> productosActivos=new ArrayList<>();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria=session.createCriteria(Producto.class);
        List<Producto> productos=criteria.list();
        
        
        for(int x=0;x<productos.size();x++){
          if(productos.get(x).getEstado()==1){
          productosActivos.add(x, productos .get(x));
          }
        }
        session.close();
        return productosActivos; 
    }
    
}
