package com.lti.beans;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="LOANS")
public class Loan {

	@Id
	@Column(name="LOANID")
	private int loanId;
	
	@Column(name="LOANAMOUNT",length=30)
	private double loanAmount;
	
	@Column(name="TENURE",length=30)
	private int tenure;
	
	@Column(name="downPayment",length=30)
	private double downPayment;
	
	@Column(name="DOWNPAYMENTPCT",length=30)
	private double downPaymentPct;
	
	@Column(name="EMIAMOUNT",length=30)
	private double emiAmount;
	
	@OneToOne
	@JoinColumn(name="Customers_Id")
	private Customer customer;

	public Loan(int loanId, double loanAmount, int tenure, double downPayment, double downPaymentPct, double emiAmount,
			Customer user) {
		super();
		this.loanId = loanId;
		this.loanAmount = loanAmount;
		this.tenure = tenure;
		this.downPayment = downPayment;
		this.downPaymentPct = downPaymentPct;
		this.emiAmount = emiAmount;
		this.customer = user;
	}

	public Loan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getLoanId() {
		return loanId;
	}

	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public double getDownPayment() {
		return downPayment;
	}

	public void setDownPayment(double downPayment) {
		this.downPayment = downPayment;
	}

	public double getDownPaymentPct() {
		return downPaymentPct;
	}

	public void setDownPaymentPct(double downPaymentPct) {
		this.downPaymentPct = downPaymentPct;
	}

	public double getEmiAmount() {
		return emiAmount;
	}

	public void setEmiAmount(double emiAmount) {
		this.emiAmount = emiAmount;
	}

	public Customer getUser() {
		return customer;
	}

	public void setUser(Customer user) {
		this.customer = user;
	}

	@Override
	public String toString() {
		return "Loan [loanId=" + loanId + ", loanAmount=" + loanAmount + ", tenure=" + tenure + ", downPayment="
				+ downPayment + ", downPaymentPct=" + downPaymentPct + ", emiAmount=" + emiAmount + ", user=" + customer
				+ "]";
	}




	
	
}