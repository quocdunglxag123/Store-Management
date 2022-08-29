package com.quocdung.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PromotionDto {
	@JsonProperty("id")
	private Integer id;
	
	@JsonProperty("detail")
	private String detail;
	
	@JsonProperty("link")
	private String link;
	
	@JsonProperty("exp")
	private Date exp;

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
	
	
}
