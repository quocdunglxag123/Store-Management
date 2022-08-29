package com.quocdung.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quocdung.dto.PromotionDto;
import com.quocdung.entity.Promotion;
import com.quocdung.mapstruct.PromotionMapper;
import com.quocdung.repository.PromotionRepository;
import com.quocdung.service.PromotionService;
@Service
public class PromotionServiceImpl implements PromotionService{
	@Autowired 
	private PromotionRepository promotionRepo;
	
	@Autowired
	private PromotionMapper promotionMapper;
	
	@Autowired
	public PromotionServiceImpl(PromotionMapper promotionMapper, PromotionRepository promotionRepo) {
		this.promotionMapper = promotionMapper;
		this.promotionRepo = promotionRepo;
	}
	@Override
	public Object getAllPromotion() {
		return promotionMapper.promotionsToPromotionDtos(promotionRepo.findAll());
	}

	@Override
	public Object getPromotion(Integer id) {
		return promotionMapper.promotionToPromotionDto(promotionRepo.findOneById(id));
	}

	@Override
	public Object addPromotion(PromotionDto promotionDto) {
		return promotionRepo.save(promotionMapper.promotionDtoToPromotion(promotionDto));
	}

	@Override
	public void deletePromotion(Integer id) {
		promotionRepo.delete(promotionRepo.findOneById(id));
	}

	@Override
	public Object updatePromotion(Integer id, PromotionDto promotionDto) {
		Promotion promotionNew = promotionMapper.promotionDtoToPromotion(promotionDto);
		Promotion promotionOld = promotionRepo.findOneById(id);
		promotionOld.setDetail(promotionNew.getDetail());
		promotionOld.setLink(promotionNew.getLink());
		promotionOld.setExp(promotionNew.getExp());
		promotionRepo.save(promotionOld);
		return promotionMapper.promotionToPromotionDto(promotionOld);
	}
	@Override
	public Object getPromotionByProductId(Integer productId) {
		return promotionMapper.promotionsToPromotionDtos(promotionRepo.findByProductId(productId));
	}

}
