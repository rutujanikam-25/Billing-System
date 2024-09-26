package com.Project11.service;

import java.util.List;

import com.Project11.model.Bill;
import com.Project11.model.Customer;
import com.Project11.model.Product;

public interface BillService {
	 public Bill addBill(Bill bill);
	 
	 public void deleteorder(int id);
	 
	public void cancelOrder(int id);
	 
		public  List<Bill> revenue();
		
		public List<Bill> viewBillList();
}
