package com.bridgelabz.accountmanagementsystem;

import java.util.Scanner;

class AccountManagementMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		AccountManagement accountManagement=new AccountManagement("", "", "", "", "", "", "");
		System.out.println("Enter the Bank IFSC Code: ");
		String ifscCode=sc.nextLine();
		System.out.println("Enter the Bank Name: ");
		String branchName=sc.nextLine();
		System.out.println("Enter the branch Code: ");
		String branchCode=sc.nextLine();
		System.out.println("Enter the Account Holder Name: ");
		String name=sc.nextLine();
		System.out.println("Enter the Account Holder DOB: ");
		String dob=sc.nextLine();
		System.out.println("Enter Account Holder Mobile Number: ");
		String mobileNumber=sc.nextLine();
		System.out.println("Enter Account Holder Email: ");
		String email=sc.nextLine();
		
		accountManagement.addAccountDetails(ifscCode,branchName,branchCode,name, dob, mobileNumber, email);
		accountManagement.displayAccountDetails();
		sc.close();
	}
}
