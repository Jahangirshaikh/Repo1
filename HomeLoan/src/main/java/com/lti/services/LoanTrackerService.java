package com.lti.services;

import com.lti.beans.ApplicationStatus;

public interface LoanTrackerService {

	public ApplicationStatus trackLoan(String applicationId);
}
