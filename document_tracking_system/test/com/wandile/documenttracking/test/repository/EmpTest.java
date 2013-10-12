/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.test.repository;

import com.wandile.documenttracking.app.factories.EmployeeFactory;
import com.wandile.documenttracking.domain.Employee;
import com.wandile.documenttracking.services.crud.EmployeeCrudService;
import java.util.HashMap;
import java.util.Map;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.Assert;
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
        employeeCrudService = (EmployeeCrudService) ctx.getBean("employeeCrudService");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
      @Test
      public void createEmployee() {
          
        Map<String, String> details = new HashMap<String, String>();
        //Name
        details.put("FName", "Zama");
        details.put("LName", "Shange");
        //Name name = NameFactory.createName(details);
        
       // Contact
        details.put("tel", "01236589");
        details.put("fax", "01256987");
        details.put("email", "zamzam@gmail.com");
        //Contact cont = ContactFactory.createContact(details);
        
        details.put("empNumber", "EMP005");
        
        
        
        Employee Aj = EmployeeFactory.createEmployee(details);
        
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
    public void updateEmployee() {
        employeeCrudService = (EmployeeCrudService) ctx.getBean("employeeCrudService");
         System.out.println(id);
        Employee k = employeeCrudService.findById(id);
        k.setId(id);
        employeeCrudService.merge(k);
        Employee update = employeeCrudService.findById(id);
        Assert.assertEquals(update.getEmployeeNumber(),1121);        
    }
    
    @Test(dependsOnMethods ="readEmployee")
    public void deleteEmployee() {
        employeeCrudService = (EmployeeCrudService) ctx.getBean("employeeCrudService");
        Employee k = employeeCrudService.findById(id);
        employeeCrudService.remove(k);
        Employee deleted = employeeCrudService.findById(id);
        Assert.assertNull(deleted);
    }
    
    
    
}
