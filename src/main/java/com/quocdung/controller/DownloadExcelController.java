package com.quocdung.controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.util.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quocdung.entity.OrderDetail;
import com.quocdung.excel.ExcelFileService;
import com.quocdung.repository.OrderDetailRepository;

@RestController
public class DownloadExcelController {

	@Autowired
	private OrderDetailRepository orderDetailRepo;

	@Autowired
	private ExcelFileService excelFileService;

	@GetMapping("/downloadExcelFile")
	public void downloadExcelFile(HttpServletResponse response) throws IOException {
		List<OrderDetail> contacts = (List<OrderDetail>) orderDetailRepo.findAll();
		ByteArrayInputStream byteArrayInputStream = excelFileService.export(contacts);
		response.setContentType("application/octet-stream");
		response.setHeader("Content-Disposition", "attachment; filename=report.xlsx");
		IOUtils.copy(byteArrayInputStream, response.getOutputStream());
	}

}