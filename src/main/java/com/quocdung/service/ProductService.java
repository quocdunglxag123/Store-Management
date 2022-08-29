package com.quocdung.service;


import org.springframework.data.jpa.domain.Specification;

import com.quocdung.dto.ProductDto;
import com.quocdung.entity.Product;


public interface ProductService {
	Object getAllProducts();
	
	Object getAllProductPagnation(int offSet,int pageSize,String sortBy, Boolean asc);
	
	Object getProduct(Integer id);
	
	Object addProduct(ProductDto productDto);
	
	Object updateProrduct(Integer id, ProductDto productDto);
	
	void deleteProduct(Integer id);
	
	Object getProductByCategoryPaging(Integer categoryId,int offSet, int pageSize, String sortBy, Boolean asc);
	
	Object getListColorValuesOfProductName(String productName);
	
	Object getListRamValuesOfProductName(String productName);
	
	//Filter
	Object findBySearchCriteria(Specification<Product> spec,int offSet, int pageSize,String sortBy, Boolean asc);

}
