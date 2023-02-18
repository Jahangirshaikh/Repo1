package com.lti.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.PersonalDetail;
import com.lti.beans.ApplicationStatus;

import com.lti.beans.IncomeDetail;
import com.lti.beans.Loan;
import com.lti.beans.Property;
import com.lti.beans.Customer;
import com.lti.dao.CustomerApplicationDao;

@Service("customerApplicationService")
public class CustomerApplicationServiceImpl implements CustomerApplicationService {

	@Autowired
	public CustomerApplicationDao dao;

	@Transactional
	public boolean registerUser(Customer users) {
		boolean register = dao.registerUser(users);
		return register;
	}

	@Override
	public Customer showMyDetails(int custId) {
		Customer show = dao.showMyDetails(custId);
		return show;
	}

	@Transactional
	public boolean addPersonalDetail(PersonalDetail applicant) {
		boolean addAI = dao.addPersonalDetail(applicant);
		return addAI;
	}

	@Transactional
	public boolean addIncomeDetails(IncomeDetail income) {
		boolean addID = dao.addIncomeDetails(income);
		return addID;
	}

	@Transactional
	public boolean addPropertyInfo(Property property) {
		boolean addPI = dao.addPropertyInfo(property);
		return addPI;
	}

	@Transactional
	public boolean addLoanInfo(Loan loan) {
		boolean addLI = dao.addLoanInfo(loan);
		return addLI;
	}

	@Transactional
	public boolean addApplicationStatus(ApplicationStatus applicationStatus) {
		boolean addAS = dao.addApplicationStatus(applicationStatus);
		return addAS;
	}

	public Customer loginProcess(Customer users) {

		return dao.loginProcess(users);
	}

}
