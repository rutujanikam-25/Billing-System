package com.Project11.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

@Entity
public class Product {
	@jakarta.persistence.Id
	@GeneratedValue
	@Column(name="product_id")
    private int Id;
	private String Name;
	private double Price; 
	private int Quantity;
	private String Brand;
	private String Supplier;
	private int Stock; 
	private String Category;
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getSupplier() {
		return Supplier;
	}
	public void setSupplier(String supplier) {
		Supplier = supplier;
	}
	public int getStock() {
		return Stock;
	}
	public void setStock(int stock) {
		Stock = stock;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	@Override
	public String toString() {
		return "Product [Id=" + Id + ", Name=" + Name + ", Price=" + Price + ", Quantity=" + Quantity + ", Brand="
				+ Brand + ", Supplier=" + Supplier + ", Stock=" + Stock + ", Category=" + Category + "]";
	}
	public Product(int id, String name, double price, int quantity, String brand, String supplier, int stock,
			String category) {
		super();
		Id = id;
		Name = name;
		Price = price;
		Quantity = quantity;
		Brand = brand;
		Supplier = supplier;
		Stock = stock;
		Category = category;
	}
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	
}

