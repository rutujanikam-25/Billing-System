package com.Project11.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.Project11.dao.Billdao;
import com.Project11.dao.CustomerDao;
import com.Project11.dao.ProductDao;
import com.Project11.model.Bill;
import com.Project11.model.Customer;
import com.Project11.model.Product;

@Controller
@SessionAttributes({"ProductList","CustomerDetails"})
public class OrderList {
	
	
	 @Autowired
	 private Billdao billDao;

	@Autowired
	private ProductDao dao1;
	
	@Autowired
	private CustomerDao dao;
	
	
	@RequestMapping("/Product/{id}")
	public String Order(@PathVariable int id, Model model) {
		List<Product> prodList=dao1.viewProduct();
		Customer c=dao.getCustomerById(id);
		model.addAttribute("CustomerDetails",c);
		model.addAttribute("ProductList",prodList);
		return "ProductListForOrder";
		
	}
	
	
	
	
}
