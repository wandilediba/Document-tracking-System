/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.client.web.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 *
 * @author DibaW
 */
@Controller
@SessionAttributes
public class ContactUs {
    
    
    @RequestMapping(value = "/Conatctform", method = RequestMethod.GET)
    public String getContactUs(Model model) {
         
        return "ContactUs/contactUs";
    }
    
}
