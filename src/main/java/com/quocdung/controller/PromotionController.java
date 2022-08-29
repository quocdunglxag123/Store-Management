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
import com.quocdung.dto.PromotionDto;
import com.quocdung.service.impl.PromotionServiceImpl;

@RestController
@RequestMapping("/promotions")
public class PromotionController {
	@Autowired
	private PromotionServiceImpl promotionImpl;

	@GetMapping()
	public DataResponse getAllPromotion() {
		return new DataResponse(promotionImpl.getAllPromotion());
	}

	@GetMapping("/{promotion_id}")
	public DataResponse getPromotion(@PathVariable(value = "promotion_id") Integer promotion_id) {
		return new DataResponse(promotionImpl.getPromotion(promotion_id));
	}

	@PostMapping()
	public DataResponse addPromotion(@RequestBody PromotionDto promotionDto) {
		return new DataResponse(promotionImpl.addPromotion(promotionDto));
	}

	@DeleteMapping("/{promotion_id}")
	public void deletePromotion(@PathVariable(value = "promotion_id") Integer promotion_id) {
		promotionImpl.deletePromotion(promotion_id);
	}

	@PutMapping("/{promotion_id}")
	public DataResponse updatePromotion(@PathVariable(value = "promotion_id") Integer promotion_id,
			@RequestBody PromotionDto promotionDto) {
		return new DataResponse(promotionImpl.updatePromotion(promotion_id, promotionDto));
	}
	@GetMapping("/product/{id}")
	public DataResponse getPromotionByProductId(@PathVariable(value = "id") Integer productId){
		return new DataResponse(promotionImpl.getPromotionByProductId(productId));
	}
}
