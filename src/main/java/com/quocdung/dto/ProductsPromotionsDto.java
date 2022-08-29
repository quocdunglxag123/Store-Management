package com.quocdung.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductsPromotionsDto {
	
	@JsonProperty("product_id")
	private Integer product;

	@JsonProperty("promotion_id")
	private Integer promotion;

	public Integer getProduct() {
		return product;
	}

	public void setProduct(Integer product) {
		this.product = product;
	}

	public Integer getPromotion() {
		return promotion;
	}

	public void setPromotion(Integer promotion) {
		this.promotion = promotion;
	}

	@Override
	public String toString() {
		return "ProductsPromotions [product=" + product + ", promotion=" + promotion + "]";
	}
	
	
	
}
