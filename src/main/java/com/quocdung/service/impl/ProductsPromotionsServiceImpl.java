package com.quocdung.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quocdung.dto.ProductsPromotionsDto;
import com.quocdung.repository.ProductRepository;
import com.quocdung.repository.ProductsPromotionsRepository;
import com.quocdung.repository.PromotionRepository;
import com.quocdung.service.ProductsPromotionsService;

@Service
public class ProductsPromotionsServiceImpl implements ProductsPromotionsService {
	@Autowired
	private ProductsPromotionsRepository repo;

	@Autowired
	private ProductRepository productRepo;

	@Autowired
	private PromotionRepository promotionRepo;

	@Override
	public Object addProductToPromotion(ProductsPromotionsDto productsPromotionsDto) {
		Integer productId = productsPromotionsDto.getProduct();
		Integer promotionId = productsPromotionsDto.getPromotion();
		if (productRepo.findById(productId).isPresent() && promotionRepo.findById(promotionId).isPresent()) {
			repo.insertIntoProductsPromotions(productId, promotionId);
			return productsPromotionsDto;
		}
		return null;
	}

}
