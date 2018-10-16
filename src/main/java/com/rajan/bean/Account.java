package com.rajan.bean;

public class Account{
	
	int id;
	String firstName;
	String secondName;	
	long accountNumber;;
	
	public Account() {
		super();
	}
	public Account(int i, String firstName, String secondName, long accountNumber) {
		super();
		this.id = i;
		this.firstName = firstName;
		this.secondName=secondName;
		this.accountNumber = accountNumber;
	}
	public int getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}