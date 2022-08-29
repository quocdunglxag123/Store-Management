package com.quocdung.mapstruct;

import java.util.List;

import org.mapstruct.Mapper;

import com.quocdung.dto.OrderDetailDto;
import com.quocdung.entity.OrderDetail;

@Mapper(componentModel = "spring")
public interface OrderMapper {
	//----------------------------OrderDetail---------------------------
	//Entity to Dto
	OrderDetailDto orderDetailToOrderDetailDto(OrderDetail orderDetail);
	
	List<OrderDetailDto> orderDetailsToOrderDetailDtos(List<OrderDetail> list);
	//Dto to Entity
	OrderDetail orderDetailDtoToOrderDetail(OrderDetailDto detailDto);
	
	List<OrderDetail> orderDetailDtosToOrderDetails(List<OrderDetailDto> list);
	
	//----------------------------Order---------------------------------
	//Entity to Dto
//	OrderDto orderToOrderDto(Order order);
//	
//	List<OrderDto> ordersToOrderDtos(List<Order> list);
//	//Dto to Entity
//	Order orderDtoToOrder(OrderDto orderDto);
//	
//	List<Order> orderDtosToOrders(List<OrderDto> list);
	
	
}	

