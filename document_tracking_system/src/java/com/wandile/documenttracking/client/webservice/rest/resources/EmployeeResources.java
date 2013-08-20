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
    
    @OneToOne
    private Department  department;
    
    private int emp_id;

    public Name getName() {
        return name;
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }
    
    
    
}
