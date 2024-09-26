package com.Project11.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Project11.model.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}
