package com.bridgelabz.accountmanagementsystem;

class Bank {

	private String bankIFSCCode;
	private String branchName;
	private String branchCode;
	
	public Bank(String bankIFSCCode,String branchName, String branchCode) {
		this.bankIFSCCode=bankIFSCCode;
		this.branchName=branchName;
		this.branchCode=branchCode;
	}

	public String getBankIFSCCode() {
		return bankIFSCCode;
	}

	public void setBankIFSCCode(String bankIFSCCode) {
		this.bankIFSCCode = bankIFSCCode;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	
	
}

