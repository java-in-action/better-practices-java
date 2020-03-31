package com.acc.bestpractices.refactoring;

import java.util.ArrayList;
import java.util.List;

import com.acc.bestpractices.functions.User;

public class ExtractToMethod {
	List<User> listUser = new ArrayList<User>();
	
	/*
	 * Select the code, then right click + refactor
	 * + extract method 
	 * Or 
	 * Alt + Shift + M
	 */
	public ExtractToMethod() {
		User emptyUser = new User();
		emptyUser.setId(0);
		emptyUser.setName("");
		emptyUser.setAdress("");
		
		// more logic
	}
}
