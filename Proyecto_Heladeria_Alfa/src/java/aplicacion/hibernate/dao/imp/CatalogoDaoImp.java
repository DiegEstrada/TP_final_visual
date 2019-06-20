/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.hibernate.dao.imp;

import aplicacion.hibernate.configuracion.HibernateUtil;
import aplicacion.hibernate.dao.ICatalogoDao;
import aplicacion.modelo.dominio.Catalogo;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;

/**
 *
 * @author LENOVO
 */
public class CatalogoDaoImp extends GenericDaoImp<Catalogo, Integer> implements ICatalogoDao, Serializable{

    @Override
    public List<Catalogo> obtenerCatalogos() {
         Session session= HibernateUtil.getSessionFactory().openSession();
         Criteria criteria=session.createCriteria(Catalogo.class);
         List<Catalogo> catalogos =criteria.list();
         session.close();
         return catalogos;
    }
    
}
