package com.quocdung.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private Integer id;

	private String name;

	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;

	@ManyToOne
	@JoinColumn(name = "manufacturer_id")
	private Manufacturer manufacturer;

	@Column(length = 1000)
	private String description;

	private float price;

	private float discount;

	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval=true)
	private List<Image> images;

	private String video;

	private String productWarranty;

	private Boolean status;

	private String unit;

	@OneToMany(mappedBy="product", fetch = FetchType.LAZY)
	private List<ProductsStores> productsStores;
	
	@OneToMany(mappedBy="product", fetch = FetchType.LAZY)
	private List<ProductsPromotions> productsPromotions;
	///================\
	
	private String ram;
	
	private String rom;
	
	private String screen;
	
	private String battery;
	
	private String os;
	
	private String camera;
	
	private String color;

	public Product() {
	}

	public Product(String name, Category category, Manufacturer manufacturer, String description, float price,
			float discount, List<Image> images, String video, String productWarranty, Boolean status, String unit,
			List<ProductsStores> productsStores, List<ProductsPromotions> productsPromotions, String ram, String rom,
			String screen, String battery, String os, String camera, String color) {
		super();
		this.name = name;
		this.category = category;
		this.manufacturer = manufacturer;
		this.description = description;
		this.price = price;
		this.discount = discount;
		this.images = images;
		this.video = video;
		this.productWarranty = productWarranty;
		this.status = status;
		this.unit = unit;
		this.productsStores = productsStores;
		this.productsPromotions = productsPromotions;
		this.ram = ram;
		this.rom = rom;
		this.screen = screen;
		this.battery = battery;
		this.os = os;
		this.camera = camera;
		this.color = color;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public String getProductWarranty() {
		return productWarranty;
	}

	public void setProductWarranty(String productWarranty) {
		this.productWarranty = productWarranty;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public List<ProductsStores> getProductsStores() {
		return productsStores;
	}

	public void setProductsStores(List<ProductsStores> productsStores) {
		this.productsStores = productsStores;
	}

	
	public List<ProductsPromotions> getProductsPromotions() {
		return productsPromotions;
	}

	public void setProductsPromotions(List<ProductsPromotions> productsPromotions) {
		this.productsPromotions = productsPromotions;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getRom() {
		return rom;
	}

	public void setRom(String rom) {
		this.rom = rom;
	}

	public String getScreen() {
		return screen;
	}

	public void setScreen(String screen) {
		this.screen = screen;
	}

	public String getBattery() {
		return battery;
	}

	public void setBattery(String battery) {
		this.battery = battery;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getCamera() {
		return camera;
	}

	public void setCamera(String camera) {
		this.camera = camera;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
