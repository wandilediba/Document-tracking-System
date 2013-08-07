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
   
    public static Name createName(String firstName, String lastName) {
        Name name = new Name();
        name.setFname("firstName");
        name.setLname("lastName");        
        return name;
    }
}
    
