package com.quocdung.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quocdung.entity.Store;


@Repository
public interface StoreRepository extends JpaRepository<Store, Integer> {
	Store findOneById(Integer id);
	
}
