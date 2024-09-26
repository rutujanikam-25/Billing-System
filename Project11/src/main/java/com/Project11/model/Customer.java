package com.Project11.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

@Entity
public class Customer {
	@jakarta.persistence.Id
	@GeneratedValue
	@Column(name="customer_id")
	private int Id;
	private String Name;
	private String Gender;
	@Column(name="contact_no" ,unique=true)
	private String Contact;
	@Column(name="Email_Id" ,unique=true)
	private String Email;
	
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
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getContact() {
		return Contact;
	}
	public void setContact(String contact) {
		Contact = contact;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int id, String name, String gender, String contact, String email) {
		super();
		Id = id;
		Name = name;
		Gender = gender;
		Contact = contact;
		Email = email;
	}
	@Override
	public String toString() {
		return "Customer [Id=" + Id + ", Name=" + Name + ", Gender=" + Gender + ", Contact=" + Contact + ", Email="
				+ Email + "]";
	}
	
	
	
	
}
