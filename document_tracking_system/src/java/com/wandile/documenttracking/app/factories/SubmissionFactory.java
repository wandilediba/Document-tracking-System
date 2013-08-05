/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.app.factories;

import com.wandile.documenttracking.domain.SingnedBy;
import com.wandile.documenttracking.domain.Submission;
import java.util.Date;
import java.util.Map;

/**
 *
 * @author DibaW
 */
public class SubmissionFactory {
    
    public static Submission createSubmission(SingnedBy by,String description, String status, int id){
         SingnedBy sub = new SingnedBy();
         sub.setJobTitle(by.getJobTitle());
         sub.setDate(by.getDate());
         Submission mission = new Submission();
         mission.setDescription(description);
         mission.setStatus(status);
         mission.setSubmissionId(id);
        
        
         return mission;
     }
    
}
