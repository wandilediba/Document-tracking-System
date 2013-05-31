/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.services;

import com.wandile.documenttracking.domain.Document;
import com.wandile.documenttracking.domain.Employee;

/**
 *
 * @author DibaW
 */
public interface createSubmitionService {
    
    public void submission(Employee emp, Document doc);
    
}
