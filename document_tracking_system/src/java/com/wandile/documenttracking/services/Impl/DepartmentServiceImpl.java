/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.services.Impl;

import com.wandile.documenttracking.client.web.model.DepartmentModel;
import com.wandile.documenttracking.domain.Department;
import com.wandile.documenttracking.services.DepartmentService;
import com.wandile.documenttracking.services.crud.DepartmentCrudService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author DibaW
 */
@Service("DepartmentService")
public class DepartmentServiceImpl implements DepartmentService {
    
    @Autowired
    private DepartmentCrudService departmentCrudService;

    @Override
    public List<Department> createDepartments(DepartmentModel model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Department> deleteDepartment(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DepartmentModel getDepartmentToEdit(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Department> updateDepartment(DepartmentModel model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Department> getDepartment() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
