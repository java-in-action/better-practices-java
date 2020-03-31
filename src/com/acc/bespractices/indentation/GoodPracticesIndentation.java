package com.acc.bespractices.indentation;

/**
 * A good indentation makes your code more readable and understandable
 * 
 * @author r.paredes.bernal
 *
 *         Tip 1: Use hot keys in your ID, if you are using eclipse you can use:
 *         Ctrl + Shift + F
 *         
 *         Tip 2: Edit or improve the formatter as you wish,
 *         Menu: Window > Preferences > Java > Code Style > Formatter
 */
public class GoodPracticesIndentation {
	int memorySize;
	boolean isValidSize;

	int calculateSizeOfMemory() {
		int megabyteFactor = 1024;
		int totalSizeOfMemory = 0;

		if ( memorySize > 0 ) {
			totalSizeOfMemory = memorySize * megabyteFactor;
		}
		return totalSizeOfMemory;
	}
	
	/**
	 * Add curly braces {} to the loops or conditions
	 * 
	 */
	void calculateCPUSize() {
		int initialCPU = 0;	
		if ( memorySize > 0 )  {
			initialCPU = 10;
		}
		
		for(int i = 0; i >= memorySize; i++)  {
			initialCPU = 10;
		}
		
	}
	
}
