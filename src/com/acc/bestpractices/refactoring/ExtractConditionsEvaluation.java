package com.acc.bestpractices.refactoring;

public class ExtractConditionsEvaluation {
	String creditCard;
	String expirationDate;
	String securityNumber;
	
	/*
	 * Extract the if condition to a boolean method and replace it
	 * as parameter. 
	 * 
	 */
	public void validateForm(){
		if (creditCard.length() == 16 && expirationDate.length() == 4 && 
				securityNumber.length() == 2) {
			// do something
		} else {
			// do something else
		}
	} 
	
}
