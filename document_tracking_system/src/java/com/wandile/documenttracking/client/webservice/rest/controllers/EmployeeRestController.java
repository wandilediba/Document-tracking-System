/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.client.webservice.rest.controllers;

import com.wandile.documenttracking.client.webservice.rest.resources.EmployeeResources;
import com.wandile.documenttracking.domain.Employee;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author 209043946
 */
 //@ResponseBody
 @RequestMapping(value = "employee", method = RequestMethod.GET)
public class EmployeeRestController {
    
   // public  List<EmployeeResources> getEmployee(){
        
    /*List<Employee> employee =  employeeService.findAll();
    
    List<EmployeeResources> rs = (List<EmployeeResources>) new ArrayList<EmployeeResources>();
    
    for(Employee employee: employees){
       List<EmployeeResources> emp = new ArrayList< EmployeeResources>();
       emp.setEmployeeName(employee.getEmployeeName());
       emp.setContact(employee.getContact());
       emp.setDepartment(employee.)
       rs.add(emp);   
       }
       
       return rs;
       
       /* @ResponseBody
    @RequestMapping(value = "tournaments", method = RequestMethod.GET)   
    public List<TournamentResource> getTournaments(){
        return null;
        /*List<Tournament> tournaments = tournamentService.findAll();
        List<TournamentResource> tr = new ArrayList<TournamentResource>();
        for(Tournament tournament:tournaments){
            TournamentResource t = new TournamentResource();
            t.setName(tournament.getName());
            t.setTournamentNumber(tournament.getTournamentNumber());
            t.setVenue(tournament.getVenue());
            t.setSponsor(tournament.getSponsor());
            t.setId(tournament.getId());
            t.setResults(tournament.getResults());
            t.setReferee(tournament.getReferee());
            tr.add(t);
        }*/
       
    
     }
    

