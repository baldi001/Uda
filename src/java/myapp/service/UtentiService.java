/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp.service;

import java.util.List;
 
import myapp.model.Utenti;
/**
 *
 * @author favaron
 */
public interface UtentiService {
    Utenti findById(String username);
    void saveUtente(Utenti utente);
    void updateUtente(Utenti utente);
    void deleteUtente(String username);
    List<Utenti> findAllUtenti();
}
