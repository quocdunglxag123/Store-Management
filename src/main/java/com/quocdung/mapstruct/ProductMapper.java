package com.quocdung.mapstruct;

import java.util.List;

import org.mapstruct.Mapper;

import com.quocdung.dto.ProductDto;
import com.quocdung.entity.Product;

@Mapper(componentModel = "spring")
public interface ProductMapper {
	// ----------------------------Entity To DTO---------------------------
	// Product
	ProductDto productToProductDto (Product product);
	
	List<ProductDto> productsToProductDtos(List<Product> list);
	// ---------------------------DTO To Entity----------------------
	// ProductDTO
	Product productDtoToProduct(ProductDto productDto);
	
	List<Product> productDtosToProducts(List<ProductDto>list);
}
