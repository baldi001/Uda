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
import myapp.model.AzioniCorrettive;

public interface AzioniCorrettiveDao {
    AzioniCorrettive findById(int id);
    void saveAzioneCorrettiva(AzioniCorrettive a);
    void deleteAzioneCorrettiva(int id);
    List<AzioniCorrettive> findAllAzioni();
 }
