/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.app.factories;

import com.wandile.documenttracking.domain.Name;
import java.util.Map;

/**
 *
 * @author DibaW
 */
public class NameFactory {
   
    public static Name createName(Map<String,String> values) {
        Name name = new Name();
        name.setFname(values.get("firstName"));
        name.setLname(values.get("lastName"));        
        return name;
    }
}
    
