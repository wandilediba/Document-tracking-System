/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.app.factories;

import com.wandile.documenttracking.domain.SingnedBy;
import java.util.Date;
import java.util.Map;

/**
 *
 * @author DibaW
 */
public class SignedByFactory {
    public static SingnedBy createSignedBy(Map<String,String> values, Date date) {
        SingnedBy by = new SingnedBy();
        by.setDate(date);
        by.setJobTitle(values.get("JobTitle"));
               
        return by;
    }
    
}
