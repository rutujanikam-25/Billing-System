package com.Project11.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Project11.model.Product;

@Service
public interface ProductServices {
	
	public Product addProduct(Product product);

	public List<Product> viewProduct();
	
	public void deleteProduct(int id);
	
  
	
//	String UpdateProduct(Product product);

}
