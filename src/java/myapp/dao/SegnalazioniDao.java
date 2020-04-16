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
 
import myapp.model.Segnalazioni;
import myapp.model.Team;
 
public interface SegnalazioniDao {
    Segnalazioni findById(String id);
    void saveSegnalazione(Segnalazioni s);
    void deleteSegnalazione(String id);
    List<Segnalazioni> findAllSegnalazioni();
 }
