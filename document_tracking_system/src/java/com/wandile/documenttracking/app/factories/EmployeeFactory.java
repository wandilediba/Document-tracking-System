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
import java.util.List;



/**
 *
 * @author 209043946
 */
public class EmployeeFactory {
    
    /* public static Employee createEmployee(List<Department> dept,Name name,List<Document> doc,Contact contact,int emp_id){
         Employee emp = new Employee();
         emp.setName(name);
         emp.setContact(contact);
         emp.setEmp_id(emp_id); 
         emp.setDocument(doc);
         
         return emp;*/
    
        public static Employee createEmployee(Name name,Contact contact,int emp_id){
         Employee emp = new Employee();
         emp.setName(name);
         emp.setContact(contact);
         emp.setEmp_id(emp_id); 
        // emp.setDocument(doc);
         
         return emp;
     }
    
    
}
