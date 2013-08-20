/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.app.facade;

import com.wandile.documenttracking.app.conf.GetContext;
import com.wandile.documenttracking.services.crud.services.DepartmentCrudService;
import com.wandile.documenttracking.services.crud.services.EmployeeCrudService;
import java.io.Serializable;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author DibaW
 */
public class facade implements Serializable{
    
    private final static ApplicationContext ctx = GetContext.getApplicationContext();
   // private EmployeeService departmentService;
    private EmployeeCrudService employeeCrudService;
    private DepartmentCrudService departmentCrudService;

  /*  public DepartmentService getDepartmentService() {
        departmentService = (DepartmentService) ctx.getBean("departmentService");
        return departmentService;
    }*/

    public EmployeeCrudService getUniversityCrudService() {
        employeeCrudService = (EmployeeCrudService) ctx.getBean("employeeCrudService");
        return employeeCrudService;
    }

    public DepartmentCrudService getPaymentCrudService() {
        departmentCrudService = (DepartmentCrudService) ctx.getBean("departmentCrudService");
        return departmentCrudService;
    }
    
}
