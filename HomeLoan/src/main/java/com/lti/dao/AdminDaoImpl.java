package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.beans.Admin;
import com.lti.beans.PersonalDetail;
import com.lti.beans.Customer;

@Repository("adminDao")
public class AdminDaoImpl implements AdminDao {

	@PersistenceContext
	EntityManager em;

	public boolean adminLogin(Admin admin) {

		boolean flag = false;

		Admin a = null;
		try {

			String username = admin.getUserName();
			String password = admin.getPassword();

			a = (Admin) em.createQuery("select a from Admin a where a.username=:username")
					.setParameter("username", username).getSingleResult();

			if ((a.getUserName().equals(username)) && (a.getPassword().equals(password))) {

				flag = true;
			} else
				flag = false;

		} catch (Exception e) {
			System.out.println("Error:" + e);

		}
		return flag;
	}

	@Override
	@Transactional
	public boolean addAdmin(Admin admin) {

		System.out.println(admin);
		boolean flag = false;
		try {

			em.persist(admin);

			System.out.println("end");
			flag = true;
		} catch (Exception e) {
			System.out.println("Error:" + e);
		}
		return flag;
	}

	public List<PersonalDetail> viewPendingApprovals() {

		Query query = em.createQuery("Select l.appid from loantracker l where status is pending");
		return null;

	}

	@Override
	public List<Customer> getAllCustomer() {
		Query query = em.createQuery("Select c from Customer c");
		List<Customer> cList = query.getResultList();
		return cList;
	}

	@Override
	public boolean getCustById(int cid) {

		boolean flag = false;

		try {
			Customer cust = em.find(Customer.class, cid);
			if (cust.getCustId() == cid) {
				flag = true;
			}
		} catch (Exception e) {
			System.out.println("Error" + e);
		}
		return flag;
	}

}
