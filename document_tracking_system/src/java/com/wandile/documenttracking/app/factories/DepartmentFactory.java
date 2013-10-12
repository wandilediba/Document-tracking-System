/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.app.factories;

import com.wandile.documenttracking.domain.Department;
import com.wandile.documenttracking.domain.DeptInfo;
import com.wandile.documenttracking.domain.Employee;
import com.wandile.documenttracking.domain.Submission;
import java.util.List;
import java.util.Map;

/**
 *
 * @author DibaW
 */
public class DepartmentFactory {
    
    public static Department createDepartment(Map<String, String> details, List<Employee> employees){
        
        Department dept = new Department();
        //dept.setDeptid(deptid);
        
        DeptInfo deptInfo = DeptInfoFactory.createDeptInfo(details);
        dept.setDeptInfo(deptInfo);
        
        
        /*details.get("name");
        details.get("abreviation");*/
        
        //DeptInfo dept1 = DeptInfoFactory.createDeptInfo(details);
        
        
       
        //dept.setDeptInfo(deptInfo);
        dept.setEmployee(employees);
        dept.setDeptnumber(details.get("deptNum"));
        
        return dept;
    
    
    
    }
    
}
