/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.test.repository;

import com.wandile.documenttracking.domain.Contact;
import com.wandile.documenttracking.domain.Employee;
import com.wandile.documenttracking.domain.Name;
import com.wandile.documenttracking.services.crud.EmployeeCrudModelService;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.Assert;

/**
 *
 * @author 209043946
 */
public class NewEmpTest {
     private Long id;
    private EmployeeCrudModelService employeeCrudModelService;
    private static ApplicationContext ctx;
    
    public NewEmpTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        ctx = new ClassPathXmlApplicationContext("classpath:com/wandile/documenttracking/app/conf/ApplicationContext-*.xml");
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    @org.testng.annotations.Test
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
    
    @Test
      public void readEmployee(){
          
        employeeCrudModelService = (EmployeeCrudModelService) ctx.getBean("employeeCrudModelService");
        Employee emp1 = employeeCrudModelService.findById(id);
        Assert.assertNotNull(emp1);
          
      }
}