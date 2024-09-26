package com.Project11.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Project11.model.Product;
import com.Project11.repository.ProductRepository;
import com.Project11.service.ProductServices;


@Service
public class ProductDao implements ProductServices {
@Autowired
private ProductRepository repo;
	
	@Override
	public Product addProduct(Product product) {
		Product pro=repo.save(product);
		return pro;
	}

	
	@Override
	public List<Product> viewProduct() {
		List<Product> Productlist=repo.findAll();
		return Productlist;
	}


	public Product getProductById(int id) {
		Product p=repo.getById(id);
		return p;
		
	}


	@Override
	public void deleteProduct(int id) {
		Optional<Product> p=repo.findById(id);
		if (p.isPresent()) {
            repo.deleteById(id);
        } else {
            throw new RuntimeException("Product not found with ID: " + id);
        }
	}


	/*
	 * @Override public String UpdateProduct(Product product) {
	 * if(repo.existsById(product.getId())) { repo.save(product);
	 * 
	 * } return "Invalid Id"; }
	 */


	
	  public int update(Product c) { int
	  updateStatus=repo.updateProduct(c.getName(),c.getPrice(),c.getQuantity(),c.
	  getBrand(),c.getSupplier(),c.getStock(),c.getCategory(),c.getId()); return
	  updateStatus; }


	
	 
	
	
	
	
	/*
	 * public int update(Product p) {
	 * 
	 * int
	 * updateStatus=repo.updateProduct(p.getName(),p.getPrice(),p.getQuantity(),p.
	 * getBrand(),p.getSupplier(),p.getStock(),p.getCategory(),p.getId()); return
	 * updateStatus;
	 * 
	 * 
	 * }
	 */

    

}
