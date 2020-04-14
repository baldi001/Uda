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
import myapp.model.Team;

public interface TeamDao {
    Team findById(int id);
    void saveTeam(Team t);
    void deleteTeam(int id);
    List<Team> findAllTeam();
 }
