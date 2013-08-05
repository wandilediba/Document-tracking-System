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
    
    
        public static Employee createCustomer(Map<String,String> values,int emp_id, int fax,int tel){
         Employee emp = new Employee();
         Name name = NameFactory.createName(values);
         Contact contact = ContactFactory.createContact(values,fax, tel);
        
         emp.setContact(contact);
         
         emp.setName(name);
         
         return emp;
     }
    
    
}
