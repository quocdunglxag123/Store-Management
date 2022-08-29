
package com.quocdung.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quocdung.dto.DataResponse;
import com.quocdung.dto.ProductDto;
import com.quocdung.service.impl.ProductServiceImpl;

@RestController
@RequestMapping(path="/products")
public class ProductController {
	
	@Autowired
	private ProductServiceImpl productService;
	
	@GetMapping
	public DataResponse getAllProducts(){
		return new DataResponse(productService.getAllProducts());
	}
	
	@GetMapping(value="/{id}")
	public DataResponse getProduct(@PathVariable(value ="id") Integer id) {
		return new DataResponse(productService.getProduct(id));
	}
	
	@DeleteMapping(value = "/{id}")
	public DataResponse deleteProduct(@PathVariable(value = "id") Integer id) {
		productService.deleteProduct(id);
		return new DataResponse("Deleted");
	}
	
	@PostMapping
	public DataResponse addProduct(@Validated @RequestBody ProductDto productDto) {
		return new DataResponse(productService.addProduct(productDto));
	}
	
	@PutMapping(value="/{id}")
	public DataResponse updateProduct(@PathVariable(value="id") Integer id,@Validated @RequestBody ProductDto productDto) {
		return new DataResponse(productService.updateProrduct(id, productDto));
	}
	
	@GetMapping(value="/{offset}/{pageSize}")
	public DataResponse getProductPaging(@PathVariable(value = "offset") int offSet,
			@PathVariable(value = "pageSize") int pageSize){
		return new DataResponse(productService.getAllProductPagnation(offSet, pageSize));
		
	}
	
	@GetMapping("/category/{id}/{offset}/{pageSize}")
	public DataResponse getProductByCategoryPaging(@PathVariable(value = "id") Integer categoryId, 
			@PathVariable(value="offset") int offSet, @PathVariable int pageSize){
		return new DataResponse(productService.getProductByCategoryPaging(categoryId, offSet, pageSize));
	}
	
}
