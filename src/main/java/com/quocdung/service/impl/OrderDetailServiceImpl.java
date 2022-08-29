package com.quocdung.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quocdung.dto.OrderDetailInPutDto;
import com.quocdung.entity.Order;
import com.quocdung.entity.OrderDetail;
import com.quocdung.entity.Product;
import com.quocdung.mapstruct.OrderDetailMapper;
import com.quocdung.repository.OrderDetailRepository;
import com.quocdung.repository.OrderRepository;
import com.quocdung.repository.ProductRepository;
import com.quocdung.service.OrderDetailService;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {

	@Autowired
	OrderDetailRepository detailRepo;
	@Autowired
	ProductRepository productRepo;
	@Autowired
	OrderRepository orderRepo;
	@Autowired
	OrderDetailMapper detailMapper;

	@Override
	public Object getOrderDetail(Integer id) {
		return detailMapper.orderDetailToOrderDetailDto(detailRepo.getReferenceById(id));
	}

	@Override
	public Object addOrderDetail(OrderDetailInPutDto orderDetailInPutDto) {
		OrderDetail orderDetailToAdd = detailMapper.orderDetailInPutDtoToOrderDetail(orderDetailInPutDto);
		Product product = productRepo.findOneById(orderDetailInPutDto.getProduct_id());
		Order order = orderRepo.findOneById(orderDetailInPutDto.getOrder_id());
		orderDetailToAdd.setOrder(order);
		orderDetailToAdd.setProduct(product);
		//Gia x so luong
		orderDetailToAdd.setTotalprice(product.getPrice() * orderDetailInPutDto.getQuantity());
		detailRepo.save(orderDetailToAdd);
		//set lai gia cua oder
		order.setTotal(order.getTotal() + orderDetailToAdd.getTotalprice());
		orderRepo.save(order);
		return detailMapper.orderDetailToOrderDetailDto(orderDetailToAdd);
	}

	@Override
	public void deleteOrderDetail(Integer id) {
		OrderDetail detail = detailRepo.findOneById(id);
		Order order = orderRepo.findOneById(detail.getOrder().getId());
		// Tru gia detail xoa
		order.setTotal(order.getTotal() - detail.getTotalprice());
		orderRepo.save(order);
		detailRepo.delete(detail);
	}

	@Override
	public Object updateOrderDetail(Integer id, Integer quanlity) {
		OrderDetail detail = detailRepo.findOneById(id);
		Order order = orderRepo.findOneById(detail.getOrder().getId());
		// Tru gia detail hien tai
		order.setTotal(order.getTotal() - detail.getTotalprice());
		orderRepo.save(order);
		// set lai gia moi update cua oderdetail
		detail.setQuantity(quanlity);
		detail.setTotalprice(detail.getQuantity() * detail.getProduct().getPrice());
		detailRepo.save(detail);
		// Cong lai vao Oder
		order.setTotal(order.getTotal() + detail.getTotalprice());
		orderRepo.save(order);
		return detailMapper.orderDetailToOrderDetailDto(detail);
	}

	@Override
	public Object getAllOrderDetail() {
		return detailMapper.orderDetailsToOrderDetailDtos(detailRepo.findAll());
	}

}
