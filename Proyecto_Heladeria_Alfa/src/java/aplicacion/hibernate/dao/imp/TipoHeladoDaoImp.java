/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.hibernate.dao.imp;

import aplicacion.hibernate.configuracion.HibernateUtil;
import aplicacion.hibernate.dao.ITipoHeladoDao;
import aplicacion.modelo.dominio.TipoHelado;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;

/**
 *
 * @author LENOVO
 */
public class TipoHeladoDaoImp implements ITipoHeladoDao, Serializable {

    @Override
    public List<TipoHelado> obtenerTipoHelados() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(TipoHelado.class);
        List<TipoHelado> tipoHelados = criteria.list();
        session.close();
        return tipoHelados;
    }

}
