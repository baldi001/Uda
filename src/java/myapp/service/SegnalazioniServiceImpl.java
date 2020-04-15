/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp.service;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
import myapp.dao.SegnalazioniDao;
import myapp.model.Segnalazioni;

/**
 *
 * @author favaron
 */

@Service("segnalazioniService")
@Transactional
public class SegnalazioniServiceImpl implements SegnalazioniService{
    
    @Autowired
    private SegnalazioniDao dao;
    
    @Override
    public Segnalazioni findById(int idSegnalazione) {
        return dao.findById(idSegnalazione);
    }

    @Override
    public void saveSegnalazione(Segnalazioni segnalazione) {
        dao.saveSegnalazione(segnalazione);
    }

    @Override
    public void updateSegnalazione(Segnalazioni segnalazione) {
        Segnalazioni entity = dao.findById(segnalazione.getIdSegnalazione());
        if(entity!=null){
            entity.setData(segnalazione.getData());
            entity.setTipo(segnalazione.getTipo());
            entity.setDescrizione(segnalazione.getDescrizione());
            entity.setUtente(segnalazione.getUtente());
            entity.setSettore(segnalazione.getSettore());
            entity.setAzioniCorrettiveCollection(segnalazione.getAzioniCorrettiveCollection());
        }
    }

    @Override
    public void deleteSegnalazione(int idSegnalazione) {
            dao.deleteSegnalazione(idSegnalazione);
    }

    @Override
    public List<Segnalazioni> findAllSegnalazioni() {
        return dao.findAllSegnalazioni();
    }
    
}
