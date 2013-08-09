/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.app.factories;

import com.wandile.documenttracking.domain.Contact;
import com.wandile.documenttracking.domain.Department;
import com.wandile.documenttracking.domain.Document;
import com.wandile.documenttracking.domain.Employee;
import com.wandile.documenttracking.domain.Name;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



/**
 *
 * @author 209043946
 */
public class EmployeeFactory {
        public static Employee createEmployee(Name  name,Contact contact , int empid){
        Employee employee = new Employee();
         Map<String, String> values = new HashMap<String, String>();
          name = NameFactory.createName(values);
         
          contact = ContactFactory.createContact(values);
         
         employee.setContact(contact);
         employee.setName(name);
         employee.setEmp_id(empid);
         
         return employee;
     }
    
    
}
