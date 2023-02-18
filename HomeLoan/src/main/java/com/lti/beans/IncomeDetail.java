package com.lti.beans;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="INCOMESALARIEDS")
public class IncomeDetail {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="stuSeqGen")
	@SequenceGenerator(name="stuSeqGen",sequenceName="incomeSeq",allocationSize=1)
	@Column(name="SRNO")
	private int srNo;
	
	@Column(name="RETIREMENTAGE")
	private int retirementAge;
	
	@Column(name="MONTHLYSALARY",length=50)
	private double monthlySalary;
	
	@Column(name="ORGANIZATION",length=50)
	private String organization;
	
    
	@OneToOne
	@JoinColumn(name="Customers_Id")
	private Customer customer;
	
	

	public IncomeDetail() {
		super();
	}
	

	public IncomeDetail(int srNo, int retirementAge, double monthlySalary, String organization, Customer customer) {
		super();
		this.srNo = srNo;
		this.retirementAge = retirementAge;
		this.monthlySalary = monthlySalary;
		this.organization = organization;
		this.customer = customer;
	}


	public int getSrNo() {
		return srNo;
	}

	public void setSrNo(int srNo) {
		this.srNo = srNo;
	}

	public int getRetirementAge() {
		return retirementAge;
	}

	public void setRetirementAge(int retirementAge) {
		this.retirementAge = retirementAge;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public Customer getUser() {
		return customer;
	}

	public void setUser(Customer user) {
		this.customer = user;
	}

	@Override
	public String toString() {
		return "IncomeSalaried [srNo=" + srNo + ", retirementAge=" + retirementAge + ", monthlySalary=" + monthlySalary
				+ ", organization=" + organization + ", user=" + customer + "]";
	}

	


	
	
}
