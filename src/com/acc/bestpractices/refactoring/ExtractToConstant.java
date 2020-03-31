package com.acc.bestpractices.refactoring;

public class ExtractToConstant {
	
	/*
	 * Extracts vars to a constants
	 * Select the value, then right click + refactor + extract Constant
	 */
	public void connectToMySQL() {
		String dbURL = "http://aws.amazon.com/mydb";
		String port = "3306";
		
		Object connection = getConnection(dbURL, port);
	}

	private Object getConnection(String dbURL, String port) {
		return null;
	}

	
}
