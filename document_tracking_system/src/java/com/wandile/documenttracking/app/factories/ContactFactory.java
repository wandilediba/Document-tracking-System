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
        contact.setFax(values.get("fax"));
        contact.setTel(values.get("tel"));
        contact.setEmail(values.get("email"));
        
        return contact;
    }
}
