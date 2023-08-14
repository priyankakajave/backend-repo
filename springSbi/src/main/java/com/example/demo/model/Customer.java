package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Email;

@Entity
@Table(name = "user")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long CustomerID;
	
	@NotBlank(message = "Name is mandatory")
	@Column(name="FirstName")
	private String FirstName;
	
	@NotBlank(message = "Name is mandatory")
	@Column(name="LastName")
	private String LastName;
	
	@NotBlank(message = "Name is mandatory")
	@Column(name="Password")
	private String Password;
	
	@Column(name="Address")
	private String Address;
	
	@NotBlank(message = "Name is mandatory")
	@Column(name="DOB")
	private int DOB;
	
	@NotBlank(message = "Name is mandatory")
	@Column(name="ContactNo")
	private String ContactNo;
	
	@Email(message = "Email is not valid", regexp="{(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])}")
	@Column(name="Email")
	private String Email;
	
	//Default constructor
	public Customer() {
		
	}
	
	//Parameterised
	

	public long getCustomerID() {
		return CustomerID;
	}

	public Customer(String firstName, String lastName, String password, String address, int dOB, String contactNo,
			String email) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Password = password;
		Address = address;
		DOB = dOB;
		ContactNo = contactNo;
		Email = email;
	}

	public void setCustomerID(long customerID) {
		CustomerID = customerID;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getDOB() {
		return DOB;
	}

	public void setDOB(int dOB) {
		DOB = dOB;
	}

	public String getContactNo() {
		return ContactNo;
	}

	public void setContactNo(String contactNo) {
		ContactNo = contactNo;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}
	
	//getter-setter
}
