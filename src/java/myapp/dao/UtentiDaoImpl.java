/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
 
import myapp.model.Utenti;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author favaron
 */

@Repository("utentiDao")
public class UtentiDaoImpl implements UtentiDao {
    
    @Autowired
    private SessionFactory sessionFactory;
 
    protected Session getSession(){
        return sessionFactory.getCurrentSession();
    }
    
    @Override
    public Utenti findById(String id) {
        return (Utenti) getSession().get(Utenti.class, id);
    }

    @Override
    public void saveUtente(Utenti u) {
        getSession().persist(u);
    }

    @Override
    public void deleteUtente(String id) {
        Utenti u = (Utenti) getSession().load(Utenti.class, id);
	if(u!=null) getSession().delete(u);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Utenti> findAllUtenti() {
        Criteria criteria = getSession().createCriteria(Utenti.class);
        return (List<Utenti>) criteria.list();
    }
}
