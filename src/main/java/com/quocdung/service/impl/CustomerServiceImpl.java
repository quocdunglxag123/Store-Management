package com.quocdung.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.quocdung.dto.CustomerDto;
import com.quocdung.dto.PagingDto;
import com.quocdung.entity.Customer;
import com.quocdung.mapstruct.CustomerMapper;
import com.quocdung.repository.CustomerRepository;
import com.quocdung.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepo;
	@Autowired
	private CustomerMapper customerMapper;

	@Autowired
	public CustomerServiceImpl(CustomerMapper customerMapper, CustomerRepository customerRepo) {
		this.customerMapper = customerMapper;
		this.customerRepo = customerRepo;
	}

	@Override
	public Object getAllCustomerPagination(int offSet, int pageSize) {

		Pageable pageable = PageRequest.of(offSet - 1, pageSize);
		Page<Customer> page = customerRepo.findAll(pageable);
		PagingDto response = new PagingDto();
		response.setCurrentPage(offSet);
		response.setPageSize(pageSize);
		response.setTotalElements(page.getTotalElements());
		response.setTotalPages(page.getTotalPages());
		List<CustomerDto> listCustomerDtos = customerMapper.customersToCustomerDtos(page.getContent());
		response.setListDtos(listCustomerDtos);

		return page;
	}

	@Override
	public Object getAllCustomer() {
		return customerMapper.customersToCustomerDtos(customerRepo.findAll());
	}

	@Override
	public Object getCustomer(Integer id) {
		return customerMapper.customerToCustomerDto(customerRepo.findOneById(id));
	}

	@Override
	public Object addCustomer(CustomerDto customerDto) {
		return customerRepo.save(customerMapper.customerDtoToCustomer(customerDto));
	}

	@Override
	public void deleteCustomer(Integer id) {
		customerRepo.delete(customerRepo.findOneById(id));
	}

	@Override
	public Object updateCustomer(Integer id, CustomerDto customerDto) {
		Customer customerNew = customerMapper.customerDtoToCustomer(customerDto);
		Customer customerOld = customerRepo.findOneById(id);
		customerOld.setCustomerName(customerNew.getCustomerName());
		customerOld.setAddress(customerNew.getAddress());
		customerOld.setPhone(customerNew.getPhone());
		customerRepo.save(customerOld);
		return customerMapper.customerToCustomerDto(customerOld);
	}

	@Override
	public Object updatePropertyCustomer(Integer id, CustomerDto customerDto) {
		Customer customerNew = customerMapper.customerDtoToCustomer(customerDto);
		Customer customerOld = customerRepo.findOneById(id);
		if (!(customerNew.getCustomerName() == null)) {
			customerOld.setCustomerName(customerNew.getCustomerName());
		}
		if (!(customerNew.getAddress() == null)) {
			customerOld.setAddress(customerNew.getAddress());
		}
		if (!(customerNew.getPhone() == null)) {
			customerOld.setPhone(customerNew.getCustomerName());
		}

		customerRepo.save(customerOld);
		return customerMapper.customerToCustomerDto(customerOld);
	}
}
