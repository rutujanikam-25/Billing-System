package com.Project11.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Project11.model.Product;

import jakarta.transaction.Transactional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	
	
	 @Transactional
	 @Modifying
	  @Query(value="update Product p set p.Name=:Name,p.price=:price,p.quantity=:quantity,p.brand=:brand, p.supplier=:supplier,p.stock=:stock ,p.category=:category where Id=:pid"
	  , nativeQuery=true) public int updateProduct(@Param("Name") String Name,
	  
	  @Param("price") double price,
	  
	  @Param("quantity") int quantity,
	  
	  @Param("brand") String brand,
	  
	  @Param("supplier")String supplier,
	  
	  @Param("stock")int stock,
	  
	  @Param("category") String category,
	  
	  @Param("pid") int pid ) ;
	 
	 
	/*
	 * @Transactional
	 * 
	 * @Modifying
	 * 
	 * @Query("update Course c set c.courseName=:p1, c.coursePrice=:p2 where c.courseId=:p3"
	 * ) public int updateCourse(@Param("p1")String cname,
	 * 
	 * @Param("p2")double cprice,
	 * 
	 * @Param("p3")long cid);
	 */

}
