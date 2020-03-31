package com.acc.bestpractices.naming;

/**
 * A good name should tell you,  
 * 1) Why it exists 2) What it does and 3) How it is used
 * 
 *  If name requires a comment, then is not good naming
 *   
 * @author r.paredes.bernal
 *
 */
public class GoodPracticesNaming {
	int elapsedTimeInDays;
	int daysSinceCreation;
	int daysSinceModification;
	final int DAY_OF_WEEK = 7;
	boolean isValidDay;
	
	public void applyChagesAfterServing() {
		
	}
	
	/**
	 * A good naming for a method should have a verb and 
	 * a relation with a noung or object
	 */
	void runMonthlyReport() {
		
	}
}

/*
 * Classes and objects should have a noun or noun phrase names.
 * A class should not be a verb
 */
class Runner {
	
}
