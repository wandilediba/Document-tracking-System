/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.services;

import com.wandile.documenttracking.client.web.model.EmpModel;
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
    public EmpModel getEmployeeToEdit(Long id);
    public List<Employee> updateEmployee(EmpModel model, Long id);
    public List<Employee> getEmployee();

    public List<Employee> findAll();
    
}
