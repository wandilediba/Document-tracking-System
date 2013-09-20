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
import org.springframework.beans.factory.annotation.Autowire;
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
    public List<Employee> createEmployee(EmployeeModel model) {
         
       
         Map<String, String> details = new HashMap<String, String>();      
         int empid = 0;
        
        //Name 
     
       Name name = NameFactory.createName(details);
       name.setFname(model.getName().getFname());
       name.setLname(model.getName().getLname());
        
       
       //Conatct
        Contact contact = ContactFactory.createContact(details);
        contact.setFax(model.getContact().getFax());
        contact.setEmail(model.getContact().getEmail());
        contact.setTel(model.getContact().getTel());
        
         
        
        Employee employee = EmployeeFactory.createEmployee(details, empid);
        employee.setEmp_id(empid);
        employee.setName(name);
        employee.setContact(contact);
        
        
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
        model.setEmp_id(employee.getEmp_id());
       
        return model;
    }
    @Override
    public List<Employee> updateEmployee(EmployeeModel model) {
        Employee employee = new Employee(); // DONT DO THIS USE FACTORY
        employee.setEmp_id(model.getEmp_id());
        
        employeeCrudService.merge(employee);
        return employeeCrudService.findAll();
    }

    @Override
    public List<Employee> getEmployee() {
        return employeeCrudService.findAll();
        }
}
    
