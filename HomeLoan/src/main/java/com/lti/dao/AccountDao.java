package com.lti.dao;

import com.lti.beans.LoanAccount;

public interface AccountDao {
	
	public LoanAccount trackAccount(int accno);
	public void addAccount(LoanAccount loanaccount);
}
