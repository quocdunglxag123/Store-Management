package com.quocdung.service;

import com.quocdung.dto.ProductDto;


public interface ProductService {
	Object getAllProducts();
	
	Object getAllProductPagnation(int offSet,int pageSize);
	
	Object getProduct(Integer id);
	
	Object addProduct(ProductDto productDto);
	
	Object updateProrduct(Integer id, ProductDto productDto);
	
	void deleteProduct(Integer id);
	
	Object getProductByCategoryPaging(Integer categoryId,int offSet, int pageSize);
}
