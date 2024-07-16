package com.project.simplewebapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.simplewebapp.model.Product;
import com.project.simplewebapp.service.ProductService;



@RestController
public class ProductController {
	
	@Autowired
	ProductService prodService;
	
//	@RequestMapping("/products")
	@GetMapping("/products")
	public List<Product> getProducts() {
		return prodService.getProducts();
	}
	
	@GetMapping("/products/{prodId}")
	public Product getProduct(@PathVariable int prodId) {
		return prodService.getProduct(prodId);
	}
	
	@PostMapping("/products")
	public void addProduct(@RequestBody Product prod) {
		prodService.addProduct(prod);
	}
	
	@PutMapping("/products")
	public void updateProduct(@RequestBody Product prod) {
		prodService.updateProduct(prod);
	}
	
	@DeleteMapping("/products/{prodId}")
	public void deleteProduct(@PathVariable int prodId) {
		prodService.deleteProduct(prodId);
	}
}
