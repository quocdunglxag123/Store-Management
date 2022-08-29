package com.quocdung.mapstruct;

import java.util.List;

import org.mapstruct.Mapper;

import com.quocdung.dto.CategoryDto;
import com.quocdung.entity.Category;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
	// ----------------------------Entity To DTO---------------------------
	// Category
	CategoryDto categoryToCategoryDto(Category category);

	List<CategoryDto> categorysToCategoryDtos(List<Category> category);

	
	// ---------------------------DTO To Entity----------------------
	// Category
	Category categoryDtoToCategory(CategoryDto categoryDto);

}
