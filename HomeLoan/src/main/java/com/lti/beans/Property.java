package com.lti.beans;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="PROPERTYS")
public class Property {

	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PROPERTYID")
	private int propertyId;
	
	@Column(name="PROPERTYNAME",length=30)
	private String propertyName;
	
	@Column(name="PROPERTYLOCATION",length=30)
	private String propertyLocation;
	
	@Column(name="AMOUNT",length=30)
	private double amount;
	
	@OneToOne
	@JoinColumn(name="Customers_Id")
	private Customer customer;

	public Property(int propertyId, String propertyName, String propertyLocation, double amount, Customer user) {
		super();
		this.propertyId = propertyId;
		this.propertyName = propertyName;
		this.propertyLocation = propertyLocation;
		this.amount = amount;
		this.customer = user;
	}

	public Property() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public String getPropertyLocation() {
		return propertyLocation;
	}

	public void setPropertyLocation(String propertyLocation) {
		this.propertyLocation = propertyLocation;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Customer getUser() {
		return customer;
	}

	public void setUser(Customer user) {
		this.customer = user;
	}

	@Override
	public String toString() {
		return "Property [propertyId=" + propertyId + ", propertyName=" + propertyName + ", propertyLocation="
				+ propertyLocation + ", amount=" + amount + ", user=" + customer + "]";
	}
	

}