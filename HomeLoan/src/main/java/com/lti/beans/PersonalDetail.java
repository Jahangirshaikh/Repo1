package com.lti.beans;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;



@Entity
@Table(name="PERSONALDETAILS")
public class PersonalDetail {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="stuSeqGen")
	@SequenceGenerator(name="stuSeqGen",sequenceName="personalSeqa",allocationSize=1)
	@Column(name="APPLICANTID")
	private int applicantId;
	
	@Column(name="PHONE",length=10)
	private String phone;
	
	@Column(name="DOB", length = 15)
	private String dob;
	
	@Column(name="GENDER",length=15)
	private String gender;
	
	@Column(name="NATIONALITY",length=15)
	private String nationality;
	
	@Column(name="AADHARNO",length=12)
	private String aadharNo;
	
	@Column(name="PANNO",length=10)
	private String panNo;
	
	@OneToOne
	@Column(name="Customer_Id")
	private Customer customer;

	public PersonalDetail(int applicantId, String phone, String dob, String gender, String nationality, String aadharNo,
			String panNo, Customer user) {
		super();
		this.applicantId = applicantId;
		this.phone = phone;
		this.dob = dob;
		this.gender = gender;
		this.nationality = nationality;
		this.aadharNo = aadharNo;
		this.panNo = panNo;
		this.customer = user;
	}

	public PersonalDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
	}

	public String getPhone() {
		return phone;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public Customer getUser() {
		return customer;
	}

	public void setUser(Customer user) {
		this.customer = user;
	}

	@Override
	public String toString() {
		return "Applicants [applicantId=" + applicantId + ", phone=" + phone + ", dob=" + dob + ", gender=" + gender
				+ ", nationality=" + nationality + ", aadharNo=" + aadharNo + ", panNo=" + panNo + ", user=" + customer
				+ "]";
	}
  


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

	
	
}
