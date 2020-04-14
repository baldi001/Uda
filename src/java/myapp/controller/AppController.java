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
 
import myapp.model.Employee;
import myapp.service.EmployeeService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.ModelAttribute;
 
@Controller
@RequestMapping("/")
@ComponentScan("myapp.service")
public class AppController {
 
    @Autowired
    EmployeeService service;
     
 
    /*
     * This method will list all existing employees.
     */
    @RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
    public String listEmployees(ModelMap model) {
 
        List<Employee> employees = service.findAllEmployees();
        model.addAttribute("tutti", employees);
        return "impiegatil";
    }
 
    @RequestMapping(value = "/add" , method = RequestMethod.GET)
    public String newEmployee(ModelMap model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "add";
    }

    
    //For add and update person both
    @RequestMapping(value= "/add", method = RequestMethod.POST)
    public String addEmpl(@ModelAttribute("employee") Employee e){
		
	if(e.getId() == 0) this.service.saveEmployee(e);
        else this.service.updateEmployee(e);
        
	return "redirect:/";
		
    }
	
    @RequestMapping("/remove/{id}")
    public String removeEmpl(@PathVariable("id") int id){
	this.service.deleteEmployee(id);
        return "redirect:/";
    }
 
    @RequestMapping("/edit/{id}")
    public String editPerson(@PathVariable("id") int id, ModelMap model){
        model.addAttribute("employee", this.service.findById(id));
        return "edit";
    }
	
}
