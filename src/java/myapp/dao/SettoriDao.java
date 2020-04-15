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
import myapp.model.Settori;

public interface SettoriDao {
    Settori findById(int id);
    void saveSettore(Settori s);
    void deleteSettore(int id);
    List<Settori> findAllSettori();
 }
