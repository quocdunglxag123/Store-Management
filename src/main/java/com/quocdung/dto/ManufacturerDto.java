package com.quocdung.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ManufacturerDto {
	@JsonProperty("id")
	private Integer id;

	@JsonProperty("branchName")
	private String branchName;

	@JsonProperty("manufacturerAddress")
	private String address;

	public ManufacturerDto() {
	}

	public ManufacturerDto(Integer id, String branchName, String address) {
		super();
		this.id = id;
		this.branchName = branchName;
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
