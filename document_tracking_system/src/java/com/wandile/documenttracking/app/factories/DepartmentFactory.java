/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.app.factories;

import com.wandile.documenttracking.domain.Department;
import com.wandile.documenttracking.domain.DeptInfo;
import com.wandile.documenttracking.domain.Employee;
import java.util.Date;
import java.util.List;

/**
 *
 * @author DibaW
 */
public class DepartmentFactory {
    
    public static Department createDepartment(List<Employee> emp, DeptInfo deptinfo, int deptid){
        
        Department dept = new Department();
        dept.setDeptid(deptid);
        dept.setEmployee(emp);
        dept.setDeptinfo(deptinfo);
        return dept;
    
    
    
    }
    
}
