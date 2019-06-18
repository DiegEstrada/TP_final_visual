package aplicacion.hibernate.dao.imp;

import aplicacion.hibernate.configuracion.HibernateUtil;
import aplicacion.hibernate.dao.ITipoUsuarioDao;
import aplicacion.modelo.dominio.TipoUsuario;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;


public class TipoUsuarioDaoImp implements ITipoUsuarioDao, Serializable{

    @Override
    public List<TipoUsuario> obtenerTipoUsuarios() {
        Session session= HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(TipoUsuario.class);
        List<TipoUsuario> tipoUsuarios= criteria.list();
        session.close();
        return tipoUsuarios;
    }
    
}
