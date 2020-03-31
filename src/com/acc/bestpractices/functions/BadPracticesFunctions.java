package com.acc.bestpractices.functions;

public class BadPracticesFunctions {
	boolean isUserLogged;
	
	double calculateCircleArea() {
		if (!isUserLogged) {
			return 0;
		}
		
		double piFactor = 3.1416;
		int radio = 0;
		
		return piFactor * (radio *2); 
	}
	
	
	public void save(long id, String name, String adress) {
		
	}
	
}
