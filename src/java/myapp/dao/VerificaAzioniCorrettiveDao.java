/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp.dao;

/**
 *
 * @author favaron
 */
import java.util.List;
import myapp.model.Utenti;
import myapp.model.VerificaAzioniCorrettive;

public interface VerificaAzioniCorrettiveDao {
    VerificaAzioniCorrettive findById(int id);
    void saveVerificaAzioneCorrettiva(VerificaAzioniCorrettive u);
    void deleteVerificaAzioneCorrettiva(int id);
    List<VerificaAzioniCorrettive> findAllVerificaAzioniCorrettive();
}