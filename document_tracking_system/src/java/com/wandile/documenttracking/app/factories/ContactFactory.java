/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.app.factories;

import com.wandile.documenttracking.domain.Contact;
import java.util.Map;

/**
 *
 * @author DibaW
 */
public class ContactFactory {
    public static Contact createContact( Map<String, String> values) {
        Contact contact = new Contact();
        contact.setFax(values.get("Fax"));
        contact.setTel(values.get("Tel"));
        contact.setEmail(values.get("Email"));
        
        return contact;
    }
}
