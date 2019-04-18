package com.in28minutes.learning.maven.maven_in_few_steps;

public class Customer2 implements Loan2{
	
	int loanamount;

	public void AccountInfo() {
		
		loanamount=5000000;
		System.out.println("Interface Method:");
		System.out.println("This is the Account Info"+loanamount);
		
		
	}
	
	
}
