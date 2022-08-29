package com.quocdung.mapstruct;

import java.util.List;

import org.mapstruct.Mapper;

import com.quocdung.dto.ManufacturerDto;
import com.quocdung.entity.Manufacturer;

@Mapper(componentModel = "spring")
public interface ManufacturerMapper {
	// ----------------------------Entity To DTO---------------------------

	// Manufacturer
	ManufacturerDto manufacturerToManufacturerDto(Manufacturer manufacturer);

	List<ManufacturerDto> manufacturersToManufacturerDtos(List<Manufacturer> manufacturer);

	// ---------------------------DTO To Entity----------------------

	// Manufacturer
	Manufacturer manufacturerDtoToManufacturer(ManufacturerDto manufacturerDTO);

}
