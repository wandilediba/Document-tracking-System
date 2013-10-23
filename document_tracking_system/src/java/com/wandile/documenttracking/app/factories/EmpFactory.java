/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.app.factories;

import com.wandile.documenttracking.domain.Contact;
import com.wandile.documenttracking.domain.Employee;
import com.wandile.documenttracking.domain.Name;
import java.util.Map;

/**
 *
 * @author DibaW
 */
public class EmpFactory 
{
    public static Employee getEmployee(Map<String, String>empValues, Name name, Contact contact)
    {
        Employee employees = new Employee();
        employees.setName(name);
        employees.setContact(contact);
        employees.setEmployeeNumber(empValues.get("employeeNumber"));
        
        
        return employees;
    }
    
}
