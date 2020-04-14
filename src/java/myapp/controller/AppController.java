/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myapp.controller;


import java.util.List;
import myapp.model.AzioniCorrettive;
import myapp.model.Utenti;
import myapp.service.AzioniCorrettiveService;
import myapp.service.UtentiService;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.ModelAttribute;

 
@Controller
@RequestMapping("/")
@ComponentScan("myapp.service")
public class AppController {
    
    
    @Autowired
    UtentiService utenteservice;
    AzioniCorrettiveService azionecorservice;

    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String index(ModelMap model) {
        model.addAttribute("utente", new Utenti());
        return "login";
    }
    

    @RequestMapping(value = {"/goRegister"}, method = RequestMethod.GET)
    public String goRegister(ModelMap model) {
        model.addAttribute("utente", new Utenti());
        return "registrazione";
    }
    
    @RequestMapping(value = {"/checkLogin"}, method = RequestMethod.GET)
    public String checkLogin(@ModelAttribute("utente") Utenti u, ModelMap model){
        model.addAttribute("loggeduser", u);
        List<Utenti> users = utenteservice.findAllUtenti();
        for(Utenti ui : users){
            if(ui.getUsername().equals(u.getUsername()) && ui.getPass().equals(u.getPass())){
                if(ui.getResponsabile().equals("no")) return "pgbenvenutout";
                else return "pgBenvenutoAmm";
            }
        }
        return "redirect:/";
    }
 
    @RequestMapping(value = {"/doRegister"}, method = RequestMethod.GET)
    public String doRegister(@ModelAttribute("utente") Utenti u, ModelMap model){
        utenteservice.saveUtente(u);
        return "login";
    }
    
    @RequestMapping(value = {"/listDoAzioni"}, method = RequestMethod.POST)
    public String listDoAzioni(@ModelAttribute("loggeduser")Utenti u, ModelMap model){
        List<AzioniCorrettive>azioniCorrettive = azionecorservice.findAllAzioni();
        List<AzioniCorrettive>azioniCorrettiveUt = null;
        for(AzioniCorrettive a : azioniCorrettive){
            if(a.getTeam()== u.getTeam()) azioniCorrettiveUt.add(a);
        }
        model.addAttribute("listaAzioni", azioniCorrettiveUt);
        
        return "azioniDaFare";
    }
    
}
