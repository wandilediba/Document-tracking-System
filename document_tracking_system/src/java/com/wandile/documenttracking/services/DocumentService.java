/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.services;

import com.wandile.documenttracking.domain.Document;
import java.util.List;

/**
 *
 * @author DibaW
 */
public interface DocumentService {
   // public List<Document> createEmployee(DocumentModel model);
    public List<Document> deleteEmployee(Long id);
   // public DocumentModel getEmployeeToEdit(Long id);
   // public List<Document> updateEmployee(DocumentModel model);
    public List<Document> getEmployee();
    
}
