package com.quocdung.mapstruct;

import java.util.List;

import org.mapstruct.Mapper;

import com.quocdung.dto.OrderDto;
import com.quocdung.dto.OrderInPutDto;
import com.quocdung.entity.Order;

@Mapper(componentModel = "spring")
public interface OrderMapper {
	//----------------------------Order---------------------------------
	//Entity to Dto
	OrderDto orderToOrderDto(Order order);
	
	List<OrderDto> ordersToOrderDtos(List<Order> list);
	
	//Dto to Entity
	Order orderDtoToOrder(OrderDto orderDto);
	
	Order orderInPutDtoToOrder(OrderInPutDto orderInPutDto);
	
	List<Order> orderDtosToOrders(List<OrderDto> list);
	
	
}	

