package com.quocdung.excel;

import java.io.ByteArrayInputStream;
import java.util.List;

import com.quocdung.entity.OrderDetail;

public interface ExcelFileService {
	ByteArrayInputStream export(List<OrderDetail> orderDetails);
}
