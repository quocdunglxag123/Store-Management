package com.quocdung.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.quocdung.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>, JpaSpecificationExecutor<Product>{
	
	@Query(value = "SELECT * FROM Product WHERE category_id = :categoryId", nativeQuery = true)
	public Page<Product> findByCategoryId(Integer categoryId, Pageable pageable);
	
	@Query(value="SELECT DISTINCT color FROM product WHERE name = :productName", nativeQuery=true)
	public List<String> getListColorValuesOfProduct(String productName);
	
	@Query(value="SELECT DISTINCT ram FROM product WHERE name = :productName", nativeQuery = true)
	public List<String> getListRamValuesOfProduct(String productName);
	
	Product findOneById(Integer id);

	
}
