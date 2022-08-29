package com.quocdung.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quocdung.dto.DataResponse;
import com.quocdung.dto.OrderDetailInPutDto;
import com.quocdung.service.impl.OrderDetailServiceImpl;

@RestController
@RequestMapping(value="/details")
public class OrderDetailController {
	
	@Autowired
	private OrderDetailServiceImpl detailServiceImpl;
	@GetMapping()
	public DataResponse getAllOrderDetail() {
		return new DataResponse( detailServiceImpl.getAllOrderDetail());
	}
	@GetMapping(value="/{id}")
	public DataResponse getOrderDetail(@PathVariable(value = "id") Integer id) {
		return new DataResponse( detailServiceImpl.getOrderDetail(id));
	}
	
	@PostMapping
	public DataResponse addOrderDetail(@RequestBody OrderDetailInPutDto orderDetailInPutDto) {
		return new DataResponse( detailServiceImpl.addOrderDetail(orderDetailInPutDto));
	}
	@PutMapping(value="/{id}/{quanlity}")
	public DataResponse updateOrderDetail(@PathVariable(value = "id") Integer id, @PathVariable(value = "quanlity") Integer quanlity) {
		return new DataResponse( detailServiceImpl.updateOrderDetail(id,quanlity));
	}
	
	@DeleteMapping(value = "/{id}")
	public void deleteOrder(@PathVariable(value = "id") Integer id) {
		detailServiceImpl.deleteOrderDetail(id);
	}

}
