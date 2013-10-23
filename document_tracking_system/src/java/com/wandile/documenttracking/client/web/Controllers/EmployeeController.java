/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.client.web.Controllers;

import com.wandile.documenttracking.app.facade.facade;
import com.wandile.documenttracking.client.web.model.EmpModel;
import com.wandile.documenttracking.client.web.model.EmployeeModel;
import com.wandile.documenttracking.domain.Employee;
import com.wandile.documenttracking.services.EmployeeService;
import java.util.List;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
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
public class EmployeeController {
    // private Long id;
     private Long editid;
   // private final facade data = new facade();
    
    @Autowired
    private EmployeeService employeeService;
    
    @RequestMapping(value = "/Employeeform", method = RequestMethod.GET)
    public String getEmployeeForm(Model model) {
         EmployeeModel employeeModel = new EmployeeModel();
        model.addAttribute("employeeModel", employeeModel);
        return "Employee/employee";
    }
     @RequestMapping(value = "/Employeeeditform", method = RequestMethod.GET)
    public String getEmployeeFormEdit(Model model) {
         EmployeeModel employeeModel = new EmployeeModel();
        model.addAttribute("employeeModel", employeeModel);
        return "Employee/Editemployee";
    }
   

    @RequestMapping(value = "/createemployee", method = RequestMethod.POST)
    public String createEmployee(@ModelAttribute("employeeModel")  @Validated EmployeeModel employee,
            BindingResult result, Model model) {
           employeeService.createEmployees(employee);

        List<Employee> employees = employeeService.getEmployee();
        model.addAttribute("employees", employees);
        return "Employee/listEmployees";
    }

   /* @RequestMapping(value = "/employeeditform", method = RequestMethod.GET)
    public String getEmployeeEditForm(Model model) {
        EmployeeModel employeeModel = new EmployeeModel();
        model.addAttribute("emp_id", employeeModel);
        return "Employee/Editemployee";
    }
    */
  

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public String getEmployee(Model model) {
        System.out.println("service"+ employeeService);
       List<Employee> employees = employeeService.getEmployee();
       
        model.addAttribute("employees", employees);
        return "Employee/listEmployees";
    }

 

    @RequestMapping(value = "/deleteemployee", method = RequestMethod.GET,params = {"emp_id"})
    public String deleteEmployees(@RequestParam("emp_id") Long emp_id,Model model) {
        employeeService.deleteEmployee(emp_id);
        List<Employee> employees = employeeService.getEmployee();
        model.addAttribute("employees", employees);
        return "Employee/listEmployees";
    }
   
    /*******************************************************/
      @RequestMapping(value = "/updateemployee", method = RequestMethod.POST)
    public String updateEmployee(@ModelAttribute("employee") @Validated EmpModel empModel,
        BindingResult result, Model model) {
    
        employeeService.updateEmployee(empModel, editid);

        List<Employee> employees = employeeService.getEmployee();
        model.addAttribute("employees", employees);
        return "Employee/listEmployees";
    }
      
      
    @RequestMapping(value = "/editemployee", method = RequestMethod.GET, params = {"id"})
    public String editEmployees(@RequestParam("id") Long id,  Model model) 
    {
        EmpModel employee = employeeService.getEmployeeToEdit(id);
        editid = id;
        model.addAttribute("employee", employee);
       
        return "Employee/Editemployee";
    }
     

}
    

