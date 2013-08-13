/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.domain;

import javax.persistence.Embeddable;

/**
 *
 * @author DibaW
 */
@Embeddable
public class DeptInfo {
    
    private String name;
    private String abreviation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbreviation() {
        return abreviation;
    }

    public void setAbreviation(String abreviation) {
        this.abreviation = abreviation;
    }
    
    
    
}
