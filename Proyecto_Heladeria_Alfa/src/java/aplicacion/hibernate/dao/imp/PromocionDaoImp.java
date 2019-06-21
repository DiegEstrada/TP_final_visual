/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.hibernate.dao.imp;

import aplicacion.hibernate.configuracion.HibernateUtil;
import aplicacion.hibernate.dao.IPromocionDao;
import aplicacion.modelo.dominio.Promocion;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;

/**
 *
 * @author LENOVO
 */
public class PromocionDaoImp extends GenericDaoImp<Promocion, Integer>implements IPromocionDao,Serializable {

    @Override
    public List<Promocion> obtenerPromociones() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria=session.createCriteria(Promocion.class);
        List<Promocion> promociones=criteria.list();
        session.close();
        return promociones;
    }
    
}
