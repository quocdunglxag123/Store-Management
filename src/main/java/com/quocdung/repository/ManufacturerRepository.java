package com.quocdung.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quocdung.entity.Manufacturer;


@Repository
public interface ManufacturerRepository extends JpaRepository<Manufacturer, Integer> {
	Manufacturer findOneById(Integer id);
}
