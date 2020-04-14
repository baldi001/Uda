/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp.dao;

import java.util.List;
 
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
 
import myapp.model.AzioniCorrettive;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author favaron
 */

@Repository("azioniCorrettiveDao")
public class AzioniCorrettiveDaoImpl implements AzioniCorrettiveDao {
    
    @Autowired
    private SessionFactory sessionFactory;
    
    protected Session getSession(){
        return sessionFactory.getCurrentSession();
    }
    
    @Override
    public AzioniCorrettive findById(int id) {
        return (AzioniCorrettive) getSession().get(AzioniCorrettive.class, id);
    }

    @Override
    public void saveAzioneCorrettiva(AzioniCorrettive a) {
        getSession().persist(a);
    }

    @Override
    public void deleteAzioneCorrettiva(int id) {
        AzioniCorrettive a = (AzioniCorrettive) getSession().load(AzioniCorrettive.class, id);
	if(a!=null) getSession().delete(a);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<AzioniCorrettive> findAllAzioni() {
        Criteria criteria = getSession().createCriteria(AzioniCorrettive.class);
        return (List<AzioniCorrettive>) criteria.list();
    }
    
}
