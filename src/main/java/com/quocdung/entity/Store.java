package com.quocdung.entity;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Store {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "store_id")
	private Integer id;

	@Column(nullable = false,unique = true)
	private String storeName;
	
	@Column
	private String cityName;
	
	@Column
	private String address;
	
	@OneToMany(mappedBy = "store", cascade = CascadeType.ALL) 
	private List<Order>orders;
	
	@OneToMany(mappedBy="store", fetch = FetchType.LAZY)
	private List<ProductsStores> productsStores;
	
	/*
	 * @OneToMany(mappedBy = "store", cascade = CascadeType.ALL) private List<Staff>
	 * staffs;
	 */

	public Store() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getStoreName() {
		return storeName;
	}


	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}


	public String getCityName() {
		return cityName;
	}


	public void setCityName(String cityName) {
		this.cityName = cityName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Store(String storeName, String cityName, String address, List<ProductsStores> productsStores) {
		super();
		this.storeName = storeName;
		this.cityName = cityName;
		this.address = address;
		this.productsStores = productsStores;
	}

	

	
}
