/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.app.factories;

import com.wandile.documenttracking.domain.Document;
import java.util.Map;

/**
 *
 * @author DibaW
 */
public class DocumentFactory {
    
    public static Document createDocumentFactory(Map<String,String> values, int docId) {
        Document document = new Document();
        document.setDocId(docId);
        
        return document;
    }
    
}
