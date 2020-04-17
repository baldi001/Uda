/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myapp.controller;


import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import myapp.model.AzioniCorrettive;
import myapp.model.Utenti;
import myapp.model.Segnalazioni;
import myapp.model.Settori;
import myapp.model.Team;
import myapp.model.VerificaAzioniCorrettive;
import myapp.service.AzioniCorrettiveService;
import myapp.service.UtentiService;
import myapp.service.SegnalazioniService;
import myapp.service.VerificaAzioniCorrettiveService;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

 
@Controller
@RequestMapping("/")
@ComponentScan("myapp.service")
public class AppController {
    
    
    @Autowired
    UtentiService utenteservice;
    @Autowired
    AzioniCorrettiveService azionecorservice;
    @Autowired
    SegnalazioniService segnalazioneservice;
    @Autowired
    VerificaAzioniCorrettiveService verazionecorservice;
    
    Utenti loggeduser = null;

    @RequestMapping(value = {"/","/list"}, method = RequestMethod.GET)
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
        loggeduser = utenteservice.findById(u.getUsername());
        List<Utenti> users = utenteservice.findAllUtenti();
        for(Utenti ui : users){
            if(ui.getUsername().equals(u.getUsername()) && ui.getPass().equals(u.getPass())){
                if(ui.getResponsabile().equals("no")) return "pgbenvenutout";
                else return "pgBenvenutoAmm";
            }
        }
        return "redirect:/";
    }
    
    @RequestMapping(value = {"/checkLogin2"}, method = RequestMethod.GET)
    public String checkLogin2(@ModelAttribute("utente") Utenti u, ModelMap model){
        List<Utenti> users = utenteservice.findAllUtenti();
        for(Utenti ui : users){
            if(ui.getUsername().equals(loggeduser.getUsername()) && ui.getPass().equals(loggeduser.getPass())){
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
    
    @RequestMapping(value = {"/listDoAzioni"}, method = RequestMethod.GET)
    public String listDoAzioni(ModelMap model){
        List<AzioniCorrettive> azioniCorrettive = azionecorservice.findAllAzioni();
        ArrayList<AzioniCorrettive> azioniCorrettiveUt = new ArrayList<AzioniCorrettive>();
        Set<Team> listateam = loggeduser.getTeam();
        for(AzioniCorrettive a : azioniCorrettive){
            for(Team t : listateam){
                if(t.getNomeTeam().equals(a.getTeam().getNomeTeam())) azioniCorrettiveUt.add(a);
            }
        }
        model.addAttribute("listaAzioni", azioniCorrettiveUt);
        return "azioniDaFare";
    }
    
    @RequestMapping(value = {"/listSegnalazioni"}, method = RequestMethod.GET)
    public String listSegnalazioni(ModelMap model){
        List<Segnalazioni> listaSeg = segnalazioneservice.findAllSegnalazioni();
        ArrayList<Segnalazioni> daVisualizzare = new ArrayList<Segnalazioni>();
        Set<Settori> sett = loggeduser.getSettoriCollection();
        for(Segnalazioni x : listaSeg){
            for(Settori s:sett){
                if(s.getIdSettore()== x.getSettore().getIdSettore()) daVisualizzare.add(x);
            }
        }
        model.addAttribute("listaSegnalazioni", daVisualizzare);
        return "VisualizzaSegnalazioni";
    }
    
    @RequestMapping(value = {"/listVerificaAzioni"}, method = RequestMethod.GET)
    public String listVerificaAzioni(ModelMap model){
        List<VerificaAzioniCorrettive> verificaAzioniCorrettive = verazionecorservice.findAllVerificaAzioniCorrettive();
        Set<VerificaAzioniCorrettive> listaac = loggeduser.getVerificaAzioniCorrettiveCollection();
        model.addAttribute("listaVerificaAzioni", listaac);
        return "VerificaAzioni";
    }
    
    @RequestMapping(value = {"/removeAzioneCorrettiva/{idVerifica}"})
    public String Remove(@PathVariable("idVerifica") int id){
        this.verazionecorservice.deleteVerificaAzioneCorrettiva(id);
        return "redirect:/checkLogin2";
    }
    
    @RequestMapping(value = {"/goSegnalazione"}, method = RequestMethod.GET)
    public String goSegnalazione(ModelMap model){
        model.addAttribute("segnalazione",new Segnalazioni());
        return "CreaSegnalazione";
    }
    
    @RequestMapping(value = {"/doSegnalazione"}, method = RequestMethod.GET)
    public String doSegnalazione(@ModelAttribute("segnalazione") Segnalazioni s , ModelMap model){
        segnalazioneservice.saveSegnalazione(s);
        return "pgbenvenutout";
    }
    
    @RequestMapping(value = {"/verificaAzione1"}, method = RequestMethod.GET)
    public String verificaAzione(ModelMap model){
        model.addAttribute("azionedaveri",new VerificaAzioniCorrettive());
        return "FaiVerificare";
    }
    @RequestMapping(value = {"/verificaAzione2"}, method = RequestMethod.GET)
    public String verificaAzione2(@ModelAttribute("azionedaveri") VerificaAzioniCorrettive a , ModelMap model){
        verazionecorservice.saveVerificaAzioneCorrettiva(a);
        return "pgBenvenutoAmm";
    }
}
