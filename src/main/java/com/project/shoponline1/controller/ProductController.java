package com.project.shoponline1.controller;



	
	import java.util.List;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.stereotype.Controller;
	import com.project.shoponline1.model.Product;
	import com.project.shoponline1.services.ProductService;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;

	@Controller
	@RequestMapping("/products")
	public class ProductController {
	 
	 	@Autowired
	 	ProductService productService;
	 	
	    @RequestMapping(value="/getAllProducts",method=RequestMethod.GET)
	 //   public ResponseEntity<List<Employee>> list() {
	    public List<Product> list(){
	      List<Product> pdts = productService.list();
	      System.out.println("------------pdts---------"+pdts);
	     // return ResponseEntity.ok().body(emps);
	      return pdts;
	   }
	   }