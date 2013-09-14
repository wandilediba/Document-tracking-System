/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.app.factories;

import com.wandile.documenttracking.domain.Document;
import com.wandile.documenttracking.domain.Document_info;

/**
 *
 * @author DibaW
 */
public class DocumentFactory {
    
    public static Document createDocument(Document_info docinfo, int docId, String status) {
        Document document = new Document();
        document.setDocId(docId);
        document.setStatus(status);
        document.setDocInfo(docinfo);
        //document.setEmployee(emp);
        
        return document;
    }
    
}
