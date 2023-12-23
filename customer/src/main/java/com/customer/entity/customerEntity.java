package com.customer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="customer")

public class customerEntity {	
	@Id
	int id;
	String name;
	int order_id;
	String phone_no;
	String email;
	public customerEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public customerEntity(int id, String name, int order_id, String phone_no, String email) {
		super();
		this.id = id;
		this.name = name;
		this.order_id = order_id;
		this.phone_no = phone_no;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
