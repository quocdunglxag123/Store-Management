package com.quocdung.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.quocdung.dto.PagingDto;
import com.quocdung.dto.StoreDto;
import com.quocdung.entity.Store;
import com.quocdung.mapstruct.StoreMapper;
import com.quocdung.repository.StoreRepository;
import com.quocdung.service.StoreService;


@Service
public class StoreServiceImpl implements StoreService {

	@Autowired
	private StoreRepository storeRepo;
	@Autowired
	private StoreMapper storeMapper;

	@Autowired
	public StoreServiceImpl(StoreMapper storeMapper, StoreRepository storeRepo) {
		this.storeMapper = storeMapper;
		this.storeRepo = storeRepo;
	}

	@Override
	public Object getAllStorePagnation(int offSet, int pageSize) {

		Pageable pageable = PageRequest.of(offSet - 1, pageSize);
		// Page<Store> a = storeRepo.findAll(pageable);
		Page<Store> page = storeRepo.findAll(pageable);
		/*
		 * page.forEach(); page.map(() -> convertStoreList());
		 */
		PagingDto response = new PagingDto();
		response.setCurrentPage(offSet);
		response.setPageSize(pageSize);
		response.setTotalElements(page.getTotalElements());
		response.setTotalPages(page.getTotalPages());
		List<StoreDto> listStoreDtos = storeMapper.storesToStoreDtos(page.getContent());
		response.setListDtos(listStoreDtos);

		return page;
	}

	@Override
	public Object getAllStore() {
		return storeMapper.storesToStoreDtos(storeRepo.findAll());
	}

	@Override
	public Object getStore(Integer id) {
		return storeMapper.storeToStoreDto(storeRepo.findOneById(id));
	}

	@Override
	public Object addStore(StoreDto storeDto) {	
		return storeRepo.save(storeMapper.storeDtoToStore(storeDto));
	}

	@Override
	public void deleteStore(Integer id) {
		storeRepo.delete(storeRepo.findOneById(id));
	}

	@Override
	public Object updateStore(Integer id, StoreDto storeDto) {
		Store storeNew = storeMapper.storeDtoToStore(storeDto);
		Store storeOld = storeRepo.findOneById(id);
		storeOld.setAddress(storeNew.getAddress());
		storeOld.setCityName(storeNew.getCityName());
		storeOld.setStoreName(storeNew.getStoreName());
		storeRepo.save(storeOld);
		return storeMapper.storeToStoreDto(storeOld);
	}

	@Override
	public Object updatePropertyStore(Integer id, StoreDto storeDto) {
		Store storeNew = storeMapper.storeDtoToStore(storeDto);
		Store storeOld = storeRepo.findOneById(id);
		if (!(storeNew.getAddress() == null)) {
			storeOld.setAddress(storeNew.getAddress());
		}
		if (!(storeNew.getCityName() == null)) {
			storeOld.setCityName(storeNew.getCityName());
		}
		if (!(storeNew.getStoreName() == null)) {
			storeOld.setStoreName(storeNew.getStoreName());
		}

		storeRepo.save(storeOld);
		return storeMapper.storeToStoreDto(storeOld);
	}

	@Override
	public Object getStoreByProductId(Integer productId) {
		return storeMapper.storesToStoreDtos(storeRepo.findByProductId(productId));
	}


}
