/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.services.Impl;

import com.wandile.documenttracking.app.factories.ContactFactory;
import com.wandile.documenttracking.app.factories.EmployeeFactory;
import com.wandile.documenttracking.app.factories.NameFactory;
import com.wandile.documenttracking.client.web.model.EmployeeModel;
import com.wandile.documenttracking.domain.Contact;
import com.wandile.documenttracking.domain.Employee;
import com.wandile.documenttracking.domain.Name;
import com.wandile.documenttracking.services.EmployeeService;
import com.wandile.documenttracking.services.crud.EmployeeCrudService;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author DibaW
 */
@Service("EmployeeService")
public class EmployeeServiceImpl implements EmployeeService{
    
    @Autowired
    private EmployeeCrudService employeeCrudService;

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public List<Employee> createEmployees(EmployeeModel model) {
         
       
         Map<String, String> details = new HashMap<String, String>();      
        // int empid = 0;
        
        //Name 
      
        // details.put("FName", model.getFName());
        // details.put("LName", model.getLName());
         
       Name name = new Name();//NameFactory.createName(details);
       name.setFname(model.getNameModel().getFname());
       name.setLname(model.getNameModel().getLname());
        
       
       //Conatct
       
       //details.put("fax", model.getFax());
      // details.put("tel", model.getTel());
       //details.put("Email", model.getEmail());
       Contact contact = new Contact();//ContactFactory.createContact(details);
       contact.setFax(model.getContactModel().getFax());
       contact.setEmail(model.getContactModel().getEmail());
       contact.setTel(model.getContactModel().getTel());
        
         
        
        Employee employee = new Employee();//EmployeeFactory.createEmployee(details, model.getEmp_id());
        employee.setId(model.getId());
        employee.setName(name);
        employee.setContact(contact);
        
        employee.setId(model.getId());
        employeeCrudService.persist(employee);
        return employeeCrudService.findAll();
    }

    @Override
    public List<Employee> deleteEmployee(Long id) {
        employeeCrudService.removeById(id);
        return employeeCrudService.findAll();
    }

    @Override
    public EmployeeModel getEmployeeToEdit(Long id) {
        EmployeeModel model = new EmployeeModel();
        Employee employee = employeeCrudService.findById(id);
        model.setEmpoyeeNumber(employee.getEmployeeNumber());
       
        return model;
    }
    @Override
    public List<Employee> updateEmployee(EmployeeModel model) {
        Employee employee = new Employee(); // DONT DO THIS USE FACTORY
        employee.setId(model.getId());
         
        employeeCrudService.merge(employee);
        return employeeCrudService.findAll();
    }

    @Override
    public List<Employee> getEmployee() {
        return employeeCrudService.findAll();
        }
}
    
