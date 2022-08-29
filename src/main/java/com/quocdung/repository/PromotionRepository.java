package com.quocdung.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.quocdung.entity.Promotion;

public interface PromotionRepository extends JpaRepository<Promotion, Integer>{
	Promotion findOneById(Integer id);
	
	@Query("SELECT p  FROM Promotion p, ProductsPromotions pp WHERE p.id = pp.promotion.id AND pp.product.id = :productId")
	List<Promotion> findByProductId(Integer productId);
}
