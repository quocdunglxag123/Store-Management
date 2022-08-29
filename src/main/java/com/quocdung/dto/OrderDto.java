package com.quocdung.dto;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderDto {
	@JsonProperty("id")
	private Integer id;
	
	@JsonProperty("customer")
	CustomerDto customer;
	
	@JsonProperty("details")
	List<OrderDetailDto> details;
	
	@JsonProperty("store")
	StoreDto store;
	
	@JsonProperty("total")
	private float total;
	
	@JsonProperty("date")
	private Date createdDate;

	public OrderDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderDto(Integer id, CustomerDto customer, List<OrderDetailDto> details, StoreDto store, float total,
			Date createdDate) {
		super();
		this.id = id;
		this.customer = customer;
		this.details = details;
		this.store = store;
		this.total = total;
		this.createdDate = createdDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public CustomerDto getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerDto customer) {
		this.customer = customer;
	}

	public List<OrderDetailDto> getDetails() {
		return details;
	}

	public void setDetails(List<OrderDetailDto> details) {
		this.details = details;
	}

	public StoreDto getStore() {
		return store;
	}

	public void setStore(StoreDto store) {
		this.store = store;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	
}
