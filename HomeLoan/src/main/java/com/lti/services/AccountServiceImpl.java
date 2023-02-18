package com.lti.services;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.LoanAccount;
import com.lti.dao.AccountDao;



@Service("accountservice")
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	public AccountDao accountDao;

	@Transactional
	public LoanAccount trackAccount(int accNo) {
		
	    return accountDao.trackAccount(accNo);
	}

	@Override

	public void addAccount(LoanAccount loanAccount) {  //accountserviceimpl
		// TODO Auto-generated method stub
		accountDao.addAccount(loanAccount);
	}
}
