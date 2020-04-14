/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp.dao;

import java.util.List;
 
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
 
import myapp.model.Settori;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author favaron
 */

@Repository("settoriDao")
public class SettoriDaoImpl implements SettoriDao {
    
    @Autowired
    private SessionFactory sessionFactory;
 
    protected Session getSession(){
        return sessionFactory.getCurrentSession();
    }
    
    @Override
    public Settori findById(int id) {
        return (Settori) getSession().get(Settori.class, id);
    }

    @Override
    public void saveSettore(Settori s) {
        getSession().persist(s);
    }

    @Override
    public void deleteSettore(int id) {
        Settori s = (Settori) getSession().load(Settori.class, id);
	if(s!=null) getSession().delete(s);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Settori> findAllSettori() {
        Criteria criteria = getSession().createCriteria(Settori.class);
        return (List<Settori>) criteria.list();
    }
    
}
