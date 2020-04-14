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
 
import myapp.dao.UtentiDao;
import myapp.model.Utenti;

/**
 *
 * @author favaron
 */

@Service("utentiService")
@Transactional
public class UtentiServiceImpl implements UtentiService{
    @Autowired
    private UtentiDao dao;
     
    @Override
    public Utenti findById(String username) {
        return dao.findById(username);
    }
 
    @Override
    public void saveUtente(Utenti utente) {
        dao.saveUtente(utente);
    }
 
    @Override
    public void updateUtente(Utenti utente) {
        Utenti entity = dao.findById(utente.getUsername());
        if(entity!=null){
            entity.setNome(utente.getNome());
            entity.setCognome(utente.getCognome());
            entity.setPass(utente.getPass());
            entity.setResponsabile(utente.getResponsabile());
            entity.setSettoriCollection(utente.getSettoriCollection());
            entity.setSegnalazioniCollection(utente.getSegnalazioniCollection());
            entity.setVerificaAzioniCorrettiveCollection(utente.getVerificaAzioniCorrettiveCollection());
        }
    }
 
    @Override
    public void deleteUtente(String username) {
        dao.deleteUtente(username);
    }
     
    @Override
    public List<Utenti> findAllUtenti() {
        return dao.findAllUtenti();
    }
}
