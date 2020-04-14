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

public interface UtentiDao {
    Utenti findById(String id);
    void saveUtente(Utenti u);
    void deleteUtente(String id);
    List<Utenti> findAllUtenti();
}
