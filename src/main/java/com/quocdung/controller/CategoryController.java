package com.quocdung.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quocdung.dto.CategoryDto;
import com.quocdung.dto.DataResponse;
import com.quocdung.service.impl.CategoryServiceImpl;



@RestController
@RequestMapping("/categories")
public class CategoryController {
	@Autowired
	private CategoryServiceImpl categoryImpl;

	@GetMapping()
	public DataResponse getAllCategory() {

		return new DataResponse(categoryImpl.getAllCategorys());
	}
	
	@GetMapping("/{offset}/{pageSize}")
	public DataResponse getAllCategoryPagnation(@PathVariable (value = "offset") int offSet, @PathVariable(value="pageSize") int pageSize) {
		return new DataResponse(categoryImpl.getAllProductPagnation(offSet, pageSize));
	}
	
	@GetMapping("/{category_id}")
	public DataResponse getCategory(@PathVariable(value = "category_id") Integer category_id) {
		return new DataResponse(categoryImpl.getCategory(category_id));
	}

	@PostMapping()
	public DataResponse addCategory(@RequestBody CategoryDto categoryDto) {
		return new DataResponse(categoryImpl.addCategory(categoryDto));
	}

	@DeleteMapping("/{category_id}")
	public void deleteCategory(@PathVariable(value = "category_id") Integer category_id) {
		categoryImpl.deleteCategory(category_id);
	}

	@PutMapping("/{category_id}")
	public DataResponse updateCategory(@PathVariable(value = "category_id") Integer category_id, @RequestBody CategoryDto categoryDto ) {
		return new DataResponse(categoryImpl.updateCategory(category_id, categoryDto));

	}
}
