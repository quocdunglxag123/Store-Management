package com.quocdung.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderInPutDto {
	@JsonProperty("id")
	private Integer id;
	
	@JsonProperty("customer_id")
	private Integer customer_id;
	
	@JsonProperty("store_id")
	private Integer store_id;
	
	@JsonProperty("status")
	private boolean status;
	
	@JsonProperty("odertype")
	private boolean odertype;
	
	@JsonProperty("pay")
	private boolean pay;
	
	public OrderInPutDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderInPutDto(Integer id, Integer customer_id, Integer store_id, boolean status, boolean odertype,
			boolean pay) {
		super();
		this.id = id;
		this.customer_id = customer_id;
		this.store_id = store_id;
		this.status = status;
		this.odertype = odertype;
		this.pay = pay;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}

	public Integer getStore_id() {
		return store_id;
	}

	public void setStore_id(Integer store_id) {
		this.store_id = store_id;
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

	
}
