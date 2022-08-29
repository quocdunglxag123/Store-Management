package com.quocdung.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerDto {
	@JsonProperty("customerID")
	private Integer id;

	@JsonProperty("customerName")
	private String name;

	@JsonProperty("customerAddress")
	private String address;

	@JsonProperty("customerPhone")
	private String phone;

	public CustomerDto(Integer id, String name, String address, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCustomerName() {
		return name;
	}

	public void setCustomerName(String name) {
		this.name = name;
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

}

