
package com.quocdung.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.quocdung.dto.CategoryDto;
import com.quocdung.dto.PagingDto;
import com.quocdung.entity.Category;
import com.quocdung.mapstruct.CategoryMapper;
import com.quocdung.repository.CategoryRepository;
import com.quocdung.service.CategoryService;



@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepo;
	@Autowired
	private CategoryMapper categoryMapper;

	@Autowired
	public CategoryServiceImpl(CategoryMapper categoryMapper, CategoryRepository categoryRepo) {
		this.categoryMapper = categoryMapper;
		this.categoryRepo = categoryRepo;
	}

	@Override
	public Object getAllCategorys() {
		return categoryMapper.categorysToCategoryDtos(categoryRepo.findAll());
	}

	@Override
	public Object getCategory(Integer id) {
		return categoryMapper.categoryToCategoryDto(categoryRepo.findOneById(id));
	}

	@Override
	public Object addCategory(CategoryDto categoryDto) {
		return categoryRepo.save(categoryMapper.categoryDtoToCategory(categoryDto));
	}

	@Override
	public void deleteCategory(Integer id) {
		categoryRepo.delete(categoryRepo.findOneById(id));
	}

	@Override
	public Object updateCategory(Integer id, CategoryDto categoryDto) {
		Category categoryNew = categoryMapper.categoryDtoToCategory(categoryDto);
		Category categoryOld = categoryRepo.findOneById(id);
		categoryOld.setName(categoryNew.getName());
		categoryRepo.save(categoryOld);
		return categoryMapper.categoryToCategoryDto(categoryOld);
	}

	@Override
	public Object getAllProductPagnation(int offSet, int pageSize) {
		Pageable pageable = PageRequest.of(offSet-1, pageSize);
		Page<Category> page = categoryRepo.findAll(pageable);
		PagingDto pageDto = new PagingDto();
		pageDto.setCurrentPage(offSet);
		pageDto.setPageSize(pageSize);
		pageDto.setTotalElements(page.getTotalElements());
		pageDto.setTotalPages(page.getTotalPages());
		pageDto.setListDtos(categoryMapper.categorysToCategoryDtos(page.getContent()));
		return pageDto;
	}

}
