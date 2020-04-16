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
 
import myapp.dao.AzioniCorrettiveDao;
import myapp.model.AzioniCorrettive;

/**
 *
 * @author favaron
 */

@Service("azioniCorrettiveService")
@Transactional
public class AzioniCorrettiveServiceImpl implements AzioniCorrettiveService {
 
    @Autowired
    private AzioniCorrettiveDao dao;
     
    @Override
    public AzioniCorrettive findById(String idAzione) {
        return dao.findById(idAzione);
    }
 
    @Override
    public void saveAzioneCorrettiva(AzioniCorrettive azioneCorrettiva) {
        dao.saveAzioneCorrettiva(azioneCorrettiva);
    }
 
    @Override
    public void updateAzioneCorrettiva(AzioniCorrettive azioneCorrettiva) {
        AzioniCorrettive entity = dao.findById(azioneCorrettiva.getIdAzione());
        if(entity!=null){
            entity.setCosto(azioneCorrettiva.getCosto());
            entity.setData(azioneCorrettiva.getData());
            entity.setSegnalazione(azioneCorrettiva.getSegnalazione());
            entity.setTeam(azioneCorrettiva.getTeam());
        }
    }
 
    @Override
    public void deleteAzioneCorrettiva(String idAzione) {
        dao.deleteAzioneCorrettiva(idAzione);
    }
     
    @Override
    public List<AzioniCorrettive> findAllAzioni() {
        return dao.findAllAzioni();
    }
}
