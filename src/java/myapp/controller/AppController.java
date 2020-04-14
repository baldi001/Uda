/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myapp.controller;

import java.util.List;
 
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
import myapp.model.Utenti;
import myapp.service.UtentiService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.ModelAttribute;
 
@Controller
@RequestMapping("/")
@ComponentScan("myapp.service")
public class AppController {
 
    @Autowired
    UtentiService utente;
     
 
    /*
     * This method will list all existing employees.
     */
    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
        public String index(ModelMap model) {
        model.addAttribute("utente", new Utenti());
        return "login";
    }
    
}
