package com.quocdung.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="products_promotions")
@IdClass(ProductPromotionId.class)
public class ProductsPromotions {
	@Id
	@ManyToOne
	@JoinColumn(name ="product_id")
	private Product product;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "promotion_id")
	private Promotion promotion;

	public ProductsPromotions() {
	}

	public ProductsPromotions(Product product, Promotion promotion) {
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
