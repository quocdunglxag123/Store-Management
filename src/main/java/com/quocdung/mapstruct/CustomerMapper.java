package com.quocdung.mapstruct;

import java.util.List;

import org.mapstruct.Mapper;

import com.quocdung.dto.CustomerDto;
import com.quocdung.entity.Customer;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
	CustomerDto customerToCustomerDto(Customer customer);

	List<CustomerDto> customersToCustomerDtos(List<Customer> customers);

	Customer customerDtoToCustomer(CustomerDto customerDto);
}
