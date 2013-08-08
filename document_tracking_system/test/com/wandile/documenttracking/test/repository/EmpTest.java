/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.test.repository;

import com.wandile.documenttracking.app.factories.ContactFactory;
import com.wandile.documenttracking.app.factories.EmployeeFactory;
import com.wandile.documenttracking.app.factories.NameFactory;
import com.wandile.documenttracking.domain.Contact;
import com.wandile.documenttracking.domain.Employee;
import com.wandile.documenttracking.domain.Name;
import com.wandile.documenttracking.services.crud.services.EmployeeCrudService;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

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
        ctx = new ClassPathXmlApplicationContext("classpath:com/wandile/documenttracking/app/conf/ApplicationContext-*.xml");
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
          
        Name name = NameFactory.createName("Wandile", "Diba");
        Contact cont = ContactFactory.createContact(021, 012, "dibaw@dot.gov.za");
        //Map<String,String>Values = new HashMap<String, String>();
        //Values.put("subject", "License Cards");
       // Values.put("Author", "Mr Diba");
        //Date dat = new Date();
       // SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yy");
         //Document_Info = DocInfoFactory.createDocFactory(Values, dat);
        
        Employee emp = EmployeeFactory.createEmployee( name, cont, 1232);
        
        employeeCrudService = (EmployeeCrudService)ctx.getBean("employeeCrudService");
        employeeCrudService.persist(emp);
        id = emp.getId();
        Assert.assertNotNull(emp);
     }
}
