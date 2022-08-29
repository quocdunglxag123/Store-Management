package com.quocdung.service;

import com.quocdung.dto.ImageDto;

public interface ImageService {
	Object getAllImage();

	Object getAllImagePagnation(int offSet, int pageSize);

	Object getImage(Integer id);

	Object addImage(ImageDto imageDto);

	void deleteImage(Integer id);

	Object updateImage(Integer id, ImageDto imageDto);
}
