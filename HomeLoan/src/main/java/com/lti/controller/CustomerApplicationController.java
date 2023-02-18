package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lti.beans.PersonalDetail;
import com.lti.beans.ApplicationStatus;
import com.lti.beans.IncomeDetail;
import com.lti.beans.Loan;
import com.lti.beans.Property;
import com.lti.beans.Customer;
import com.lti.services.CustomerApplicationService;

//              http://localhost:8181/customerapplication
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/customerapplication")
public class CustomerApplicationController {

	@Autowired
	public CustomerApplicationService caService;

	// http://localhost:8181/customerapplication/addcustomer
	@PostMapping("/addcustomer")
	public boolean registerUser(@RequestBody Customer user) {
		return caService.registerUser(user);
	}

	// http://localhost:8181/customerapplication/addpersonalinfo
	@PostMapping("/addpersonalinfo")
	public boolean addPersonalDetail(@RequestBody PersonalDetail applicant) {
		System.out.println("inside the controller" + applicant);
		return caService.addPersonalDetail(applicant);

	}

	// http://localhost:8181/customerapplication/addincome
	@PostMapping("/addincome")
	public boolean addIncomeDetails(@RequestBody IncomeDetail income) {
		return caService.addIncomeDetails(income);
	}

	// http://localhost:8181/customerapplication/addpropertydet
	@PostMapping("/addpropertydet")
	public boolean AddPropertyInfo(@RequestBody Property property) {
		return caService.addPropertyInfo(property);
	}

	// http://localhost:8181/customerapplication/addloandet
	@PostMapping("/addloandet")
	public boolean addLoanInfo(@RequestBody Loan loan) {
		return caService.addLoanInfo(loan);
	}

	// http://localhost:8181/customerapplication/addappstatus
	@PostMapping("/addappstatus")
	public boolean AddApplnStatus(@RequestBody ApplicationStatus applnStatus) {
		return caService.addApplicationStatus(applnStatus);
	}

	// http://localhost:8181/customerapplication/details/1004
	@GetMapping("/details/{cId}")
	public Customer showMyDetails(@PathVariable("cId") int custId) {
		return caService.showMyDetails(custId);
	}

//	http://localhost:8181/homeloanappln/userlogin
	@PostMapping("/userlogin")
	public Customer userlogin(@RequestBody Customer user) {
		System.out.println(caService.loginProcess(user));
		return caService.loginProcess(user);
	}

}