/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
 
import myapp.model.VerificaAzioniCorrettive;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author favaron
 */

@Repository("verificaAzioniCorrettiveDao")
public class VerificaAzioniCorrettiveDaoImpl implements VerificaAzioniCorrettiveDao {
    
    @Autowired
    private SessionFactory sessionFactory;
 
    protected Session getSession(){
        return sessionFactory.getCurrentSession();
    }
    
    @Override
    public VerificaAzioniCorrettive findById(int id) {
        return (VerificaAzioniCorrettive) getSession().get(VerificaAzioniCorrettive.class, id);
    }

    @Override
    public void saveVerificaAzioneCorrettiva(VerificaAzioniCorrettive v) {
        getSession().persist(v);
    }

    @Override
    public void deleteVerificaAzioneCorrettiva(int id) {
        VerificaAzioniCorrettive v = (VerificaAzioniCorrettive) getSession().load(VerificaAzioniCorrettive.class, id);
	if(v!=null) getSession().delete(v);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<VerificaAzioniCorrettive> findAllVerificaAzioniCorrettive() {
        Criteria criteria = getSession().createCriteria(VerificaAzioniCorrettive.class);
        return (List<VerificaAzioniCorrettive>) criteria.list();
    }
}
