package com.quocdung.exception;

public class AccountException extends RuntimeException {
	// ACCOUNT NOT FOUND
	public AccountException(Integer id) {
		super(String.format("Account with Id %d not found", id));
	}

}
