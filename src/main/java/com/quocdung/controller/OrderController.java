package com.quocdung.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quocdung.dto.DataResponse;
import com.quocdung.dto.OrderInPutDto;
import com.quocdung.service.impl.OrderServiceImpl;

@RestController
@RequestMapping(path = "/orders")
public class OrderController {
	@Autowired
	private OrderServiceImpl orderImpl;

	@GetMapping
	public DataResponse getAllOrders() {
		return new DataResponse (orderImpl.getAllOrders());
	}

	@GetMapping(value = "/{order_id}")
	public DataResponse getOrder(@PathVariable(value = "order_id") Integer order_id) {
		return new DataResponse (orderImpl.getOrder(order_id));
	}

	@DeleteMapping(value = "/{order_id}")
	public void deleteOrder(@PathVariable(value = "order_id") Integer order_id) {
		orderImpl.deleteOrder(order_id);
	}

	@PostMapping
	public DataResponse addOrder(@RequestBody OrderInPutDto orderInPutDto) {
		return new DataResponse (orderImpl.addOrder(orderInPutDto));
	}

}
