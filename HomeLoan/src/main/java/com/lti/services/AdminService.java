package com.lti.services;

import java.util.List;

import com.lti.beans.Admin;
import com.lti.beans.PersonalDetail;
import com.lti.beans.Customer;



public interface AdminService {

	public boolean adminLogin(Admin admin);
	public boolean addAdmin(Admin admin);
	public List<PersonalDetail> viewPendingApprovals();
	public List<Customer> getAllCustomer();
	public boolean getCustById(int cid);
}
