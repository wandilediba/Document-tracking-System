/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.app.factories;

import com.wandile.documenttracking.domain.Contact;
import com.wandile.documenttracking.domain.Department;
import com.wandile.documenttracking.domain.Employee;
import com.wandile.documenttracking.domain.Name;
import java.util.Map;



/**
 *
 * @author 209043946
 */
public class EmployeeFactory {
        public static Employee createEmployee(Map<String, String> values){
        Employee employee = new Employee();
        
         /*Name name = new Name();
         name.setFname(values.get("fname"));
         name.setLname(values.get("lname"));
         
          
         
         Contact  contact = new Contact();
         
         contact.setTel(values.get("tel"));
         contact.setFax(values.get("fax"));
         contact.setEmail(values.get("email"));*/
         
         
        // DeptInfo info = DeptInfoFactory.createDeptInfo(values);
         //Department dept = new Department();
         //dept.setDeptid(deptid);
         //dept.setDeptid(deptid);
         //dept.set
        Name name = NameFactory.createName(values);
        
        Contact contact = ContactFactory.createContact(values);
                 
         employee.setContact(contact);
         employee.setName(name);
         employee.setEmployeeNumber(values.get("empNumber"));
         //employee.setEmp_id(empid);
         //employee.setDepartment(dept);
         
         
         return employee;
     }
    
    
}
