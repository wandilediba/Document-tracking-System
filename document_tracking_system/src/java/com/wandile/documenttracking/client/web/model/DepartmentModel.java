/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.client.web.model;

import java.io.Serializable;

/**
 *
 * @author DibaW
 */
public class DepartmentModel implements Serializable {
    
   private String deptid;
   private DeptInfoModel deptInfoModel;

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid;
    }

    public DeptInfoModel getDeptInfoModel() {
        return deptInfoModel;
    }

    public void setDeptInfoModel(DeptInfoModel deptInfoModel) {
        this.deptInfoModel = deptInfoModel;
    }
    
    
    
}
