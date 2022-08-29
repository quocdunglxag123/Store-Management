package com.quocdung.dto;

import java.util.List;

public class ProductSearchDto {
	private List<SearchCriteria> searchCriterias;
	private String dataOption;
	
	
	public ProductSearchDto() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ProductSearchDto(List<SearchCriteria> searchCriterias, String dataOption) {
		super();
		this.searchCriterias = searchCriterias;
		this.dataOption = dataOption;
	}


	public List<SearchCriteria> getSearchCriterias() {
		return searchCriterias;
	}


	public void setSearchCriterias(List<SearchCriteria> searchCriterias) {
		this.searchCriterias = searchCriterias;
	}


	public String getDataOption() {
		return dataOption;
	}


	public void setDataOption(String dataOption) {
		this.dataOption = dataOption;
	}
	
	
}
