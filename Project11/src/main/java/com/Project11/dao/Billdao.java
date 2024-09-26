package com.Project11.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project11.model.Bill;
import com.Project11.model.Customer;
import com.Project11.model.Product;
import com.Project11.repository.BillRepository;
import com.Project11.service.BillService;

@Service
public class Billdao implements BillService {

	@Autowired
	private BillRepository repo;
	
	@Override
	public Bill addBill(Bill bill) {
        Bill bill1=repo.save(bill);
		return bill1;
		
	}
	

	    public List<Bill> getPriceAndProductNameByCustomerId(int customerId) {
	        return repo.findPriceAndProductNameByCustomerId(customerId);
	    }


		public void deleteorder(int id) {
			Optional<Bill> p=repo.findById(id);
			if (p.isPresent()) {
	            repo.deleteById(id);
	        } else {
	            throw new RuntimeException("Product not found with ID: " + id);
	        }
		}
		
		@Override
		public List<Bill> viewBillList() {
			List<Bill> BillList=repo.findAll();
			return BillList;
		}
		
		
		
		@Override
		public List<Bill> revenue() {
			List<Bill> ProductRevenue=repo.findAll();
			return ProductRevenue;
		}


		@Override
		public void cancelOrder(int id) {
			Optional<Bill> b=repo.findById(id);
			if(b.isPresent()) {
				repo.deleteById(id);
			}else {
	            throw new RuntimeException("customer not found with ID: " + id);
	        }
			
		}

}
