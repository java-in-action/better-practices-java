package com.acc.bestpractices.functions;

import java.util.List;

/**
 * Functions or methods should do one thing. 
 * They should do it well, they should do it only
 * @author r.paredes.bernal
 *
 */
public class GoodPracticesFunctions {
	
	/**
	 * A method should do a single unit of work. 
	 * This practice is very useful for unit testing, 
	 * increase the maintainability and readability
	 * 
	 * 
	 * @return
	 */
	double calculateCircleArea() {		
		double piFactor = 3.1416;
		int radio = 0;		
		return piFactor * (radio *2); 
	}
	
	/* A method must have one or two parameters, even 3 
	 * if there is valid reason. More than that is a bad practice
	 */
	
	/**
	 * Pass a bean as argument increases the maintainability
	 * and reduce the number of parameters 
	 * @param user
	 */
	void saveUser(User user) {
		
	}
	
	/*
	 * You can use lists, arrays, varargs or enums. for many variables.
	 * This just applies for same type of parameters or generic types
	 */
	void saveList(List<String> list) {
		
	}
	
	void saveArray(String[] arrayString) {
		
	}
	
	void saveVariableArguments(String ... infiniteParameter) {
		
	}
	

}
