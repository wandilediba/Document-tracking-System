/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.app.factories;

import com.wandile.documenttracking.domain.DeptInfo;
import java.util.Map;

/**
 *
 * @author DibaW
 */
public class DeptInfoFactory {
    
    public static DeptInfo createAlbumCategory(Map<String, String> values) {
        DeptInfo DInformation = new DeptInfo();
        DInformation.setAbreviation(values.get("abreviation"));
        DInformation.setName(values.get("name"));
        return DInformation;
    }
    
}
