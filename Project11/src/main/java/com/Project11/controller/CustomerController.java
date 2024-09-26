package com.Project11.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.Project11.dao.Billdao;
import com.Project11.dao.CustomerDao;
import com.Project11.model.Bill;
import com.Project11.model.Customer;
import com.Project11.model.Product;


@Controller
@SessionAttributes({"CustomerKey","productRevenue"})
public class CustomerController {

	@Autowired
	private CustomerDao dao;
	
	@Autowired
	private Billdao billDao;
	
	
	@RequestMapping("/")
	public String LoginPage(Model model) {
		List<Bill> pList=billDao.revenue();
		model.addAttribute("productRevenue",pList);
		return "index";
	}
	
	@RequestMapping("/signUp")
	@ResponseBody
	public String signUp(@ModelAttribute Customer cust,Model model) {
		Customer obj=dao.addCustomer(cust);
		if(obj!=null) {
			model.addAttribute(obj);
			return"<h2><font color='green'>Add Customer Successfully</font></h2><br>"+
			" <a href='/Project11/'> Home Page</a><br>";
			
		}
           else
       {
	return "<h2><font color='red'>Not able to register</font></h2>";
       }
		}

	@RequestMapping("viewCustomer")
	public String viewCustomerDetails(Model model) {
		List<Customer> custList=dao.viewCustomer();
		model.addAttribute("CustomerKey",custList);
		return "ViewCustomer";
	}

@RequestMapping("/hi")
public String OpenLoginPage() {
	return "addCustomer";
}


	




}

