package com.quocdung.exception.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.quocdung.dto.DataResponse;
import com.quocdung.exception.AccountException;
import com.quocdung.exception.TokenException;


@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(RuntimeException.class)
	@ResponseBody
	public DataResponse handleRuntimeException(RuntimeException e) {
		return new DataResponse("400", e.getMessage(), 200);
	}

	@ExceptionHandler(AccountException.class)
	@ResponseBody
	public DataResponse handleAccountException(AccountException e) {
		return new DataResponse("400", e.getMessage(), 200);
	}
	
	@ExceptionHandler(TokenException.class)
	@ResponseBody
	public DataResponse handleAccountException(TokenException e) {
		return new DataResponse("400", e.getMessage(), 200);
	}

}
