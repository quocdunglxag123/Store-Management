package com.quocdung.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="products_stores")
@IdClass(ProductStoreId.class)
public class ProductsStores {
	
	@Id
	@ManyToOne
	@JoinColumn(name ="product_id")
	private Product product;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "store_id")
	private Store store;
	
	private int inStock;
	
	public ProductsStores() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ProductsStores(Product product, Store store, int inStock) {
		super();
		this.product = product;
		this.store = store;
		this.inStock = inStock;
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

	public int getInStock() {
		return inStock;
	}

	public void setInStock(int inStock) {
		this.inStock = inStock;
	}

	@Override
	public String toString() {
		return "ProductsStores [product=" + product.getName() + ", store=" + store.getStoreName() + ", inStock=" + inStock + "]";
	}
	
	
	
	
}
