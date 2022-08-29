package com.quocdung.mapstruct;

import java.util.List;

import org.mapstruct.Mapper;

import com.quocdung.dto.StoreDto;
import com.quocdung.entity.Store;

@Mapper(componentModel = "spring",uses=ProductsStoresMapper.class)
public interface StoreMapper {
	// ----------------------------Entity To DTO---------------------------

	StoreDto storeToStoreDto(Store store);

	List<StoreDto> storesToStoreDtos(List<Store> stores);

	// ---------------------------DTO To Entity----------------------

	// Store
	Store storeDtoToStore(StoreDto storeDto);

}
