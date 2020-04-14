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
 
import myapp.dao.EmployeeDao;
import myapp.model.Employee;
 
@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
 
    @Autowired
    private EmployeeDao dao;
     
    public Employee findById(int id) {
        return dao.findById(id);
    }
 
    public void saveEmployee(Employee employee) {
        dao.saveEmployee(employee);
    }
 
    public void updateEmployee(Employee employee) {
        Employee entity = dao.findById(employee.getId());
        if(entity!=null){
            entity.setName(employee.getName());
            entity.setSalary(employee.getSalary());
        }
    }
 
    public void deleteEmployee(int id) {
        dao.deleteEmployee(id);
    }
     
    public List<Employee> findAllEmployees() {
        return dao.findAllEmployees();
    }
 
   
}