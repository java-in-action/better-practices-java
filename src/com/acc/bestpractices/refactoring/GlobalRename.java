package com.acc.bestpractices.refactoring;

/*
 * Try to rename the variable name
 */
public class GlobalRename {
	// Select the var, then right click + refactor + rename
	// or 
	// Alt + Shift + R
	private String name;
	
	public void RefactoringRenaming() {
		this.name = "";
	}
	
	public void saveUser() {
		if (!this.name.equals("")) {
		}
	}
	
	public void deleteUser() {
		if (this.name.substring(0,3).equals("del-")) {
		}
	}
}
