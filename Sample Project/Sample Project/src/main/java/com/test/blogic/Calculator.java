package com.test.blogic;

public class Calculator {
	
	public int add(int a,int b){
		return a+b;
	}
	
	public Double getIntrest(int amount,int rate,int months){
		return new Double((amount*rate*months)/100);
	}

}
