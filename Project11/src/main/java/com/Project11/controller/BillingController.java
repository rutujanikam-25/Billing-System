package com.Project11.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.Project11.dao.Billdao;
import com.Project11.dao.CustomerDao;
import com.Project11.dao.ProductDao;
import com.Project11.model.Bill;
import com.Project11.model.Customer;
import com.Project11.model.Product;

@Controller
@SessionAttributes({"CustomerList","OrderDetails","results","customerinfo","cust","prod","viewBillList"})
public class BillingController {

	@Autowired
	private CustomerDao dao;
	
	@Autowired
	private ProductDao dao1;
	
	@Autowired
	private Billdao billDao;
	
	
	@RequestMapping("Customer")
	public String viewProductDetails(Model model) {
		List<Customer> custList=dao.viewCustomer();
		List<Bill> bill=billDao.viewBillList();
		model.addAttribute("viewBillList", bill);
		model.addAttribute("CustomerList",custList);
		return "Customer";
	}
	
	
	
	
	 @Autowired
	    private Billdao billService;

	 @RequestMapping("/Product/getPriceAndProductName/{cid}")
	    public String getPriceAndProductNameByCustomerId(@PathVariable("cid") int cid, Model model) {
		 System.out.println("the cid is ---------"+cid);
		    Customer cust1=dao.getCustomerById(cid);
	        List<Bill> results = billService.getPriceAndProductNameByCustomerId(cid);
	        System.out.println("============"+results.toString());
	        model.addAttribute("results", results);
	        model.addAttribute("customerinfo",cust1);
	        System.out.println(results);
	        return "priceProductView"; // Replace with actual view name
	    }
	
//	 @GetMapping("/getPriceAndProductName")
//	 public String getPriceAndProductNameByCustomerId(@RequestParam("cid") int cid, Model model) {
//	     List<Object[]> results = billService.getPriceAndProductNameByCustomerId(cid);
//	     model.addAttribute("results", results);
//	     return "priceProductView"; // JSP view name
//	 }

	//order/cid=<%=c.getId()%>/pid=<%=p.getId()%>
	
	@RequestMapping("/Product/order/cid:{cid}/pid:{pid}")
	//@ResponseBody
	public String addBill(@PathVariable int cid,@PathVariable int pid,Model model) {
		Product obj=dao1.getProductById(pid);
		Customer custObj=dao.getCustomerById(cid);
		 List<Bill> results = billService.getPriceAndProductNameByCustomerId(cid);
	    Bill b=new Bill();
		/*
		 * private int CustomerId; private String name; private String ProductName;
		 * private double price;
		 */
	    b.setCustomerId(cid);
	    b.setName(custObj.getName());
	    b.setProductName(obj.getName());
	    b.setPrice(obj.getPrice());
	    Bill b1= billDao.addBill(b);
	    System.out.println(b);
		model.addAttribute("OrderDetails",b1);
		model.addAttribute("cust",custObj);
		model.addAttribute("prod", results);
		return "ShowOrderList";
	}
 	
	
	@RequestMapping("Project11/{cid}/viewProducts")
	public String viewBill(@PathVariable int cid) {
		Customer custObj=dao.getCustomerById(cid);
		 List<Bill> results = billService.getPriceAndProductNameByCustomerId(cid);
		return "showCard";
	}
	

	//showList
	@RequestMapping("/showList/{cid}")
	public String ShowList(@PathVariable int cid ,Model model) {
		Customer custObj=dao.getCustomerById(cid);
		 List<Bill> results = billService.getPriceAndProductNameByCustomerId(cid);
		 System.out.println("============"+results.toString());
	        model.addAttribute("results", results);
	        model.addAttribute("customerinfo",custObj);
		return "showCard";
	}
	
	@RequestMapping("/showList/Deleteorder/{id}")
	@ResponseBody
	public String DeleteProduct(@PathVariable int id,Model model) {
		billDao.deleteorder(id);
		return "<h1>Delete Products Successfully</h1> <a href='/Project11/Customer'>View OrderList</a> ";
	}
	
	@RequestMapping("/cancelOrder/{id}")
	@ResponseBody
	public String DeleteOrder(@PathVariable int id,Model model) {
		billDao.deleteorder(id);
		return "<h1>Delete Products Successfully</h1> <a href='/Project11/Customer'>View OrderList</a> ";
	}
	
}
