
package com.quocdung.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.quocdung.dto.DataResponse;
import com.quocdung.dto.ProductDto;
import com.quocdung.dto.ProductSearchDto;
import com.quocdung.dto.SearchCriteria;
import com.quocdung.service.impl.ProductServiceImpl;
import com.quocdung.specification.ProductSpecificationBuilder;

@RestController
@RequestMapping(path = "/products")
public class ProductController {

	@Autowired
	private ProductServiceImpl productService;

	@GetMapping
	public DataResponse getAllProducts() {
		return new DataResponse(productService.getAllProducts());
	}

	@GetMapping(value = "/{id}")
	public DataResponse getProduct(@PathVariable(value = "id") Integer id) {
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

	@PutMapping(value = "/{id}")
	public DataResponse updateProduct(@PathVariable(value = "id") Integer id,
			@Validated @RequestBody ProductDto productDto) {
		return new DataResponse(productService.updateProrduct(id, productDto));
	}

	@GetMapping(value="/paging")
	public DataResponse getProductPaging(
			@RequestParam(defaultValue="id") String sortBy, @RequestParam(defaultValue = "true") Boolean asc,
			@RequestParam(defaultValue="1") int pageNum, @RequestParam(defaultValue = "20") int pageSize) {
		return new DataResponse(productService.getAllProductPagnation(pageNum, pageSize,sortBy,asc));

	}

	@GetMapping("/category/{id}")
	public DataResponse getProductByCategoryPaging(@PathVariable(value = "id") Integer categoryId,
			@RequestParam(defaultValue="product_id") String sortBy, @RequestParam(defaultValue = "true") Boolean asc,
			@RequestParam(defaultValue="1") int pageNum, @RequestParam(defaultValue = "20") int pageSize) {
		return new DataResponse(productService.getProductByCategoryPaging(categoryId, pageNum, pageSize,sortBy,asc));
	}
	
	@GetMapping("/colors/{productName}")
	public DataResponse getListColorValuesOfProductName(@PathVariable String productName) {
		return new DataResponse(productService.getListColorValuesOfProductName(productName));
	}
	
	@GetMapping("/rams/{productName}")
	public DataResponse getListRamValuesOfProductName(@PathVariable String productName) {
		return new DataResponse(productService.getListRamValuesOfProductName(productName));
	}

	// Filter
	// products/filter?pageSize=10&pageNum=1&sortBy=price&asc=true
	@PostMapping("/filter")
	public DataResponse filterProduct(
			@RequestParam(defaultValue="id") String sortBy, @RequestParam(defaultValue = "true") Boolean asc,
			@RequestParam(defaultValue="1") int pageNum, @RequestParam(defaultValue = "20") int pageSize,
			@RequestBody ProductSearchDto searchDto) {
		ProductSpecificationBuilder builder = new ProductSpecificationBuilder();
		List<SearchCriteria> searchCriterias = searchDto.getSearchCriterias();
		if (searchCriterias != null) {
			searchCriterias.forEach(x -> {
				x.setDataOption(searchDto.getDataOption());
				builder.with(x);
			});
		}
		Object result = productService.findBySearchCriteria(builder.build(), pageNum, pageSize, sortBy, asc);
		DataResponse dataResponse = new DataResponse(result);
		return dataResponse;
	}

}
