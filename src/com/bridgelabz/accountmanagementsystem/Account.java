package com.bridgelabz.accountmanagementsystem;

class Account extends Bank{
	private String accountHolderName;
	private String accountHolderDOB;
	private String accountHolderMobileNumber;
	private String accountHolderEmail;
	
	public Account(String bankIFSCCode, String branchName, String branchCode,String accountHolderName,String accountHolderDOB, String accountHolderMobileNumber,String accountHolderEmail) {
		super(bankIFSCCode, branchName, branchCode);
		this.accountHolderName=accountHolderName;
		this.accountHolderDOB=accountHolderDOB;
		this.accountHolderMobileNumber=accountHolderMobileNumber;
		this.accountHolderEmail=accountHolderEmail;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAccountHolderDOB() {
		return accountHolderDOB;
	}

	public void setAccountHolderDOB(String accountHolderDOB) {
		this.accountHolderDOB = accountHolderDOB;
	}

	public String getAccountHolderMobileNumber() {
		return accountHolderMobileNumber;
	}

	public void setAccountHolderMobileNumber(String accountHolderMobileNumber) {
		this.accountHolderMobileNumber = accountHolderMobileNumber;
	}

	public String getAccountHolderEmail() {
		return accountHolderEmail;
	}

	public void setAccountHolderEmail(String accountHolderEmail) {
		this.accountHolderEmail = accountHolderEmail;
	}
	
	
}
