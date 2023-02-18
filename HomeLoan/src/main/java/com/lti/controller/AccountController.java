package com.lti.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.beans.LoanAccount;
import com.lti.services.AccountService;

@CrossOrigin(origins = "*")
@RequestMapping("/account")
@RestController
public class AccountController {

	@Autowired
	public AccountService accountService;

	// http://localhost:8181/
	@PostMapping("/accountcheck")
	public LoanAccount checkAccount(@RequestBody LoanAccount loanaccount) {
		int accntNo = loanaccount.getAccno();

		return accountService.trackAccount(accntNo);

	}

}
