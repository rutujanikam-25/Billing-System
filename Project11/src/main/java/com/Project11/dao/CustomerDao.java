package com.Project11.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project11.model.Customer;
import com.Project11.model.Product;
import com.Project11.repository.CustomerRepository;
import com.Project11.service.CustomerService;
@Service
public class CustomerDao implements CustomerService {
     @Autowired
	 private CustomerRepository repos;
	@Override
	public Customer addCustomer(Customer customer) {
		Customer cust=repos.save(customer);
		return cust;
	}
	
	@Override
	public List<Customer> viewCustomer() {
		List<Customer> Customerlist=repos.findAll();
		return Customerlist;
	}
	
	public Customer getCustomerById(int id) {
		Customer c=repos.getById(id);
		return c;
		
	}

	

}
