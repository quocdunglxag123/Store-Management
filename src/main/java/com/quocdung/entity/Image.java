package com.quocdung.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class Image {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String url;
	
	@ManyToOne
	@JoinColumn(name="product_id")
	//must have
	@JsonIgnore
	private Product product;
	
	public Image() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Image(String url, Product product) {
		super();
		this.url = url;
		this.product = product;
	}



	public Image(String url) {
		super();
		this.url = url;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}



	@Override
	public String toString() {
		return "Image [id=" + id + ", url=" + url + ", product=" + product + "]";
	}
	
	
	
}
