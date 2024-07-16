package com.project.simplewebapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.simplewebapp.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{

}
