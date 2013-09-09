/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.services.Impl;

import com.wandile.documenttracking.client.web.model.EmployeeModel;
import com.wandile.documenttracking.domain.Employee;
import com.wandile.documenttracking.services.EmployeeService;
import com.wandile.documenttracking.services.crud.EmployeeCrudService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author DibaW
 */
@Service("EmployeeService")
public class EmployeeServiceImpl implements EmployeeService{
    
    
    private EmployeeCrudService employeeCrudService;

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public List<Employee> createEmployee(EmployeeModel model) {
        Employee employee = new Employee(); // DONT DO THIS USE FACTORY
        employee.setEmp_id(model.getEmp_id());
        employeeCrudService.persist(employee);
        return employeeCrudService.findAll();
    }

    @Override
    public List<Employee> deleteEmployee(Long id) {
        employeeCrudService.removeById(id);
        return employeeCrudService.findAll();
    }

    @Override
    public EmployeeModel getEmployeeToEdit(Long id) {
        EmployeeModel model = new EmployeeModel();
        Employee employee = employeeCrudService.findById(id);
        model.setEmp_id(employee.getEmp_id());
       
        return model;
    }
    @Override
    public List<Employee> updateEmployee(EmployeeModel model) {
        Employee course = new Employee(); // DONT DO THIS USE FACTORY
        course.setEmp_id(model.getEmp_id());
        
        employeeCrudService.merge(course);
        return employeeCrudService.findAll();
    }

    @Override
    public List<Employee> getEmployee() {
        return employeeCrudService.findAll();
        }
}
    

