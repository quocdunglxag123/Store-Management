package com.quocdung.mapstruct;

import java.util.List;

import org.mapstruct.Mapper;

import com.quocdung.dto.AccountDto;
import com.quocdung.dto.AccountNoPassDto;
import com.quocdung.entity.Account;


@Mapper(componentModel = "spring")
public interface AccountMapper {
	// ----------------------------Entity To DTO---------------------------

	AccountDto accountToAccountDto(Account account);
	
	AccountNoPassDto accountToAccountNoPassDto(Account account);

	List<AccountDto> accountsToAccountDtos(List<Account> accounts);
	
	List<AccountNoPassDto> accountsToAccountNoPassDtos(List<Account> accounts);


	// ---------------------------DTO To Entity----------------------

	Account accountDtoToAccount(AccountDto accountDto);
	

}
