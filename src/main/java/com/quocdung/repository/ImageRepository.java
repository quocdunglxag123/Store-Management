package com.quocdung.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quocdung.entity.Image;

@Repository
public interface ImageRepository extends JpaRepository<Image, Integer>{
	Image findOneById(Integer id);
}
