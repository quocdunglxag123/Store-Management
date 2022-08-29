package com.quocdung.service;

import com.quocdung.dto.CustomerDto;

public interface CustomerService {
	Object getAllCustomer();

	Object getAllCustomerPagination(int offSet, int pageSize);

	Object getCustomer(Integer id);

	Object addCustomer(CustomerDto customerDto);

	void deleteCustomer(Integer id);

	Object updateCustomer(Integer id, CustomerDto customerDto);

	Object updatePropertyCustomer(Integer id, CustomerDto customerDto);
}