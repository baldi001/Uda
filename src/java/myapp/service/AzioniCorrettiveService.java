/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp.service;

import java.util.List;

import myapp.model.AzioniCorrettive;
/**
 *
 * @author favaron
 */
public interface AzioniCorrettiveService {
    AzioniCorrettive findById(String idAzione);
    void saveAzioneCorrettiva(AzioniCorrettive azioneCorrettiva);
    void updateAzioneCorrettiva(AzioniCorrettive azioneCorrettiva);
    void deleteAzioneCorrettiva(String idAzione);
    List<AzioniCorrettive> findAllAzioni();
}
