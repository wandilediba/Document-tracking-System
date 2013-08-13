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
import java.util.Map;

/**
 *
 * @author DibaW
 */
public class DepartmentFactory {
    
    public static Department createDepartment(Map<String, String> details, int deptid){
        
        Department dept = new Department();
        dept.setDeptid(deptid);
        
        details.get("name");
        details.get("abreviation");
        
       DeptInfo dept1 = DeptInfoFactory.createDeptInfo(details);
        
        dept.setDeptInfo(dept1);
        //dept.setEmployee(emp);
        
        return dept;
    
    
    
    }
    
}
