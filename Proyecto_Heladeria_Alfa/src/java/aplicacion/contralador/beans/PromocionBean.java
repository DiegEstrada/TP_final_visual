/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.contralador.beans;

import aplicacion.hibernate.dao.IPromocionDao;
import aplicacion.hibernate.dao.imp.PromocionDaoImp;
import aplicacion.modelo.dominio.Promocion;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;



@ManagedBean
@SessionScoped
public class PromocionBean implements Serializable {

    IPromocionDao promocionDao;

    public PromocionBean() {
        promocionDao = new PromocionDaoImp();
    }

    public void crearPromocion(Promocion promocionACrear) {
        promocionDao.create(promocionACrear);
    }

    public void eliminarPromocion(Promocion promocionAEliminar) {
        promocionDao.delete(promocionAEliminar);
    }

    public void modificarPromocion(Promocion promocionAModificar) {
        promocionDao.update(promocionAModificar);
    }

    public List<Promocion> obtenerPromociones() {
        return promocionDao.obtenerPromociones();
    }

    public IPromocionDao getPromocionDao() {
        return promocionDao;
    }

    public void setPromocionDao(IPromocionDao promocionDao) {
        this.promocionDao = promocionDao;
    }

}
