package com.quocdung.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quocdung.dto.OrderDto;
import com.quocdung.dto.OrderInPutDto;
import com.quocdung.entity.Order;
import com.quocdung.mapstruct.OrderMapper;
import com.quocdung.repository.CustomerRepository;
import com.quocdung.repository.OrderRepository;
import com.quocdung.repository.StoreRepository;
import com.quocdung.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderRepository orderRepo;

	@Autowired
	private CustomerRepository customerRepo;
	@Autowired
	private StoreRepository storeRepo;
	
	@Autowired
	private OrderMapper orderMapper;

	@Override
	public Object getAllOrders() {
		return orderMapper.ordersToOrderDtos(orderRepo.findAll());
	}
	@Override
	public Object getOrder(Integer id) {
		Order order = orderRepo.getReferenceById(id);
		return orderMapper.orderToOrderDto(order);
	}

	@Override
	public Object addOrder(OrderInPutDto orderInPutDto) {
		Order order = orderMapper.orderInPutDtoToOrder(orderInPutDto);
		order.setCustomer(customerRepo.findOneById(orderInPutDto.getCustomer_id()));
		order.setStore(storeRepo.findOneById(orderInPutDto.getStore_id()));
		orderRepo.save(order);
		int no_of_day_to_add = 1;
		Date createDate = order.getCreatedDate();
		Date tomorrow = new Date( createDate.getYear(), createDate.getMonth(), createDate.getDate() + no_of_day_to_add );
		order.setShipDate(tomorrow);
		orderRepo.save(order);
		OrderDto orderDto = orderMapper.orderToOrderDto(order);
		return orderDto;
	}

	@Override
	public void deleteOrder(Integer id) {
		orderRepo.deleteById(id);
	}

}
