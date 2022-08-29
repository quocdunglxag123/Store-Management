package com.quocdung.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.quocdung.entity.Image;
import com.sun.istack.Nullable;

public class ProductDto {
	@JsonProperty("id")
	private Integer id;
	
	@JsonProperty("productName")
	private String name;
	
	@JsonProperty("category")
	private CategoryDto category;
	
	@JsonProperty("manufacturer")
	private ManufacturerDto manufacturer;
	
	@JsonProperty("description")
	private String description;
	
	@JsonProperty("price")
	private float price;
	
	@JsonProperty("discount")
	@Nullable
	private float discount;
	
	@JsonProperty("images")
	private List<Image> images;
	
	@JsonProperty("videoURL")
	private String video;
	
	@JsonProperty("productWarranty")
	private String productWarranty;
	
	@JsonProperty("status")
	private Boolean status;
	
	@JsonProperty("unit")
	private String unit;
	
	@JsonProperty("ram")
	private String ram;
	
	@JsonProperty("rom")
	private String rom;
	
	@JsonProperty("screen")
	private String screen;
	
	@JsonProperty("battery")
	private String battery;
	
	@JsonProperty("os")
	private String os;
	
	@JsonProperty("camera")
	private String camera;
	
	@JsonProperty("color")
	private String color;

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

	public CategoryDto getCategory() {
		return category;
	}

	public void setCategory(CategoryDto category) {
		this.category = category;
	}

	public ManufacturerDto getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(ManufacturerDto manufacturer) {
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
