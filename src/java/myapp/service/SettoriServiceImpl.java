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
 
import myapp.dao.SettoriDao;
import myapp.model.Settori;

/**
 *
 * @author favaron
 */

@Service("settoriService")
@Transactional
public class SettoriServiceImpl implements SettoriService{

    @Autowired
    private SettoriDao dao;
    
    @Override
    public Settori findById(int idSettore) {
        return dao.findById(idSettore);
    }

    @Override
    public void saveSettore(Settori settore) {
        dao.saveSettore(settore);
    }

    @Override
    public void updateSettore(Settori settore) {
        Settori entity = dao.findById(settore.getIdSettore());
        if(entity!=null){
            entity.setNome(settore.getNome());
            entity.setUtente(settore.getUtente());
            entity.setSegnalazioniCollection(settore.getSegnalazioniCollection());
        }
    }

    @Override
    public void deleteSettore(int idSettore) {
        dao.deleteSettore(idSettore);
    }

    @Override
    public List<Settori> findAllSettori() {
        return dao.findAllSettori();
    }
    
}
