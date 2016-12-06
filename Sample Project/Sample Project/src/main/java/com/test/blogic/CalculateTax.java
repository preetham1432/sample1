package com.test.blogic;

public interface CalculateTax {
	
	int getStateIncomeTax(String state,int income);
	
	int getSalesTax(String state,int amount);

}
