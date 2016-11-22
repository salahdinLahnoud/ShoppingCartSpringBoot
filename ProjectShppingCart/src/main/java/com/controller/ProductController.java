package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Product;
import java.util.*;
import com.repository.productRepository;


@RestController
public class ProductController {

	@Autowired
	public productRepository productRepo;
	
	@RequestMapping(value="/listProducts")
	public List<Product> product(){		
		return (List<Product>) productRepo.findAll();
				
	}
	  @RequestMapping("/")
	    @ResponseBody
	    public String test() {
	        Product pro = new Product();
	        pro.setDescription("brood");
	        
	        productRepo.save(pro);
	        return "hello";
	}
	
	
}
