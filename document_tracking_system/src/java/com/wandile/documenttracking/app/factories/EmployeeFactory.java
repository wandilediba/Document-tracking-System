/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.app.factories;

import com.wandile.documenttracking.domain.Employee;

/**
 *
 * @author 209043946
 */
public class EmployeeFactory {
    
    public static Employee getPerson(){
    
        Employee emp = new Employee();
        emp.setName("name");
        emp.setName("surname");
        return emp;
    }
    
}
