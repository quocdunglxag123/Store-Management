package com.quocdung.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quocdung.dto.OrderDetailDto;
import com.quocdung.entity.OrderDetail;
import com.quocdung.mapstruct.OrderMapper;
import com.quocdung.repository.OrderDetailRepository;
import com.quocdung.service.OrderDetailService;

@Service
public class OrderDetailServiceImpl implements OrderDetailService{

	@Autowired
	OrderDetailRepository detailRepo;
	
	@Autowired
	OrderMapper detailMapper;
	
//	@Override
//	public List<OrderDetailDto> getOrderDetailsByOrderId(Integer orderId) {
//		return detailMapper.orderDetailsToOrderDetailDtos(detailRepo.getOrderDetailsByOrderId(orderId));
//	}

	@Override
	public Object getOrderDetail(Integer id) {
		return detailMapper.orderDetailToOrderDetailDto(detailRepo.getReferenceById(id));
	}

	@Override
	public Object addOrderDetail(OrderDetailDto orderDetailDto) {
		OrderDetail orderDetailToAdd = detailMapper.orderDetailDtoToOrderDetail(orderDetailDto);
		return detailMapper.orderDetailToOrderDetailDto(detailRepo.save(orderDetailToAdd));
	}


}
