package com.Project11.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Project11.model.Bill;

import jakarta.transaction.Transactional;

public interface BillRepository extends JpaRepository<Bill,Integer> {

     
	 @Query(value= "SELECT * FROM bill  WHERE customer_id =:customer_id",nativeQuery = true)
	    List<Bill> findPriceAndProductNameByCustomerId( @Param("customer_id") int id);


	
}
