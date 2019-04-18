package com.in28minutes.learning.maven.maven_in_few_steps;

public class Bank {

	private String bankName;
	private String branch;
	
	
	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public void addBranch()
	{
	 System.out.println("This is the addBranch ");
	}
	
	public void removeBranch()
	{
	 System.out.println("This is the removeBranch ");
	}
	
	}

 




