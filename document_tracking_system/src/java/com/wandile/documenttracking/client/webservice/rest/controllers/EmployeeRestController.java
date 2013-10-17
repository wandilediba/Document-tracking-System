/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.client.webservice.rest.controllers;

import com.wandile.documenttracking.client.webservice.rest.resources.EmployeeResources;
import com.wandile.documenttracking.domain.Employee;
import com.wandile.documenttracking.services.EmployeeService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author 209043946
 */
 //@ResponseBody
 @RequestMapping(value = "employee", method = RequestMethod.GET)
public class EmployeeRestController {
    
   private EmployeeService employeeService;
   @ResponseBody
    @RequestMapping( value="employee", method = RequestMethod.GET)
    public List<EmployeeResources> getCourses(Model model){
        List<Employee> employees = employeeService.getEmployee();
        
         List<EmployeeResources> rs = new ArrayList<EmployeeResources>();
         System.out.println(" THE EMPLOYEE SIZE "+employees.size());
        for (Employee employee : employees) {
            EmployeeResources c = new EmployeeResources();
            c.setContact(employee.getContact());
            c.setEmployeenumber(employee.getEmployeeNumber());
            c.setName(employee.getName());
           
            rs.add(c);
        }
       return rs; 
    }
       
    
     }
    

