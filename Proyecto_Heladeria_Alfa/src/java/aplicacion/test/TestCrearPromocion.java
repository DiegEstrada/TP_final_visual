/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.test;

import aplicacion.hibernate.dao.IPromocionDao;
import aplicacion.hibernate.dao.imp.PromocionDaoImp;
import aplicacion.modelo.dominio.Promocion;
import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class TestCrearPromocion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IPromocionDao promocionDao= new PromocionDaoImp();
        Promocion promocion = new Promocion();
        
        promocion.setDescuento(10.0);
        promocion.setFechaFin(new Date());
        promocion.setFechaInicio(new Date());
        promocion.setNombre("invierano");
        promocionDao.create(promocion);
    }
    
}
