package com.rajan.controller;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rajan.bean.Account;
import com.rajan.service.AccountService;

@RestController
public class AccountController {

	AccountService accountService = new AccountService();

	@RequestMapping(value = "/rest/account/json", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Account> getAccounts() {
		List<Account> listOfAccounts = accountService.getAllAccounts();
		return listOfAccounts;
	}

	@RequestMapping(value = "/rest/account/json/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Account getAccountById(@PathVariable int id) {
		return accountService.getAccount(id);
	}

	@RequestMapping(value = "//rest/account/json/", method = RequestMethod.POST, headers = "Accept=application/json")
	public Account addAccount(@RequestBody Account account) {
		return accountService.addAccount(account);
	}

	@RequestMapping(value = "/rest/account/json/", method = RequestMethod.PUT, headers = "Accept=application/json")
	public Account updateAccount(@RequestBody Account account) {
		return accountService.updateAccount(account);

	}

	@RequestMapping(value = "/rest/account/json/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteAccount(@PathVariable("id") int id) {
		accountService.deleteAccount(id);

	}	
}
