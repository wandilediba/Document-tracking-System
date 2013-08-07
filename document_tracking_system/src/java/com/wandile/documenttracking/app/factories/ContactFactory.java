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
    public static Contact createContact( int fax, int tel, String email) {
        Contact contact = new Contact();
        contact.setFax(fax);
        contact.setTel(tel);
        contact.setEmail(email);
        return contact;
    }
}
