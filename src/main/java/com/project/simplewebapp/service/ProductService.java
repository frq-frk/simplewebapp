package com.project.simplewebapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.simplewebapp.model.Product;
import com.project.simplewebapp.repo.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	ProductRepo repo;
	
//	List<Product> products = new ArrayList<>(Arrays.asList(
//			new Product(101, "Iphone", 50000),
//			new Product(102, "Ipad", 70000),
//			new Product(103, "Macbook", 120000)
//			));
	
	public List<Product> getProducts(){
		return repo.findAll();
	}

	public Product getProduct(int prodId) {
		return repo.findById(prodId).orElse(new Product(000, "No Item", 000));
	}

	public void addProduct(Product prod) {
		repo.save(prod);
	}

	public void updateProduct(Product prod) {
		repo.save(prod);
	}

	public void deleteProduct(int prodId) {
		repo.deleteById(prodId);
	}
}
