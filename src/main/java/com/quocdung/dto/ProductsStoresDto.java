package com.quocdung.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ProductsStoresDto {
	@JsonProperty("store_id")
	private Integer store;
	
	@JsonProperty("product_id")
	private Integer product;
	
	@JsonProperty("inStock")
	private int inStock;

	public Integer getStore() {
		return store;
	}

	public void setStore(Integer store) {
		this.store = store;
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

	@Override
	public String toString() {
		return "ProductsStoresDto [store=" + store + ", product=" + product + ", inStock=" + inStock + "]";
	}
	
	
	
}
