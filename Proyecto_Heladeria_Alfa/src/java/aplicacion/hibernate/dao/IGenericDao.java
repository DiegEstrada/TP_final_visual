package aplicacion.hibernate.dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Alfa
 */
public interface IGenericDao<T,ID> {
    void create(T object);
    void delete(T object);
    void update(T object);
}
