package com.quocdung.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quocdung.dto.CustomerDto;
import com.quocdung.dto.DataResponse;
import com.quocdung.service.impl.CustomerServiceImpl;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	@Autowired
	private CustomerServiceImpl customerImpl;

	@GetMapping()
	public DataResponse getAllCustomer() {
		return new DataResponse(customerImpl.getAllCustomer());
	}

	@GetMapping("/{offset}/{pageSize}")
	public DataResponse getAllCustomer(@PathVariable(value = "offset") int offSet,
			@PathVariable(value = "pageSize") int pageSize) {
		return new DataResponse(customerImpl.getAllCustomerPagination(offSet, pageSize));
	}

	@GetMapping("/{customer_id}")
	public DataResponse getCustomer(@PathVariable(value = "customer_id") Integer customer_id) {
		return new DataResponse(customerImpl.getCustomer(customer_id));
	}

	@PostMapping()
	public DataResponse addCustomer(@RequestBody CustomerDto customerDto) {
		return new DataResponse(customerImpl.addCustomer(customerDto));
	}

	@DeleteMapping("/{customer_id}")
	public void deleteCustomer(@PathVariable(value = "customer_id") Integer customer_id) {
		customerImpl.deleteCustomer(customer_id);
	}

	@PutMapping("/{customer_id}")
	public DataResponse updateCustomer(@PathVariable(value = "customer_id") Integer customer_id,
			@RequestBody CustomerDto customerDto) {
		return new DataResponse(customerImpl.updateCustomer(customer_id, customerDto));
	}

	@PutMapping("/property/{customer_id}")
	public DataResponse updatePropertyCustomer(@PathVariable(value = "customer_id") Integer customer_id,
			@RequestBody CustomerDto customerDto) {
		return new DataResponse(customerImpl.updatePropertyCustomer(customer_id, customerDto));
	}
}
