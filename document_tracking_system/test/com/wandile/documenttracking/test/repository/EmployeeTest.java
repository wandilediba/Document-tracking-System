/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.test.repository;

import com.wandile.documenttracking.domain.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import static org.testng.Assert.*;
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
    private EmployeeCrudService employeeCrudModelservice;
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
      emp.setName("Wandile");
      employeeCrudModelservice = ctx.getBean("employeeCrudModelservice");
      
      }
      @Test
      public void readEmployee(){
      }
      
      @Test
      public void updateEmployeTest(){
          
          
          
      }
 }