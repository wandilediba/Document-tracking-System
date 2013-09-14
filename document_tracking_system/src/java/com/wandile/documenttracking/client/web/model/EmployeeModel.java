/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.client.web.model;

import com.wandile.documenttracking.domain.Contact;
import com.wandile.documenttracking.domain.Name;
import java.io.Serializable;

/**
 *
 * @author 209043946
 */
public class EmployeeModel implements Serializable{
    
    private Long id;
    private int emp_id;
    private Name name;
    private Contact contact;

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }
    

    
   
    
}
