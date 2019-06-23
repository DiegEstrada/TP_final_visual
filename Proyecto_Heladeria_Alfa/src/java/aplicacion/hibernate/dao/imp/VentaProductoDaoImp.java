/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.hibernate.dao.imp;

import aplicacion.hibernate.configuracion.HibernateUtil;
import aplicacion.hibernate.dao.IVentaProductoDao;
import aplicacion.modelo.dominio.VentaProducto;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;

/**
 *
 * @author LENOVO
 */
public class VentaProductoDaoImp extends GenericDaoImp<VentaProducto, Integer>implements IVentaProductoDao,Serializable{

    @Override
    public List<VentaProducto> obtenerVentaProductos() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria=session.createCriteria(VentaProducto.class);
        List<VentaProducto> ventaProductos=criteria.list();
        session.close();
        return ventaProductos;
    }
    
}
