/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.test.repository;

import com.wandile.documenttracking.app.factories.DocInfoFactory;
import com.wandile.documenttracking.app.factories.DocumentFactory;
import com.wandile.documenttracking.app.factories.SubmissionFactory;
import com.wandile.documenttracking.domain.Document;
import com.wandile.documenttracking.domain.Document_info;
import com.wandile.documenttracking.services.crud.DocInfoCrudService;
import com.wandile.documenttracking.services.crud.DocumentCrudService;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.joda.time.DateTime;
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
public class DocumentTest {
    
    private DocumentCrudService documentCrudService;
    private DocInfoCrudService docInfoCrudService;
     
    private Long id;
    private static ApplicationContext ctx;
    
    public DocumentTest() {
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
        documentCrudService = (DocumentCrudService) ctx.getBean("documentCrudService");
        docInfoCrudService = (DocInfoCrudService) ctx.getBean("docInfoCrudService");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
   @Test
    public void createDocument(){
        Map<String, String> values = new HashMap<String, String>();
        
        values.put("Subject","Toll Roads");
        values.put("Author", "Mr Masombuka");
        Date signedDate = new DateTime(2013, 02, 05, 0, 0).toDate();
        
        Document_info doc = DocInfoFactory.createDocFactory(values, signedDate);
       //doc = docInfoCrudService.findById(id);
        values.put("status", "Commitee");
        values.put("docNumber", "DOC001");
        Document document = DocumentFactory.createDocument(doc, values);
        
        //documentCrudService = (DocumentCrudService) ctx.getBean("documentCrudService");
        documentCrudService.persist(document);
        id = document.getId();
        
        Assert.assertNotNull(document);
        
    }
    
   @Test
    public void readDocument (){
      
        documentCrudService = (DocumentCrudService) ctx.getBean("documentCrudService");
        Document D = documentCrudService.findById(id);
        
        
        Assert.assertNotNull(D);   
        
    }
    
   @Test(dependsOnMethods ="readDocument" )
    public void updateDocument() {
        documentCrudService = (DocumentCrudService) ctx.getBean("documentCrudService");
        Document k = documentCrudService.findById(id);
        k.setDocNumber("DOC005");
        documentCrudService.merge(k);
        Document update = documentCrudService.findById(id);
        Assert.assertEquals(update.getDocNumber(), "DOC005");
        
        
    }
     
    @Test(dependsOnMethods ="readDocument" )
    public void deleteSubmission() {
        documentCrudService = (DocumentCrudService) ctx.getBean("documentCrudService");
        Document k = documentCrudService.findById(id);
        documentCrudService.remove(k);
        Document deleted = documentCrudService.findById(id);
        Assert.assertNull(deleted);
    }
}
