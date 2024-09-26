package com.Project11.model;

import java.time.LocalDate;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Bill {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Bill_id")
    private int Id;
	@Column(name="customer_id")
    private int CustomerId;
    private String name;
    private String ProductName;
    private double price;
    private int quantity;
    
    
    

   
	public Bill(int id, int customerId, String name, String productName, double price, int quantity,
			LocalDate orderDate, String userName, String paymentStatus) {
		super();
		Id = id;
		CustomerId = customerId;
		this.name = name;
		ProductName = productName;
		this.price = price;
		this.quantity = quantity;
		OrderDate = orderDate;
		this.userName = userName;
		this.paymentStatus = paymentStatus;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Bill [id=" + Id + ", CustomerId=" + CustomerId + ", name=" + name + ", ProductName=" + ProductName
				+ ", price=" + price + ", OrderDate=" + OrderDate + ", userName=" + userName + ", paymentStatus="
				+ paymentStatus + "]";
	}
	public LocalDate getOrderDate() {
		return OrderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		OrderDate = orderDate;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	
	
	public Bill(int id, int customerId, String name, String productName, double price, LocalDate orderDate,
			String userName, String paymentStatus) {
		super();
		this.Id = id;
		CustomerId = customerId;
		this.name = name;
		ProductName = productName;
		this.price = price;
		OrderDate = orderDate;
		this.userName = userName;
		this.paymentStatus = paymentStatus;
	}
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private LocalDate OrderDate;
	private String userName;
	private String paymentStatus;
    
    
	public int getId() {
		return Id;
	}
	public void setId(int i) {
		this.Id = i;
	}
	public int getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Bill(int id, int customerId, String name, String productName, double price) {
		super();
		this.Id = id;
		CustomerId = customerId;
		this.name = name;
		ProductName = productName;
		this.price = price;
	}
	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
    
    
    
    
}
