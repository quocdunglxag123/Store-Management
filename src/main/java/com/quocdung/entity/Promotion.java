package com.quocdung.entity;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name ="promotion")
public class Promotion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "promotion_id")
	private Integer id;
	
	private String detail;
	
	private String link;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd" , timezone = "GMT+8")
	private Date exp;
	
	@OneToMany(mappedBy="promotion", fetch = FetchType.LAZY)
	private List<ProductsPromotions> productsPromotions;

	public Promotion() {
	}

	public Promotion(String detail, String link, Date exp, List<ProductsPromotions> productsPromotions) {
		super();
		this.detail = detail;
		this.link = link;
		this.exp = exp;
		this.productsPromotions = productsPromotions;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Date getExp() {
		return exp;
	}

	public void setExp(Date exp) {
		this.exp = exp;
	}

	public List<ProductsPromotions> getProductsPromotions() {
		return productsPromotions;
	}

	public void setProductsPromotions(List<ProductsPromotions> productsPromotions) {
		this.productsPromotions = productsPromotions;
	}

}
