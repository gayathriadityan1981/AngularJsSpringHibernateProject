package com.project.shoponline1.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.stereotype.Controller;
import com.project.shoponline1.model.Employee;
import com.project.shoponline1.services.EmployeeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
@Controller
@RequestMapping("/employees")
public class EmployeeController{
 
 	@Autowired
 	EmployeeService empService;
 	
    @RequestMapping(value="/getAllEmployees",method=RequestMethod.GET, produces = "application/json")
    public ResponseEntity<?>  list() {
 //   public List<Employee> list(){
      List<Employee> emps = empService.list();
      System.out.println("------------emps-----------"+emps);
      return new ResponseEntity<>(emps, HttpStatus.FOUND);
   
   }
   }