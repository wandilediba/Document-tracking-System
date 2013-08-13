/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.test.repository;

import com.wandile.documenttracking.app.factories.DepartmentFactory;
import com.wandile.documenttracking.app.factories.DeptInfoFactory;
import com.wandile.documenttracking.app.factories.EmployeeFactory;
import com.wandile.documenttracking.domain.Department;
import com.wandile.documenttracking.domain.DeptInfo;
import com.wandile.documenttracking.domain.Employee;
import com.wandile.documenttracking.services.crud.services.DepartmentCrudService;
import com.wandile.documenttracking.services.crud.services.EmployeeCrudService;
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
public class DepartmentTest {
    
    private DepartmentCrudService departmentCrudService;
     
    private Long id;
    private static ApplicationContext ctx;
    
    public DepartmentTest() {
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
    public void createDepartment(){
        
        Map<String, String> values = new HashMap<String, String>();
        values.put("name", "Tranport Infromation System");
        values.put("abreviation","TIS");
      
        Department department = DepartmentFactory.createDepartment(values, 100);
        
        departmentCrudService = (DepartmentCrudService) ctx.getBean("DepartmentCrudService");
        departmentCrudService.persist(department);
        id = department.getId();
        
        Assert.assertNotNull(department);
                
    }
    
    @Test
    public void readDepartment(){
        departmentCrudService = (DepartmentCrudService) ctx.getBean("departmentCrudService");
        Department D = departmentCrudService.findById(id);
        Assert.assertNotNull(D);   
        
    }
    
     @Test(dependsOnMethods ="readDepartment" )
    public void updateDepartment() {
        departmentCrudService = (DepartmentCrudService) ctx.getBean("departmentCrudService");
        Department k = departmentCrudService.findById(id);
        k.setDeptid(100);
        departmentCrudService.merge(k);
        Department update = departmentCrudService.findById(id);
        Assert.assertEquals(update.getDeptid(), "200");
        
        
    }
     
        
    
    
     @Test(dependsOnMethods ="readDepartment" )
    public void deleteDepartment() {
        departmentCrudService = (DepartmentCrudService) ctx.getBean("departmentCrudService");
        Department k = departmentCrudService.findById(id);
        departmentCrudService.remove(k);
        Department deleted = departmentCrudService.findById(id);
        Assert.assertNull(deleted);
    }
}
