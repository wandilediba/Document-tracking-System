/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.client.web.model;

import java.io.Serializable;

/**
 *
 * @author 209043946
 */
public class EmployeeModel implements Serializable{
    
    private Long id;
    private NameModel nameModel;
    private ContactModel contactModel;
    private String empoyeeNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public NameModel getNameModel() {
        return nameModel;
    }

    public void setNameModel(NameModel nameModel) {
        this.nameModel = nameModel;
    }

    public ContactModel getContactModel() {
        return contactModel;
    }

    public void setContactModel(ContactModel contactModel) {
        this.contactModel = contactModel;
    }

    public String getEmpoyeeNumber() {
        return empoyeeNumber;
    }

    public void setEmpoyeeNumber(String empoyeeNumber) {
        this.empoyeeNumber = empoyeeNumber;
    }

    
    
    
}
