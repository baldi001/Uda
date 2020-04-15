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
 
import myapp.dao.TeamDao;
import myapp.model.Team;
/**
 *
 * @author favaron
 */

@Service("teamService")
@Transactional
public class TeamServiceImpl implements TeamService{
    
    @Autowired
    private TeamDao dao;
    
    @Override
    public Team findById(int idTeam) {
        return dao.findById(idTeam);
    }
 
    @Override
    public void saveTeam(Team team) {
        dao.saveTeam(team);
    }
 
    @Override
    public void updateTeam(Team team) {
        Team entity = dao.findById(team.getIdTeam());
        if(entity!=null){
            entity.setNomeTeam(team.getNomeTeam());
            entity.setSettore(team.getSettore());
            entity.setAzioniCorrettiveCollection(team.getAzioniCorrettiveCollection());
            entity.setUtenti(team.getUtenti());
        }
    }
 
    @Override
    public void deleteTeam(int idTeam) {
        dao.deleteTeam(idTeam);
    }
     
    @Override
    public List<Team> findAllTeam() {
        return dao.findAllTeam();
    }
    
}
