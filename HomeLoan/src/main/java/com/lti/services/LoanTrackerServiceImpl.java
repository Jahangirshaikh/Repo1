package com.lti.services;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.ApplicationStatus;
import com.lti.dao.LoanTrackerDao;


@Service("loanTrackerService")
public class LoanTrackerServiceImpl implements LoanTrackerService {
	
	@Autowired
	public LoanTrackerDao loanTrackerDao;

	@Transactional
	public ApplicationStatus trackLoan(String applicationId) {
		
		return loanTrackerDao.trackLoan(applicationId);
	}

	
}
