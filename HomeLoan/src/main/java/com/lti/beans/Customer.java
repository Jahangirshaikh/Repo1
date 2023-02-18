package com.lti.beans;

import javax.persistence.CascadeType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Customers")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stuSeqGen")
	@SequenceGenerator(name = "stuSeqGen", sequenceName = "stuSeqDb", allocationSize = 1)
	@Column(name = "Customers_Id")
	private int custId;

	@Column(name = "Customers_FName", length = 15)
	private String custFirstName;

	@Column(name = "Customers_LName", length = 15)
	private String custLastName;

	@Column(name = "Customers_MName", length = 15)
	private String custMiddleName;

	@Column(name = "Customers_Email", length = 50, unique = true)
	private String custEmail;

	@Column(name = "Customers_Password", length = 15)
	private String custPassword;

	public Customer() {
		super();
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custFirstName=" + custFirstName + ", custLastName=" + custLastName
				+ ", custMiddleName=" + custMiddleName + ", custEmail=" + custEmail + ", custPassword=" + custPassword
				+ "]";
	}

	public Customer(int custId, String custFirstName, String custLastName, String custMiddleName, String custEmail,
			String custPassword, PersonalDetail persondetail) {
		super();
		this.custId = custId;
		this.custFirstName = custFirstName;
		this.custLastName = custLastName;
		this.custMiddleName = custMiddleName;
		this.custEmail = custEmail;
		this.custPassword = custPassword;

	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustFirstName() {
		return custFirstName;
	}

	public void setCustFirstName(String custFirstName) {
		this.custFirstName = custFirstName;
	}

	public String getCustLastName() {
		return custLastName;
	}

	public void setCustLastName(String custLastName) {
		this.custLastName = custLastName;
	}

	public String getCustMiddleName() {
		return custMiddleName;
	}

	public void setCustMiddleName(String custMiddleName) {
		this.custMiddleName = custMiddleName;
	}

	public String getCustEmail() {
		return custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	public String getCustPassword() {
		return custPassword;
	}

	public void setCustPassword(String custPassword) {
		this.custPassword = custPassword;
	}

}
