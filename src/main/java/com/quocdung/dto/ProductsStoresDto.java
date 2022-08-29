package com.quocdung.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductsStoresDto {
	@JsonProperty("product_id")
	private Integer product;
	
	@JsonProperty("inStock")
	private int inStock;
	
	public ProductsStoresDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductsStoresDto(Integer product, int inStock) {
		super();
		this.product = product;
		this.inStock = inStock;
	}

	public Integer getProduct() {
		return product;
	}

	public void setProduct(Integer product) {
		this.product = product;
	}

	public int getInStock() {
		return inStock;
	}

	public void setInStock(int inStock) {
		this.inStock = inStock;
	}
	
	
}
