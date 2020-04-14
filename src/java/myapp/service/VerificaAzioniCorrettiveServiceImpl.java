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
 
import myapp.dao.VerificaAzioniCorrettiveDao;
import myapp.model.VerificaAzioniCorrettive;

/**
 *
 * @author favaron
 */

@Service("verificaAzioniCorrettiveService")
@Transactional
public class VerificaAzioniCorrettiveServiceImpl implements VerificaAzioniCorrettiveService {
 
    @Autowired
    private VerificaAzioniCorrettiveDao dao;
     
    @Override
    public VerificaAzioniCorrettive findById(int idVerifica) {
        return dao.findById(idVerifica);
    }
 
    @Override
    public void saveVerificaAzioneCorrettiva(VerificaAzioniCorrettive verificaAzioneCorrettiva) {
        dao.saveVerificaAzioneCorrettiva(verificaAzioneCorrettiva);
    }
 
    @Override
    public void updateVerificaAzioneCorrettiva(VerificaAzioniCorrettive verificaAzioneCorrettiva) {
        VerificaAzioniCorrettive entity = dao.findById(verificaAzioneCorrettiva.getIdVerifica());
        if(entity!=null){
            entity.setUtente(verificaAzioneCorrettiva.getUtente());
            entity.setAzioneCorrettiva(verificaAzioneCorrettiva.getAzioneCorrettiva());
        }
    }
 
    @Override
    public void deleteVerificaAzioneCorrettiva(int idAzione) {
        dao.deleteVerificaAzioneCorrettiva(idAzione);
    }
     
    @Override
    public List<VerificaAzioniCorrettive> findAllVerificaAzioniCorrettive() {
        return dao.findAllVerificaAzioniCorrettive();
    }
}