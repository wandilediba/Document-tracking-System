/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.app.factories;

import com.wandile.documenttracking.domain.Contact;
import com.wandile.documenttracking.domain.Document;
import com.wandile.documenttracking.domain.Employee;
import com.wandile.documenttracking.domain.Name;
import java.util.Map;
import sun.org.mozilla.javascript.internal.Node;

/**
 *
 * @author 209043946
 */
public class EmployeeFactory {
    
    public static Employee getPerson(Map<String, String> value, int emp_id,int fax, int tel, int docId){
    
        Employee emp = new Employee();
        emp.setEmp_id(emp_id);
        
        Name name = new Name();
        name.setFname(value.get("fname"));
        name.setLname(value.get("lname"));
        
        Contact contact  =  new Contact();
        contact.setEmail(value.get("email"));
        contact.setFax(fax);
        contact.setTel(tel);
        
        emp.setName(name);
        emp.setContact(contact);
        return emp;
    }
    
}
