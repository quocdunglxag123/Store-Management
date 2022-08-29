package com.quocdung.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderDto {
	@JsonProperty("id")
	private Integer id;
	
	@JsonProperty("customer")
	private CustomerDto customer;
	
	@JsonProperty("store")
	private StoreDto store;
	
	@JsonProperty("status")
	private boolean status;
	
	@JsonProperty("odertype")
	private boolean odertype;
	
	@JsonProperty("pay")
	private boolean pay;
	
	@JsonProperty("createdDate")
	private Date createdDate;
	
	@JsonProperty("shipDate")
	private Date shipDate;
	
	@JsonProperty("total")
	private float total;

	public OrderDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderDto(Integer id, CustomerDto customer, StoreDto store, boolean status, boolean odertype, boolean pay,
			Date createdDate, Date shipDate, float total) {
		super();
		this.id = id;
		this.customer = customer;
		this.store = store;
		this.status = status;
		this.odertype = odertype;
		this.pay = pay;
		this.createdDate = createdDate;
		this.shipDate = shipDate;
		this.total = total;
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

	public StoreDto getStore() {
		return store;
	}

	public void setStore(StoreDto store) {
		this.store = store;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public boolean isOdertype() {
		return odertype;
	}

	public void setOdertype(boolean odertype) {
		this.odertype = odertype;
	}

	public boolean isPay() {
		return pay;
	}

	public void setPay(boolean pay) {
		this.pay = pay;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getShipDate() {
		return shipDate;
	}

	public void setShipDate(Date shipDate) {
		this.shipDate = shipDate;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	
}
