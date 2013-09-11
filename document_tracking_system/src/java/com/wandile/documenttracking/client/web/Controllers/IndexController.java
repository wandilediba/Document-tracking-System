/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.client.web.Controllers;

import com.wandile.documenttracking.app.facade.facade;
import com.wandile.documenttracking.client.web.model.Welcome;
import com.wandile.documenttracking.domain.Employee;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author 209043946
 */
@Controller
public class IndexController {
    
    //private final facade data = new facade();
    @RequestMapping({"/"})
    public String home(Model model) {
         //DON'T CREATE OBJECTS LIKE THIS, USE FACTORIES
         Welcome message = new Welcome();
         message.setToday(new Date());
         message.setWelcome("Welcome to the Home Page");
         model.addAttribute("msg", message);
       
        
        
         return "index";
       
    }
}
