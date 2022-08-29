package com.quocdung.entity;

import java.io.Serializable;

public class ProductPromotionId implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Product product;
	private Promotion promotion;
	
	
	public ProductPromotionId() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductPromotionId(Product product, Promotion promotion) {
		super();
		this.product = product;
		this.promotion = promotion;
	}
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Promotion getPromotion() {
		return promotion;
	}
	public void setPromotion(Promotion promotion) {
		this.promotion = promotion;
	}
	
}
