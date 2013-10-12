/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.services;

import com.wandile.documenttracking.client.web.model.EmployeeModel;
import com.wandile.documenttracking.domain.Employee;
import java.util.List;

/**
 *
 * @author DibaW
 */
public interface EmployeeService {
    
    public List<Employee> createEmployees(EmployeeModel model);
    public List<Employee> deleteEmployee(Long id);
    public EmployeeModel getEmployeeToEdit(Long id);
    public List<Employee> updateEmployee(EmployeeModel model);
    public List<Employee> getEmployee();
    
}
