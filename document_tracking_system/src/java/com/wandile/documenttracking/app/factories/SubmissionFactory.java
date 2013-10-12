/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.app.factories;

import com.wandile.documenttracking.domain.Document;
import com.wandile.documenttracking.domain.SingnedBy;
import com.wandile.documenttracking.domain.Submission;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *
 * @author DibaW
 */
public class SubmissionFactory {
    
    public static Submission createSubmission(List<SingnedBy> by,Map<String, String> details, List<Document> documents){
        /*SingnedBy sub = new SingnedBy();
         sub.setJobTitle(by.getJobTitle());
         sub.setDate(by.getDate());
         details.
        /* Document docu = new Document();
         docu.setDocId(doc.getDocId());
         docu.setStatus(doc.getStatus());
        docu.set
         
         Submission mission = new Submission();
         mission.setDescription(description);
         mission.setStatus(status);
       
         //mission.setSingnedby(sub);
        
        */
        Submission submission = new Submission();
        //SingnedBy singnedBy = SignedByFactory.createSignedBy(details, signedByDate);
        submission.setDescription(details.get("description"));
        submission.setStatus(details.get("status"));
        submission.setDocument(documents);
        submission.setSingnedby(by);
         return submission;
     }
    
}
