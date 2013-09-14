/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.app.factories;

import com.wandile.documenttracking.domain.Location;

/**
 *
 * @author DibaW
 */
public class LocationFactory {
    
    public static Location createLocation( String city, String building, String office ){
        
        Location loc = new Location();
        loc.setBuilding(building);
        loc.setCity(city);
        loc.setOffice(office);
        //loc.setDocument(doc);
        
        
        return loc;
        
        
    }
    
}
