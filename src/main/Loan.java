package com.in28minutes.learning.maven.maven_in_few_steps;

 class Loan extends Account {
	 private int  amount;

	@Override
	int debit(int depositAmount) {
		amount=1000+depositAmount;
		return amount;
		
	}

	@Override
	int credit() {
		amount=1000-500;
		return amount;
		
	}
	

}
 