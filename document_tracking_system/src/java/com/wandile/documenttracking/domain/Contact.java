/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.domain;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author DibaW
 */
@Embeddable
public class Contact implements Serializable{
    
    private int tel;
    private int fax;
    private String email;

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public int getFax() {
        return fax;
    }

    public void setFax(int fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
}
