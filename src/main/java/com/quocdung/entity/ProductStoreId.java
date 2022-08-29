package com.quocdung.entity;

import java.io.Serializable;


public class ProductStoreId implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Product product;
	private Store store;
	
	
	public ProductStoreId() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductStoreId(Product product, Store store) {
		super();
		this.product = product;
		this.store = store;
	}
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Store getStore() {
		return store;
	}
	public void setStore(Store store) {
		this.store = store;
	}
	
}
