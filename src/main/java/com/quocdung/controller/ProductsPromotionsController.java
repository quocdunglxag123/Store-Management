package com.quocdung.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quocdung.dto.DataResponse;
import com.quocdung.dto.ProductsPromotionsDto;
import com.quocdung.service.impl.ProductsPromotionsServiceImpl;

@RestController
@RequestMapping("/productsPromotions")
public class ProductsPromotionsController {
	@Autowired
	private ProductsPromotionsServiceImpl productsPromotionsServiceImpl;
	
	@PostMapping
	public DataResponse addProductToStore(@RequestBody ProductsPromotionsDto productsPromotionsDto) {
		return new DataResponse(productsPromotionsServiceImpl.addProductToPromotion(productsPromotionsDto));
		
	}
}
