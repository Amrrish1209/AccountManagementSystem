package com.bridgelabz.accountmanagementsystem;

class AccountManagement extends Account{

	public AccountManagement(String bankIFSCCode, String branchName, String branchCode, String accountHolderName,
			String accountHolderDOB, String accountHolderMobileNumber, String accountHolderEmail) {
		super(bankIFSCCode, branchName, branchCode, accountHolderName, accountHolderDOB, accountHolderMobileNumber,
				accountHolderEmail);
	}

	public void addAccountDetails(String ifscCode,String branchName,String branchCode,String name,String dob,String mobileNumber,String email) {
		setBankIFSCCode(ifscCode);
		setBranchName(branchName);
		setBranchCode(branchCode);
		setAccountHolderName(name);
		setAccountHolderDOB(dob);
		setAccountHolderMobileNumber(mobileNumber);
		setAccountHolderEmail(email);
	}
	
	public void displayAccountDetails() {
		System.out.println("Bank IFSC Code: "+getBankIFSCCode());
		System.out.println("Branch Name: "+getBranchName());
		System.out.println("Branch Code: "+getBranchCode());
		System.out.println("Account Holder Name: "+getAccountHolderName());
		System.out.println("Account Holder DOB: "+getAccountHolderDOB());
		System.out.println("Account Holder Mobile Number: "+getAccountHolderMobileNumber());
		System.out.println("Account Holder Email: "+getAccountHolderEmail());
	}
}
