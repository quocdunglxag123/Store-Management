package com.quocdung.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.quocdung.entity.Store;


@Repository
public interface StoreRepository extends JpaRepository<Store, Integer> {
	Store findOneById(Integer id);
	
	@Query("SELECT s  FROM Store s, ProductsStores pp WHERE s.id = pp.store.id AND pp.product.id = :productId")
	List<Store> findByProductId(Integer productId);
}
