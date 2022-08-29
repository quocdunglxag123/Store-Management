package com.quocdung.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quocdung.dto.DataResponse;
import com.quocdung.dto.OrderDetailDto;
import com.quocdung.service.impl.OrderDetailServiceImpl;

@RestController
@RequestMapping(value="/details")
public class OrderDetailController {
	
	@Autowired
	private OrderDetailServiceImpl detailServiceImpl;
	
	@GetMapping(value="/{id}")
	public DataResponse getOrderDetail(@PathVariable(value = "id") Integer id) {
		return new DataResponse( detailServiceImpl.getOrderDetail(id));
	}
	
	@PostMapping
	public DataResponse addOrderDetail(@Validated @RequestBody OrderDetailDto detailDto) {
		return new DataResponse( detailServiceImpl.addOrderDetail(detailDto));
	}
}
