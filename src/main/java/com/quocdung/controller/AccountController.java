package com.quocdung.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quocdung.dto.AccountDto;
import com.quocdung.dto.AccountTokenResponse;
import com.quocdung.dto.DataResponse;
import com.quocdung.entity.Account;
import com.quocdung.security.JwtTokenUtil;
import com.quocdung.service.impl.AccountServiceImpl;

@RestController
@RequestMapping("/accounts")
public class AccountController {
	@Autowired
	private AccountServiceImpl accountImpl;

	@Autowired
	AuthenticationManager authManager;
	@Autowired
	JwtTokenUtil jwtUtil;

	@PostMapping("/login")
	public DataResponse login(@RequestBody @Valid AccountDto accountDto) {
			Authentication authentication = authManager.authenticate(
					new UsernamePasswordAuthenticationToken(
							accountDto.getUsername(), accountDto.getPassword())
			);
			
			Account account = (Account) authentication.getPrincipal();
			String accessToken = jwtUtil.generateAccessToken(account);
			AccountTokenResponse response = new AccountTokenResponse(account.getUsername(), accessToken);
			
			return new DataResponse(response);
			
		
	}

	@GetMapping()
	public DataResponse getAccount() {
		return new DataResponse(accountImpl.getAllAccount());
	}

	@GetMapping("/{id}")
	public DataResponse getAccount(@PathVariable(value = "id") Integer id) {
		return new DataResponse(accountImpl.getAccount(id));
	}

	@PostMapping()
	public DataResponse addAccount(@RequestBody AccountDto accountDto) {
		return new DataResponse(accountImpl.addAccount(accountDto));
	}

	@DeleteMapping("/{id}")
	public void deleteAccount(@PathVariable(value = "id") Integer id) {
		accountImpl.deleteAccount(id);
	}

	@PutMapping("/{id}")
	public DataResponse updateAccount(@PathVariable(value = "id") Integer id, @RequestBody AccountDto accountDto) {
		return new DataResponse(accountImpl.updateAccount(id, accountDto));
	}

}
