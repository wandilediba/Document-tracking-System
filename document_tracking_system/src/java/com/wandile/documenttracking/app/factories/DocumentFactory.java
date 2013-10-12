/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.app.factories;

import com.wandile.documenttracking.domain.Document;
import com.wandile.documenttracking.domain.Document_info;
import java.util.Date;
import java.util.Map;

/**
 *
 * @author DibaW
 */
public class DocumentFactory {
    
    public static Document createDocument(Document_info docinfo, Map<String, String> values) {
        //Document_info document_info = DocInfoFactory.createDocFactory(values, dueDate);
        
        Document document = new Document();
        //document.setDocId(docId);
        //document.setDocId(docId);
        document.setStatus(values.get("status"));
        document.setDocNumber(values.get("docNumber"));
        
        document.setDocInfo(docinfo);
        
        //document.setEmployee(emp);
        
        return document;
    }
    
}
