/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.test.repository;

import com.wandile.documenttracking.domain.Contact;
import com.wandile.documenttracking.domain.Employee;
import com.wandile.documenttracking.domain.Name;
import com.wandile.documenttracking.services.crud.EmployeeCrudModelService;
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
 * @author 209043946
 */
public class EmployeeTest {
    private Long id;
    private EmployeeCrudModelService employeeCrudModelService;
    private static ApplicationContext ctx;
    
    public EmployeeTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
   

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
      Employee emp = new Employee();
      emp.setEmp_id(111111);
      
      Name name = new Name();
      name.setFname("Wandile");
      name.setLname("Diba");
      Contact contact = new Contact();
      contact.setEmail("wandile@gmail.com");
      contact.setFax(0214657);
      contact.setTel(02145);
      
      emp.setContact(contact);
      emp.setName(name);
      
      
//      employeeCrudModelService = (EmployeeCrudModelService)ctx.getBean("employeeCrudModelService");
//      employeeCrudModelService.persist(emp);
//      id = emp.getId();
      Assert.assertNotNull(emp);
      
      }
     /* @Test
      public void readEmployee(){
          
         employeeCrudModelservice = (EmployeeCrudModelService) ctx.getBean("employeeCrudModelservice");
        Employee emp1 = employeeCrudModelservice.findById(id);
        Assert.assertNotNull(emp1);
          
      }*/
   
      @Test
      public void updateEmployeTest(){
          employeeCrudModelService = (EmployeeCrudModelService) ctx.getBean("employeeCrudModelService");
          Employee emp1 = employeeCrudModelService.findById(id);
          emp1.setEmp_id(999);
          employeeCrudModelService.merge(emp1);
          
          Employee emp2 = employeeCrudModelService.findById(id);
          
          
          
      }
 }