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

import com.quocdung.dto.DataResponse;
import com.quocdung.dto.StoreDto;
import com.quocdung.service.impl.StoreServiceImpl;

@RestController
@RequestMapping("/stores")
public class StoreController {
	@Autowired
	private StoreServiceImpl storeImpl;

	@GetMapping()
	public DataResponse getAllStore() {
		return  new DataResponse(storeImpl.getAllStore());
	}

	@GetMapping("/{offset}/{pageSize}")
	public DataResponse getAllStore(@PathVariable(value = "offset") int offSet,
			@PathVariable(value = "pageSize") int pageSize) {
		return new DataResponse(storeImpl.getAllStorePagnation(offSet, pageSize));
	}

	@GetMapping("/{store_id}")
	public DataResponse getStore(@PathVariable(value = "store_id") Integer store_id) {
		 return new DataResponse(storeImpl.getStore(store_id));
	}

	@PostMapping()
	public DataResponse addStore(@RequestBody StoreDto storeDto) {
		return new DataResponse(storeImpl.addStore(storeDto));
	}

	@DeleteMapping("/{store_id}")
	public void deleteStore(@PathVariable(value = "store_id") Integer store_id) {
		 storeImpl.deleteStore(store_id);
	}

	@PutMapping("/{store_id}")
	public DataResponse updateStore(@PathVariable(value = "store_id") Integer store_id, @RequestBody StoreDto storeDto) {
		return new DataResponse(storeImpl.updateStore(store_id, storeDto));
	}

	@PutMapping("/property/{store_id}")
	public DataResponse updatePropertyStore(@PathVariable(value = "store_id") Integer store_id,
			@RequestBody StoreDto storeDto) {
		return new DataResponse(storeImpl.updatePropertyStore(store_id, storeDto));
	}
}
