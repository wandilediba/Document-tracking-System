/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.test.repository;

import com.wandile.documenttracking.app.factories.ContactFactory;
import com.wandile.documenttracking.app.factories.DocInfoFactory;
import com.wandile.documenttracking.app.factories.EmployeeFactory;
import com.wandile.documenttracking.app.factories.NameFactory;
import com.wandile.documenttracking.domain.Contact;
import com.wandile.documenttracking.domain.Document;
import com.wandile.documenttracking.domain.Employee;
import com.wandile.documenttracking.domain.Name;
import com.wandile.documenttracking.services.crud.services.EmployeeCrudService;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author DibaW
 */
public class EmpTest {
    
    private EmployeeCrudService employeeCrudService;
     //private CourseService courseService;
    private Long id;
    private static ApplicationContext ctx;
    
    public EmpTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new ClassPathXmlApplicationContext("classpath:com/wandile/documenttracking/app/conf/applicationContext-*.xml");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
      public void createEmployee() {
          
        Map<String, String> details = new HashMap<String, String>();
        //Name
        details.put("fname", "Andisiwe");
        details.put("lname", "Jele");
        
        //Contact
        details.put("tel", "0214657896");
        details.put("fax", "0214614589");
        details.put("email", "jele@gmail.com");
        
        Employee Aj = EmployeeFactory.createEmployee(details, 1245);
        employeeCrudService = (EmployeeCrudService) ctx.getBean("EmployeeCrudService");
        employeeCrudService.persist(Aj);
        id = Aj.getId();
        
        Assert.assertNotNull(Aj);
     }
    @Test
    public void readEmployee(){
        employeeCrudService = (EmployeeCrudService) ctx.getBean("employeeCrudService");
        Employee k = employeeCrudService.findById(id);
        Assert.assertNotNull(k);   
        
    }
    
     @Test(dependsOnMethods ="readEmployee" )
    public void updateLecturer() {
        employeeCrudService = (EmployeeCrudService) ctx.getBean("employeeCrudService");
        Employee k = employeeCrudService.findById(id);
        k.setEmp_id(999);
        employeeCrudService.merge(k);
        Employee update = employeeCrudService.findById(id);
        Assert.assertEquals(update.getEmp_id(), "999");
        
        
    }
     
     @Test(dependsOnMethods ="updateEmployee" )
    public void readLecturers() {
        employeeCrudService = (EmployeeCrudService) ctx.getBean("employeeCrudService");
        List<Employee> employee = employeeCrudService.findAll();
        Assert.assertTrue(employee.size() > 0);
        
    }
    
     @Test(dependsOnMethods ="readEmployee" )
    public void deleteLecturer() {
        employeeCrudService = (EmployeeCrudService) ctx.getBean("lecturerCrudService");
        Employee k = employeeCrudService.findById(id);
        employeeCrudService.remove(k);
        Employee deleted = employeeCrudService.findById(id);
        Assert.assertNull(deleted);
    }
    
    
    
}
