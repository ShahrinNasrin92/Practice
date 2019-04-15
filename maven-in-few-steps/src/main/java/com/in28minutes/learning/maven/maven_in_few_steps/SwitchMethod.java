package com.in28minutes.learning.maven.maven_in_few_steps;


import java.util.Scanner;

	public class SwitchMethod {  
    
	public static void main( String[] args )
    {
		
    	boolean a= false;
    	System.out.println("1. Inheritence");
		System.out.println("2. Abstract");
		System.out.println("3. Interface");
		System.out.println("0. Exit");
    	do
    	{
    		Scanner reader=new Scanner(System.in);
    		
    		
    		System.out.println("Enter the Method No:");
    	     int task=reader.nextInt();
    	     
    	     switch(task){    
    	        
    	        case 1:
    	        	Customer customer=new Customer(); //Inheritance
    	            customer.addBranch();
    	    	    System.out.println("Deposited Tk: "+customer.deposit(300));
    	    	    customer.withdraw();
    	        break; 
    	        
    	        case 2:
    	        	Account loan=new Loan(); //Abstract class
    	        	loan.label();
    	        	System.out.println("The debit ammount is:"+loan.debit(5000));
    	            System.out.println("The loan credit amount is:"+loan.credit());	
    	          
    	        break;  
    	        
    	        case 3: 
    	        	Customer2 loan2=new Customer2();//Interface
    	    	    loan2.AccountInfo();
    	        break;    
    	        
    	        case 0:
    	        	System.exit(0);
    	    	
    	        default:System.out.println("Invalid Method!");    
    	        }
    	}
    	while(a==false);
        
    	 
 }
	}

