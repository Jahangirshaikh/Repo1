package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lti.beans.ApplicationStatus;
import com.lti.services.LoanTrackerService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/loanTrackerController")
public class LoanTrackerController {

	@Autowired
	public LoanTrackerService loanTrackerService;

	@PostMapping("/track")
	public ApplicationStatus track(@RequestBody ApplicationStatus applicationstatus) {
		return loanTrackerService.trackLoan(applicationstatus.getApplicationid());

	}

}
