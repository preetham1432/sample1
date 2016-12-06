package com.test.blogic;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest  extends TestCase{
	Calculator calculator =null;
	
	//@Before
	public void setUp(){
		System.out.println(" Test init () ...");
		calculator = new Calculator();
	}
	
	//@Test
	public void testAdd(){
		Assert.assertEquals(8, calculator.add(3,5));
	}
	
	//@Test
	public void testGetInterest(){
		Assert.assertEquals(new Double(40), calculator.getIntrest(1000, 2, 2));
	}
	
	//@After
	public void tearDown(){
		System.out.println(" Test Destory /  () ...");
	}

}
