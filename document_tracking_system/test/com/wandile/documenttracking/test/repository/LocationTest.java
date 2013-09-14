/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.test.repository;

import com.wandile.documenttracking.app.factories.LocationFactory;
import com.wandile.documenttracking.domain.Location;
import com.wandile.documenttracking.services.crud.LocationCrudService;
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
public class LocationTest {
    
    private LocationCrudService locationCrudService;
     //private CourseService courseService;
    private Long id;
    private static ApplicationContext ctx;
    
    public LocationTest() {
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
    public void createLocation(){
        
         
        Location loc = LocationFactory.createLocation( "CapeTown", "120 Plein", "1350" );
        locationCrudService = (LocationCrudService) ctx.getBean("LocationCrudService");
        locationCrudService.persist(loc);
        id = loc.getId();
        
        Assert.assertNotNull(loc);
    }  
    
    @Test(dependsOnMethods ="createLocation" )
    public void readLocation(){
        locationCrudService = (LocationCrudService) ctx.getBean("locationCrudService");
        Location loc = locationCrudService.findById(id);
        Assert.assertNotNull(loc);   
        
    }
    
    @Test(dependsOnMethods ="readLocation" )
    public void updateLocation() {
        locationCrudService = (LocationCrudService) ctx.getBean("locationCrudService");
        Location k = locationCrudService.findById(id);
        k.setOffice("123");
        locationCrudService.merge(k);
        Location update = locationCrudService.findById(id);
        Assert.assertEquals(update.getOffice(), "1118");
        
        
    }
  
   @Test(dependsOnMethods ="readLocation" )
    public void deleteEmployee() {
        locationCrudService = (LocationCrudService) ctx.getBean("locationCrudService");
        Location k = locationCrudService.findById(id);
        locationCrudService.remove(k);
        Location deleted = locationCrudService.findById(id);
        Assert.assertNull(deleted);
    }
}
