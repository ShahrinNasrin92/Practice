package com.in28minutes.learning.maven.maven_in_few_steps;

abstract class Account {

	abstract int debit(int depositAmount);
	abstract int credit();
	void label() {
		System.out.println("Abstract Info:");
	}
	
}
