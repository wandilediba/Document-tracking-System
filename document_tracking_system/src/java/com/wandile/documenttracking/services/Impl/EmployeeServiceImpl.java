/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.services.Impl;

import com.wandile.documenttracking.app.factories.ContactFactory;
import com.wandile.documenttracking.app.factories.EmployeeFactory;
import com.wandile.documenttracking.app.factories.NameFactory;
import com.wandile.documenttracking.client.web.model.ContactModel;
import com.wandile.documenttracking.client.web.model.EmpModel;
import com.wandile.documenttracking.client.web.model.EmployeeModel;
import com.wandile.documenttracking.client.web.model.NameModel;
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
    public EmpModel getEmployeeToEdit(Long id) 
    {
        EmpModel model = new EmpModel();
        Employee employee = employeeCrudService.findById(id);
        model.setEmployeeNumber(employee.getEmployeeNumber());
        //Contact
        model.setEmail(employee.getContact().getEmail());
        model.setFax(employee.getContact().getFax());
        model.setTel(employee.getContact().getTel());
        //Name
        model.setFname(employee.getName().getFname());
        model.setLname(employee.getName().getLname());
        
        model.setId(employee.getId());
        return model;
        
        
        /*
        EmployeeModel model = new EmployeeModel();
        Employee employee = employeeCrudService.findById(id);
       
        
        model.setEmpoyeeNumber(employee.getEmployeeNumber());
        
        //name
        NameModel name = new NameModel();
        name.setFname(employee.getName().getFname());
        name.setLname(employee.getName().getLname());
        
        //Contact
        ContactModel contact = new ContactModel();
        
        contact.setTel(employee.getContact().getTel());
        contact.setFax(employee.getContact().getFax());
        contact.setEmail(employee.getContact().getEmail());
        
        
       // nameModel.
        model.setId(id);
        
        return model;*/
    }
    
    @Override
    public List<Employee> updateEmployee(EmpModel model, Long id) {
        
        Employee emp = employeeCrudService.findById(id);
        
        Map<String, String>nameValues = new HashMap<String, String>();
        nameValues.put("fname", model.getFname());
        nameValues.put("lname", model.getLname());
        
        Name name = NameFactory.createName(nameValues);
        
        Map<String, String>contactValues = new HashMap<String, String>();
        contactValues.put("tel", model.getTel());
        contactValues.put("fax", model.getFax());
        contactValues.put("email", model.getEmail());
        
        Contact contact = ContactFactory.createContact(contactValues);
        
        emp.setEmployeeNumber(model.getEmployeeNumber());
        emp.setName(name);
        emp.setContact(contact);
        
        employeeCrudService.merge(emp);
        
        return employeeCrudService.findAll();
        
    
      /*  
        Contact contact = new Contact();
        contact.setTel(model.getContactModel().getTel());
        contact.setFax(model.getContactModel().getFax());
        contact.setEmail(model.getContactModel().getEmail());
        
        Name name = new Name();
        name.setFname(model.getNameModel().getFname());
        name.setLname(model.getNameModel().getLname());
        
        employee.setContact(contact);
        employee.setName(name);
        employee.setId(model.getId());
//       
        
         
        employeeCrudService.merge(employee);
        return employeeCrudService.findAll();
        * */
    }

    @Override
    public List<Employee> getEmployee() {
        return employeeCrudService.findAll();
        }

    @Override
    public List<Employee> findAll() {
        return employeeCrudService.findAll();
    }
}
    
