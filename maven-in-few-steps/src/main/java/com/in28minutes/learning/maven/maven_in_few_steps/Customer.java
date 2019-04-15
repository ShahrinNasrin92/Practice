package com.in28minutes.learning.maven.maven_in_few_steps;

public class Customer extends Bank {
	
    private String customerID;
    private String customerName;
    private int amount;
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
    
	public int deposit(int depositAmount)
	{
		amount=1000+depositAmount;
		return amount;
		
	}
	
	public void withdraw()
	{
		amount=1000-500;
		System.out.println(amount);
	}
	
  
}



