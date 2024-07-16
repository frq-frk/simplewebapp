package com.project.simplewebapp.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Component
@Entity
public class Product {
	
	@Id
	private int id;
	private String prodName;
	private int prodPrice;
	
	public Product() {}
	
	public Product(int id, String prodName, int prodPrice) {
		super();
		this.id = id;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(int prodPrice) {
		this.prodPrice = prodPrice;
	}
}
