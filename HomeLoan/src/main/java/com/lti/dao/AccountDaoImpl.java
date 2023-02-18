package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.beans.LoanAccount;

@Repository("accountdao")
public class AccountDaoImpl implements AccountDao {

	@PersistenceContext
	EntityManager em;

	public LoanAccount trackAccount(int accNo) {
		Query query = em.createQuery("SELECT a.balance FROM LoanAccount a where a.accNo=:accNo");
		query.setParameter("accNo", accNo);
		LoanAccount loanaccount = (LoanAccount) query.getSingleResult();
		return loanaccount;
	}

	@Override
	@Transactional
	public void addAccount(LoanAccount loanaccount) { // accountdaoimpl
		em.persist(loanaccount);
	}

}
