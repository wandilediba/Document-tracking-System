/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.client.web.Controllers;

import com.wandile.documenttracking.client.web.Controllers.model.EmployeeModel;
import com.wandile.documenttracking.domain.Employee;
import com.wandile.documenttracking.services.EmployeeService;
import java.io.Serializable;
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
 * @author 209043946
 */

@Controller
@SessionAttributes
public class EmployeeController implements Serializable{
    
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/employeeform", method = RequestMethod.GET)
    public String getCourseForm(Model model) {
        EmployeeModel employeeModel = new EmployeeModel();
        model.addAttribute("employeeModel", employeeModel);
        return "course/form";
    }

    @RequestMapping(value = "/createemployee", method = RequestMethod.POST)
    public String createEmployee(@ModelAttribute("employeeModel")  EmployeeModel employee,
            BindingResult result, Model model) {
        employeeService.createEmployee(employee);

        List<Employee> employees = employeeService.getEmployee();
        model.addAttribute("employee", employees);
        return "employee/employees";
    }

    @RequestMapping(value = "/employeeeditform", method = RequestMethod.GET)
    public String getEmployeeEditForm(Model model) {
        EmployeeModel EmployeeModel = new EmployeeModel();
        model.addAttribute("emp_id", EmployeeModel);
        return "employee/form";
    }

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public String getemployee(Model model) {
        List<Employee> employeess = employeeService.getEmployee();
        model.addAttribute("employee", employeess);
        return "employee/employees";
    }

    @RequestMapping(value = "/editemployee", method = RequestMethod.GET)
    public String editEmployees(Model model) {
        List<Employee> employees = employeeService.getEmployee();
        model.addAttribute("employees", employees);
        return "employee/employees";
    }

    @RequestMapping(value = "/deletecourse", method = RequestMethod.GET,params = {"emp_id"})
    public String deleteEmployees(@RequestParam("emp_id") Long emp_id,Model model) {
        employeeService.deleteEmployee(emp_id);
        List<Employee> employees = employeeService.getEmployee();
        model.addAttribute("employees", employees);
        return "employee/employees";
    }

    @RequestMapping(value = "private/editEmployeeForm.html", method = RequestMethod.GET, params = {"emp_id"})
    public String editCourseForm(@RequestParam("emp_id") String coursecodeId, Model model) {

        return "editIndividualEmployeeForm";
    }
    
}
