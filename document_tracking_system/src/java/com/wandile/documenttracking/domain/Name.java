/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.domain;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author 209043946
 */
@Embeddable
public class Name implements Serializable{
    private String fname;
    private String lname;

    public String getFname() {
        return fname;
    }

    public void setFname(String name) {
        this.fname = name;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String surname) {
        this.lname = surname;
    }
    
    
    
}
