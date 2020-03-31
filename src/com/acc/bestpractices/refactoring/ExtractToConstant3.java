package com.acc.bestpractices.refactoring;

//import static com.acc.bestpractices.refactoring.ConstantsUtil.*;

public class ExtractToConstant3 {

	/*
	 * Extract the variables to constants and then to a 
	 * Constant Class
	 */
	public void connectToMySQL() {
		// Use static imports to avoid the static reference
		Object connection = getConnection(ConstantsUtil.DB_URL, ConstantsUtil.DB_URL);
	}

	private Object getConnection(String dbURL, String port) {
		return null;
	}
}
