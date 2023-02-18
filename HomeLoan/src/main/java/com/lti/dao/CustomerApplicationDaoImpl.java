package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

import com.lti.beans.PersonalDetail;
import com.lti.beans.ApplicationStatus;

import com.lti.beans.IncomeDetail;
import com.lti.beans.Loan;
import com.lti.beans.Property;
import com.lti.beans.Customer;

@Repository("homeLoanDao")
public class CustomerApplicationDaoImpl implements CustomerApplicationDao {

	@PersistenceContext
	EntityManager em;

	@Transactional
	public boolean registerUser(Customer users) {

		boolean flag = false;
		try {

			em.persist(users);

			System.out.println("end");
			flag = true;
		} catch (Exception e) {
			System.out.println("Error:" + e);
		}
		return flag;
	}

	@Transactional
	public Customer loginProcess(Customer users) {

		boolean flag = false;
		Customer u = null;
		try {

			String emailid = users.getCustEmail();
			String password = users.getCustPassword();
			u = (Customer) em.createQuery("select u from Customer u where  u.custEmail=:emailid")
					.setParameter("emailid", emailid).getSingleResult();
			if ((u.getCustEmail().equals(emailid)) && (u.getCustPassword().equals(password))) {

				flag = true;
			} else
				flag = false;

		} catch (Exception e) {
			System.out.println("Error:" + e);
		}
		if (flag == true) {
			return u;
		} else {
			return null;
		}

	}

	@Override
	public Customer showMyDetails(int custId) {
		System.out.println("My Details");
		Customer show = em.find(Customer.class, custId);

		return show;
	}

	@Transactional
	public boolean addPersonalDetail(PersonalDetail applicant) {
		System.out.println(applicant);
		boolean flag = false;
		try {

			em.persist(applicant);

			System.out.println("Done");
			flag = true;
		} catch (Exception e) {
			System.out.println("Error:" + e);
		}
		return flag;
	}

	@Transactional
	public boolean addIncomeDetails(IncomeDetail income) {

		boolean flag = false;
		try {

			em.persist(income);

			System.out.println("end");
			flag = true;
		} catch (Exception e) {
			System.out.println("Error:" + e);
		}
		return flag;
	}

	public boolean addPropertyInfo(Property property) {
		boolean flag = false;
		try {

			em.persist(property);

			System.out.println("end");
			flag = true;
		} catch (Exception e) {
			System.out.println("Error:" + e);
		}
		return flag;
	}

	public boolean addLoanInfo(Loan loan) {
		boolean flag = false;
		try {

			em.persist(loan);

			System.out.println("end");
			flag = true;
		} catch (Exception e) {
			System.out.println("Error:" + e);
		}
		return flag;
	}

	public boolean addApplicationStatus(ApplicationStatus applicationStatus) {

		boolean flag = false;
		try {

			em.persist(applicationStatus);

			System.out.println("end");
			flag = true;
		} catch (Exception e) {
			System.out.println("Error:" + e);
		}
		return flag;
	}

}
