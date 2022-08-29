package com.quocdung.service;

import com.quocdung.dto.ProductsStoresDto;

public interface ProductsStoresService {
	Object getAllProductsStores();
	
	Object getProductsStores(Integer productId,Integer storeId);
	
	Object addProductToStore(ProductsStoresDto productsStoresDto);
	
	Object updateProductInStore(ProductsStoresDto productsStoresDto);
	
}	
