package com.lti.services;

import com.lti.beans.LoanAccount;

public interface AccountService {
	
	 public LoanAccount trackAccount(int accNo);
	 public void addAccount(LoanAccount loanAccount);

}
