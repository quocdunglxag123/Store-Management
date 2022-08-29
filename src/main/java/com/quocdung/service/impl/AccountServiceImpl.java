package com.quocdung.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.quocdung.dto.AccountDto;
import com.quocdung.dto.AccountNoPassDto;
import com.quocdung.entity.Account;
import com.quocdung.entity.Role;
import com.quocdung.exception.AccountException;
import com.quocdung.mapstruct.AccountMapper;
import com.quocdung.repository.AccountRepository;
import com.quocdung.service.AccountService;


@Service
@Transactional
public class AccountServiceImpl implements AccountService {

	// Account
	@Autowired private PasswordEncoder passwordEncoder;
	
	@Autowired
	private AccountRepository accountRepo;
	@Autowired
	private AccountMapper accountMapper;

	@Autowired
	public AccountServiceImpl(AccountMapper accountMapper, AccountRepository accountRepo) {
		this.accountMapper = accountMapper;
		this.accountRepo = accountRepo;
	}

	@Override
	public Object getAccount(Integer id) {
		Account account = accountRepo.findOneById(id);
		if(account==null)
		    throw new AccountException(id);
		Set<String> rolenames = new HashSet<String>();
		for (Role element : account.getRoles()) {
			rolenames.add(element.getName());
		}
		AccountNoPassDto accountNoPassDto = accountMapper.accountToAccountNoPassDto(account);
		accountNoPassDto.setRole(rolenames);
		return accountNoPassDto;
	}

	@Override
	public Object addAccount(AccountDto accountDto) {
		Account account = accountMapper.accountDtoToAccount(accountDto);
		String rawPassword = account.getPassword();
		String encodedPassword = passwordEncoder.encode(rawPassword);
		account.setPassword(encodedPassword);
		accountRepo.save(account);
		return accountDto;
	}

	@Override
	public void deleteAccount(Integer id) {
		accountRepo.delete(accountRepo.findOneById(id));
	}

	@Override
	public Object updateAccount(Integer id, AccountDto accountDto) {
		Account accountNew = accountMapper.accountDtoToAccount(accountDto);
		Account accountOld = accountRepo.findOneById(id);
		String rawPassword = accountNew.getPassword();
		String encodedPassword = passwordEncoder.encode(rawPassword);
		accountOld.setPassword(encodedPassword);
		return accountRepo.save(accountOld);
	}

	@Override
	public Object getAllAccount() {
		List<Account> accounts = new ArrayList<>();
		accountRepo.findAll().forEach(accounts::add);
		List<AccountNoPassDto> accountNoPassDto = accountMapper.accountsToAccountNoPassDtos(accounts);
		for (AccountNoPassDto accountDto : accountNoPassDto) {
			Set<String> rolenames = new HashSet<String>();
			for (Account account : accounts) {
				if (accountDto.getUsername().equals(account.getUsername())) {
					for (Role element : account.getRoles()) {
						rolenames.add(element.getName());
					}
				}

			}
			accountDto.setRole(rolenames);
		}

		return accountNoPassDto;
	}

}
