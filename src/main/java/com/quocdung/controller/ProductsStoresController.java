package com.quocdung.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quocdung.dto.DataResponse;
import com.quocdung.dto.ProductsStoresDto;
import com.quocdung.service.impl.ProductsStoresServiceImpl;

@RestController
@RequestMapping("/productsStores")
public class ProductsStoresController {
	
	@Autowired
	private ProductsStoresServiceImpl service;
	
	@GetMapping
	public DataResponse getAll() {
		return new DataResponse(service.getAllProductsStores());
	}
	
	@GetMapping("/{productId}/{storeId}")
	public DataResponse getProductStore(@PathVariable(value="productId") Integer productId, 
			@PathVariable(value="storeId") Integer storeId) {
		return new DataResponse(service.getProductsStores(productId, storeId));
	}
	
	@PostMapping
	public DataResponse addProductToStore(@RequestBody ProductsStoresDto productsStoresDto) {
		return new DataResponse(service.addProductToStore(productsStoresDto));
		
	}
	
	@PutMapping
	public DataResponse updateProductStore(@RequestBody ProductsStoresDto productsStoresDto) {
		return new DataResponse(service.updateProductInStore(productsStoresDto));
	}

}
