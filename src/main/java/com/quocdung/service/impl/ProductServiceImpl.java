package com.quocdung.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.quocdung.dto.PagingDto;
import com.quocdung.dto.ProductDto;
import com.quocdung.entity.Image;
import com.quocdung.entity.Product;
import com.quocdung.mapstruct.ProductMapper;
import com.quocdung.repository.ImageRepository;
import com.quocdung.repository.ProductRepository;
import com.quocdung.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepo;
	@Autowired
	private ImageRepository imageRepo;

	@Autowired
	private ProductMapper productMapper;

	@Override
	public Object getAllProducts() {
		return productMapper.productsToProductDtos(productRepo.findAll());
	}

	@Override
	public Object getProduct(Integer id) {
		Product product = productRepo.getReferenceById(id);
		return productMapper.productToProductDto(product);
	}

	@Override
	public Object addProduct(ProductDto productDto) {
		Product productToAdd = productMapper.productDtoToProduct(productDto);
		Product newestProduct = productRepo.save(productToAdd);
		for (Image image : newestProduct.getImages()) {
			image.setProduct(newestProduct);
			imageRepo.save(image);
		}
		return productMapper.productToProductDto(newestProduct);
	}

	@Override
	public Object updateProrduct(Integer id, ProductDto productDto) {
		if (productRepo.findById(id).isPresent()) {
			Product productToUpdate = productMapper.productDtoToProduct(productDto);
			productToUpdate.setId(id);
			List<Image> newImages = productDto.getImages();
			for (Image image : newImages) {
				image.setProduct(productToUpdate);
			}
			productToUpdate.setImages(newImages);
			return productMapper.productToProductDto(productRepo.save(productToUpdate));
		} else
			return null;
	}

	@Override
	public void deleteProduct(Integer id) {
		productRepo.deleteById(id);
	}

	@Override
	public Object getAllProductPagnation(int offSet, int pageSize, String sortBy, Boolean asc) {
		Pageable pageable;
		if(asc) {
			pageable = PageRequest.of(offSet-1, pageSize,Sort.by(sortBy).ascending());
		}else {
			pageable = PageRequest.of(offSet-1, pageSize,Sort.by(sortBy).descending());
		}
		Page<Product> page = productRepo.findAll(pageable);
		PagingDto response = new PagingDto();
		response.setCurrentPage(offSet);
		response.setPageSize(pageSize);
		response.setTotalElements(page.getTotalElements());
		response.setTotalPages(page.getTotalPages());
		List<ProductDto> listProductDtos = productMapper.productsToProductDtos(page.getContent());
		response.setListDtos(listProductDtos);
		return response;
	}

	@Override
	public Object getProductByCategoryPaging(Integer categoryId, int offSet, int pageSize, String sortBy, Boolean asc) {
		Pageable pageable;
		if(asc) {
			pageable = PageRequest.of(offSet-1, pageSize,Sort.by(sortBy).ascending());
		}else {
			pageable = PageRequest.of(offSet-1, pageSize,Sort.by(sortBy).descending());
		}
		Page<Product> page = productRepo.findByCategoryId(categoryId, pageable);
		PagingDto response = new PagingDto();
		response.setCurrentPage(offSet);
		response.setPageSize(pageSize);
		response.setTotalElements(page.getTotalElements());
		response.setTotalPages(page.getTotalPages());
		response.setListDtos(productMapper.productsToProductDtos(page.getContent()));
		return response;
	}

	@Override
	public Object findBySearchCriteria(Specification<Product> spec, int offSet, int pageSize, String sortBy, Boolean asc) {
		Pageable pageable;
		if(asc) {
			pageable = PageRequest.of(offSet-1, pageSize,Sort.by(sortBy).ascending());
		}else {
			pageable = PageRequest.of(offSet-1, pageSize,Sort.by(sortBy).descending());
		}
		Page<Product> page = productRepo.findAll(spec,pageable);
		PagingDto response = new PagingDto();
		response.setCurrentPage(offSet);
		response.setPageSize(pageSize);
		response.setTotalElements(page.getTotalElements());
		response.setTotalPages(page.getTotalPages());
		response.setListDtos(productMapper.productsToProductDtos(page.getContent()));
		return response;
	}

	@Override
	public Object getListColorValuesOfProductName(String productName) {
		return productRepo.getListColorValuesOfProduct(productName);
	}

	@Override
	public Object getListRamValuesOfProductName(String productName) {
		return productRepo.getListRamValuesOfProduct(productName);
	}

	
}
