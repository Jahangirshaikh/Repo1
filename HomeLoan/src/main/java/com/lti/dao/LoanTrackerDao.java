package com.lti.dao;

import com.lti.beans.ApplicationStatus;

public interface LoanTrackerDao {

	public ApplicationStatus trackLoan(String applicationId);
}
