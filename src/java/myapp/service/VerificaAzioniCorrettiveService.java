/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp.service;

import java.util.List;

import myapp.model.VerificaAzioniCorrettive;
/**
 *
 * @author favaron
 */
public interface VerificaAzioniCorrettiveService {
    VerificaAzioniCorrettive findById(int idVerifica);
    void saveVerificaAzioneCorrettiva(VerificaAzioniCorrettive verificaAzioneCorrettiva);
    void updateVerificaAzioneCorrettiva(VerificaAzioniCorrettive verificaAzioneCorrettiva);
    void deleteVerificaAzioneCorrettiva(int idVerifica);
    List<VerificaAzioniCorrettive> findAllVerificaAzioniCorrettive();
}
