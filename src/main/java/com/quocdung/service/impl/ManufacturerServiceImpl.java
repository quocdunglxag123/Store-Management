package com.quocdung.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quocdung.dto.ManufacturerDto;
import com.quocdung.entity.Manufacturer;
import com.quocdung.mapstruct.ManufacturerMapper;
import com.quocdung.repository.ManufacturerRepository;
import com.quocdung.service.ManufacturerService;



@Service
public class ManufacturerServiceImpl implements ManufacturerService {

	@Autowired
	private ManufacturerRepository manufacturerRepo;
	@Autowired
	private ManufacturerMapper manufacturerMapper;

	@Autowired
	public ManufacturerServiceImpl(ManufacturerMapper manufacturerMapper, ManufacturerRepository manufacturerRepo) {
		this.manufacturerMapper = manufacturerMapper;
		this.manufacturerRepo = manufacturerRepo;
	}

	@Override
	public Object getAllManufacturer() {
		return manufacturerMapper.manufacturersToManufacturerDtos(manufacturerRepo.findAll());
	}

	@Override
	public Object getManufacturer(Integer id) {
		return manufacturerMapper.manufacturerToManufacturerDto(manufacturerRepo.findOneById(id));
	}

	@Override
	public Object addManufacturer(ManufacturerDto manufacturerDto) {
		return manufacturerRepo.save(manufacturerMapper.manufacturerDtoToManufacturer(manufacturerDto));
	}

	@Override
	public void deleteManufacturer(Integer id) {
		manufacturerRepo.delete(manufacturerRepo.findOneById(id));
	}

	@Override
	public Object updateManufacturer(Integer id, ManufacturerDto manufacturerDto) {
		Manufacturer manufacturerNew = manufacturerMapper.manufacturerDtoToManufacturer(manufacturerDto);
		Manufacturer manufacturerOld = manufacturerRepo.findOneById(id);
		manufacturerOld.setAddress(manufacturerNew.getAddress());
		manufacturerOld.setBranchName(manufacturerNew.getBranchName());
		manufacturerRepo.save(manufacturerOld);
		return manufacturerMapper.manufacturerToManufacturerDto(manufacturerOld);
	}

	

	

}
