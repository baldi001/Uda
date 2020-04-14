/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp.dao;

import java.util.List;
 
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
 
import myapp.model.Segnalazioni;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author favaron
 */

@Repository("segnalazioniDao")
public class SegnalazioniDaoImpl implements SegnalazioniDao {
    
    @Autowired
    private SessionFactory sessionFactory;
    
    protected Session getSession(){
        return sessionFactory.getCurrentSession();
    }
    
    @Override
    public Segnalazioni findById(int id) {
        return (Segnalazioni) getSession().get(Segnalazioni.class, id);
    }

    @Override
    public void saveSegnalazione(Segnalazioni s) {
         getSession().persist(s);
    }

    @Override
    public void deleteSegnalazione(int id) {
        Segnalazioni s = (Segnalazioni) getSession().load(Segnalazioni.class, id);
	if(s!=null) getSession().delete(s);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Segnalazioni> findAllSegnalazioni() {
        Criteria criteria = getSession().createCriteria(Segnalazioni.class);
        return (List<Segnalazioni>) criteria.list();
    }
    
}
