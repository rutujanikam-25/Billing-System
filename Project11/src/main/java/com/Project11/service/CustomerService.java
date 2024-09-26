package com.Project11.service;

import java.util.List;

import com.Project11.model.Customer;
import com.Project11.model.Product;

public interface CustomerService {
     public Customer addCustomer(Customer customer);

	 public List<Customer> viewCustomer();
}
