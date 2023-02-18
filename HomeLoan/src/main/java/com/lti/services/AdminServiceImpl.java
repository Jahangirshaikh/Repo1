package com.lti.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.Admin;
import com.lti.beans.PersonalDetail;
import com.lti.beans.Customer;
import com.lti.dao.AdminDao;

@Service("adminService")
public class AdminServiceImpl implements AdminService {

	@Autowired
	public AdminDao adminDao;

	@Transactional
	public boolean adminLogin(Admin admin) {

		return adminDao.adminLogin(admin);
	}

	@Override
	public boolean addAdmin(Admin admin) {

		return adminDao.addAdmin(admin);
	}

	@Transactional
	public List<PersonalDetail> viewPendingApprovals() {

		return adminDao.viewPendingApprovals();
	}

	@Override
	public List<Customer> getAllCustomer() {
		return adminDao.getAllCustomer();
	}

	@Override
	public boolean getCustById(int cid) {

		return adminDao.getCustById(cid);
	}

}
