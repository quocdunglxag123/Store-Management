package com.quocdung.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id")
	private Integer id;

	@Column(nullable = false)
	private String customerName;

	@Column(nullable = false)
	private String address;

	@Column(name = "phone_number", nullable = false)
	private String phone;

	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	List<Order> orders;


	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(Integer id, String customerName, String address, String phone, List<Order> orders) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.address = address;
		this.phone = phone;
		this.orders = orders;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}


	public Integer getId() {
		return id;
	}

}
