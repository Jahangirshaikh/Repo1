package com.lti.dao;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.beans.ApplicationStatus;


@Repository("loanTrackerDao")
public class LoanTrackerDaoImpl implements LoanTrackerDao {

	@PersistenceContext
	EntityManager em;
	
	@Transactional
	public ApplicationStatus trackLoan(String applicationId) {
		Query query = em.createQuery("select a from ApplicationStatus a where a.applicationid=:appid");
		query.setParameter("appid", applicationId);
		ApplicationStatus applicationStatus = (ApplicationStatus)query.getSingleResult();
		return applicationStatus;
	}

	
}
