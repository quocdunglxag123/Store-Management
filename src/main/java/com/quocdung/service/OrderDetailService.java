package com.quocdung.service;


import com.quocdung.dto.OrderDetailDto;

public interface OrderDetailService {
	//List<OrderDetailDto> getOrderDetailsByOrderId(Integer orderId);
	
	Object getOrderDetail(Integer id);
	
	Object addOrderDetail(OrderDetailDto orderDetailDto);
}
