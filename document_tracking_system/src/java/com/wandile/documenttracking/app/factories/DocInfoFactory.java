/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.app.factories;

import com.wandile.documenttracking.domain.Document_info;
import java.util.Date;
import java.util.Map;

/**
 *
 * @author DibaW
 */
public class DocInfoFactory {
    
    public static Document_info createDocFactory(Map<String, String> values,Date duedate) {
        Document_info docInfo = new Document_info();
        
        docInfo.setAuthor(values.get("Author"));
        docInfo.setSubject(values.get("Subject")); 
         
        docInfo.setDuedate(duedate);
        return docInfo;
    }
    
}
