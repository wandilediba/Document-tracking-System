/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.services;

import com.wandile.documenttracking.client.web.model.DepartmentModel;
import com.wandile.documenttracking.domain.Department;
import java.util.List;

/**
 *
 * @author DibaW
 */
public interface DepartmentService {
    
    
    public List<Department> createDepartments(DepartmentModel model);
    public List<Department> deleteDepartment(Long id);
    public DepartmentModel getDepartmentToEdit(Long id);
    public List<Department> updateDepartment(DepartmentModel model);
    public List<Department> getDepartment();
    
}
    

