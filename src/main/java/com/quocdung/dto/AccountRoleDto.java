package com.quocdung.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountRoleDto {
	@JsonProperty("account_id")
	private Integer account_id;
	@JsonProperty("role_id")
	private Integer role_id;
	

	

	public AccountRoleDto() {
	}




	public AccountRoleDto(Integer account_id, Integer role_id) {
		super();
		this.account_id = account_id;
		this.role_id = role_id;
	}




	public Integer getAccount_id() {
		return account_id;
	}




	public void setAccount_id(Integer account_id) {
		this.account_id = account_id;
	}




	public Integer getRole_id() {
		return role_id;
	}




	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}




	
}
