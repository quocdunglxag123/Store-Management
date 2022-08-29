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
import com.quocdung.dto.ImageDto;
import com.quocdung.service.impl.ImageServiceImpl;

@RestController
@RequestMapping("/images")
public class  ImageController {
	@Autowired
	private ImageServiceImpl imageImpl;

	@GetMapping()
	public DataResponse getAllImage() {
		return new DataResponse(imageImpl.getAllImage());
	}

	@GetMapping("/{offSet}/{pageSize}")
	public DataResponse getAllImage(@PathVariable int offSet, @PathVariable int pageSize) {
		return new DataResponse(imageImpl.getAllImagePagnation(offSet, pageSize));
	}

	@GetMapping("/{image_id}")
	public DataResponse getCategory(@PathVariable(value = "image_id") Integer image_id) {
		return new DataResponse(imageImpl.getImage(image_id));
	}

	@PostMapping()
	public DataResponse addImage(@RequestBody ImageDto imageDto) {
		return new DataResponse(imageImpl.addImage(imageDto));
	}

	@DeleteMapping("/{image_id}")
	public void deleteImage(@PathVariable(value = "image_id") Integer image_id) {
		imageImpl.deleteImage(image_id);
	}

	@PutMapping("/{image_id}")
	public DataResponse updateImage(@PathVariable(value = "image_id") Integer image_id, @RequestBody ImageDto imageDto) {
		return new DataResponse(imageImpl.updateImage(image_id, imageDto));
	}
}
