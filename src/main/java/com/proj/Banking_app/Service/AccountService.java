package com.proj.Banking_app.Service;



import java.util.List;

import com.proj.Banking_app.dto.AccountDto;

public interface AccountService {
	
	AccountDto createAccount(AccountDto account);

	AccountDto getAccountById(Long id);
	
	AccountDto deposit(Long id, double amount);
	
	AccountDto withdraw(Long id,double amount);
	
	List<AccountDto> getAllAccounts();
	
	void deleteAccount(Long id);
}
