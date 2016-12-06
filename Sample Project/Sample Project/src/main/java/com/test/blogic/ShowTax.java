package com.test.blogic;

public class ShowTax {
	
	private CalculateTax calculateTax;
	
	public ShowTax(CalculateTax calculateTax){
		this.calculateTax = calculateTax; 
	}
	
	public int printSalesTax(String state,int amount){
		return calculateTax.getSalesTax(state, amount);
	}
	
	public int printIncomeTax(String state,int income){
		return calculateTax.getStateIncomeTax(state, income);
	}

}
