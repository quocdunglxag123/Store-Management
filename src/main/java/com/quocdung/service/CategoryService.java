package com.quocdung.service;

import com.quocdung.dto.CategoryDto;




public interface CategoryService {
	Object getAllCategorys();
	
	Object getAllProductPagnation(int offSet,int pageSize);

	Object getCategory(Integer id);

	Object addCategory(CategoryDto categoryDto);

	void deleteCategory(Integer id);

	Object updateCategory(Integer id, CategoryDto categoryDto);
}
