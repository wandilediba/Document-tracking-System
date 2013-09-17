/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.test.repository;

import com.wandile.documenttracking.app.factories.SignedByFactory;
import com.wandile.documenttracking.app.factories.SubmissionFactory;
import com.wandile.documenttracking.domain.SingnedBy;
import com.wandile.documenttracking.domain.Submission;
import com.wandile.documenttracking.services.crud.SubmissionCrudService;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.joda.time.DateTime;
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
public class SubmissionTest {
    
     private SubmissionCrudService submissionCrudService;
     
    private Long id;
    private static ApplicationContext ctx;
    
    public SubmissionTest() {
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
    public void createSubmission(){
        
        Map<String, String> values = new HashMap<String, String>();
        Date subDate = new DateTime(2013, 05, 26, 0, 0).toDate();
        values.put("JobTitle", "DDG");
        
        SingnedBy sin = SignedByFactory.createSignedBy(values, subDate);
        
        //Location loc = LocationFactory.createLocation("CapeTown", "120 Plein ", "1350");
        
        Submission sub = SubmissionFactory.createSubmission(sin, "Transport Law", "pending", 102);
        
        submissionCrudService = (SubmissionCrudService) ctx.getBean("submissionCrudService");
        submissionCrudService.persist(sub);
        id = sub.getId();
        
        Assert.assertNotNull(sub);
        
    }
    
    @Test
    public void readSubmission (){
        submissionCrudService = (SubmissionCrudService) ctx.getBean("submissionCrudService");
        Submission D = submissionCrudService.findById(id);
        Assert.assertNotNull(D);   
        
    }
    
     @Test(dependsOnMethods ="readSubmission" )
    public void updateSubmission() {
        submissionCrudService = (SubmissionCrudService) ctx.getBean("submissionCrudService");
        Submission k = submissionCrudService.findById(id);
        k.setSubmissionId(100);
        submissionCrudService.merge(k);
        Submission update = submissionCrudService.findById(id);
        Assert.assertEquals(update.getSubmissionId(), "200");
        
        
    }
     
    @Test(dependsOnMethods ="readSubmission" )
    public void deleteSubmission() {
        submissionCrudService = (SubmissionCrudService) ctx.getBean("submissionCrudService");
        Submission k = submissionCrudService.findById(id);
        submissionCrudService.remove(k);
        Submission deleted = submissionCrudService.findById(id);
        Assert.assertNull(deleted);
    }
}