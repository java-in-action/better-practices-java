package com.acc.bestpractices.refactoring;

public class ExtractToConstant2 {
	// Use prefixes for identifying groups of constants
	private static final String DB_URL = "http://aws.amazon.com/mydb";
	private static final String DB_PORT = "3306";

	/*
	 * Extract the variales to constants and then to a 
	 * Constant Class
	 */
	public void connectToMySQL() {
		Object connection = getConnection(DB_URL, DB_URL);
	}

	private Object getConnection(String dbURL, String port) {
		return null;
	}
}
