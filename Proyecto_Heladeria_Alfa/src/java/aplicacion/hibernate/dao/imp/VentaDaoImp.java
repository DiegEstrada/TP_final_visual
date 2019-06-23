/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.hibernate.dao.imp;

import aplicacion.hibernate.configuracion.HibernateUtil;
import aplicacion.hibernate.dao.IVentaDao;
import aplicacion.modelo.dominio.Venta;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;


public class VentaDaoImp extends GenericDaoImp<Venta, Integer>implements IVentaDao,Serializable{

    @Override
    public List<Venta> obtenerVentas() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria=session.createCriteria(Venta.class);
        List<Venta> ventas=criteria.list();
        session.close();
        return ventas;
    }
    
}
