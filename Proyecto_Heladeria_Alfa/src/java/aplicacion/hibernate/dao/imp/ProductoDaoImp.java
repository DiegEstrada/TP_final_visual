package aplicacion.hibernate.dao.imp;

import aplicacion.hibernate.configuracion.HibernateUtil;
import aplicacion.hibernate.dao.IProductoDao;
import aplicacion.modelo.dominio.Producto;
import aplicacion.modelo.dominio.Usuario;
import java.io.Serializable;
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
 * @author LENOVO
 */
public class ProductoDaoImp extends GenericDaoImp<Producto, Integer>implements IProductoDao,Serializable {

    @Override
    public List<Producto> obtenerProductos() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria=session.createCriteria(Producto.class);
        List<Producto> productos=criteria.list();
        session.close();
        return productos;
    }
    
}
