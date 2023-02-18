package com.lti.dao;


import java.util.List;

import com.lti.beans.Admin;
import com.lti.beans.PersonalDetail;
import com.lti.beans.Customer;



public interface AdminDao {

	public boolean adminLogin(Admin admin);// if there are parameters then it is a post,update and delete method otherwise it is a get  
	public boolean addAdmin(Admin admin);
	public List<PersonalDetail> viewPendingApprovals();
	public List<Customer> getAllCustomer();
	public boolean getCustById(int cid);
	
}
