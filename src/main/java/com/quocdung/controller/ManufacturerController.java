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

import com.quocdung.dto.DataResponse;
import com.quocdung.dto.ManufacturerDto;
import com.quocdung.service.impl.ManufacturerServiceImpl;



@RestController
@RequestMapping("/manufacturers")
public class ManufacturerController {

	@Autowired
	private ManufacturerServiceImpl manufacturerImpl;

	@GetMapping()
	public DataResponse getAllCategory() {
		return new DataResponse( manufacturerImpl.getAllManufacturer());
	}

	@GetMapping("/{manufacturer_id}")
	public DataResponse getCategory(@PathVariable(value = "manufacturer_id") Integer manufacturer_id) {
		return new DataResponse( manufacturerImpl.getManufacturer(manufacturer_id));
	}

	@PostMapping()
	public DataResponse addCategory(@RequestBody ManufacturerDto manufacturerDto) {
		return new DataResponse( manufacturerImpl.addManufacturer(manufacturerDto));
	}

	@DeleteMapping("/{manufacturer_id}")
	public void deleteCategory(@PathVariable(value = "manufacturer_id") Integer manufacturer_id) {
		manufacturerImpl.deleteManufacturer(manufacturer_id);
	}

	@PutMapping("/{manufacturer_id}")
	public DataResponse updateCategory(@PathVariable(value = "manufacturer_id") Integer manufacturer_id, @RequestBody ManufacturerDto manufacturerDto ) {
		return new DataResponse(manufacturerImpl.updateManufacturer(manufacturer_id, manufacturerDto));
	}
}
