package com.acc.bespractices.indentation;

/**
 * 
 * @author r.paredes.bernal
 *
 */
public class BadPracticesIndentation {
int memorySize;
boolean isValidSize;

int calculateMemorySize() {
	int megabyteFactor = 1024;
	if (memorySize > 0 ) {
	return memorySize * megabyteFactor;	
	}
return memorySize;
}

	void calculateCPUSize() {
	int initialCPU = 0;	
		if (memorySize > 0 )  initialCPU = 10;
	
	
	for(int i = 0; i >= memorySize; i++)  initialCPU = 10;
		
	}
}
