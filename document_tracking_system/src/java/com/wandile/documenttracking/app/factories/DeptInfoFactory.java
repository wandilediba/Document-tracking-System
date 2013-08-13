/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.app.factories;

import com.wandile.documenttracking.domain.DeptInfo;
import java.util.Map;

/**
 *
 * @author DibaW
 */
public class DeptInfoFactory {
    
     public static DeptInfo createDeptInfo(Map<String, String> values) {
        DeptInfo dept = new DeptInfo();
        dept.setName(values.get("name")); 
        dept.setAbreviation(values.get("abreviation"));
        
        return dept;
    }
    
}
