package com.quocdung.mapstruct;

import java.util.List;

import org.mapstruct.Mapper;

import com.quocdung.dto.PromotionDto;
import com.quocdung.entity.Promotion;

@Mapper(componentModel = "spring")
public interface PromotionMapper {
	// ----------------------------Entity To DTO---------------------------

	PromotionDto promotionToPromotionDto(Promotion promotion);

	List<PromotionDto> promotionsToPromotionDtos(List<Promotion> promotions);

	// ---------------------------DTO To Entity----------------------

	// Promotion
	Promotion promotionDtoToPromotion(PromotionDto promotionDto);
}
