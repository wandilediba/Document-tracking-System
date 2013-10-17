/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.client.webservice.rest.resources;

import com.wandile.documenttracking.domain.Contact;
import com.wandile.documenttracking.domain.Department;
import com.wandile.documenttracking.domain.Name;
import java.io.Serializable;
import javax.persistence.Embedded;
import javax.persistence.OneToOne;

/**
 *
 * @author 209043946
 */
public class EmployeeResources implements Serializable{
    
   @Embedded
    private Name name;
    
    @Embedded
    private Contact contact;
    
    
    
    private String employeenumber;

    public Name getName() {
        return name;
    }

    public String getEmployeenumber() {
        return employeenumber;
    }

    public void setEmployeenumber(String employeenumber) {
        this.employeenumber = employeenumber;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
    
    
}
