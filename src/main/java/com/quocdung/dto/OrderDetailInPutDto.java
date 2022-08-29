package com.quocdung.dto;


import com.fasterxml.jackson.annotation.JsonProperty;


public class OrderDetailInPutDto {
	@JsonProperty("detailId")
	private Integer id;
	
	@JsonProperty("order_id")
	private Integer order_id;
	
	@JsonProperty("product_id")
	private Integer product_id;
	
	@JsonProperty("totalprice")
	private float totalprice;
	
	@JsonProperty("quantity")
	private int quantity;

	public OrderDetailInPutDto(Integer id, Integer order_id, Integer product_id, float totalprice, int quantity) {
		super();
		this.id = id;
		this.order_id = order_id;
		this.product_id = product_id;
		this.totalprice = totalprice;
		this.quantity = quantity;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}

	public Integer getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}

	public float getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(float totalprice) {
		this.totalprice = totalprice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	
	
}
