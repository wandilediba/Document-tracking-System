/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.client.web.Controllers;

import com.wandile.documenttracking.client.web.model.DepartmentModel;
import com.wandile.documenttracking.client.web.model.EmployeeModel;
import com.wandile.documenttracking.domain.Employee;
import com.wandile.documenttracking.services.EmployeeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 *
 * @author DibaW
 */
@Controller
@SessionAttributes
public class DepartmentController {
    
    @Autowired
    private EmployeeService employeeService;
    
    @RequestMapping(value = "/Departmentform", method = RequestMethod.GET)
    public String getDepartmentForm(Model model) {
         DepartmentModel departmentModel = new DepartmentModel();
        model.addAttribute("departmentModel", departmentModel);
        return "Employee/department";
    }

   

    
    
    
}
