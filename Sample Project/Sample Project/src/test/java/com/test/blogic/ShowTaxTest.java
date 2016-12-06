package com.test.blogic;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import  static org.mockito.Mockito.*;

public class ShowTaxTest {

	ShowTax showTax;
	
	@Before
	public void init(){
		//Mock Frame is created interface object
		CalculateTax calculateTax = mock(CalculateTax.class);
		
		when(calculateTax.getSalesTax("MN", 1000)).thenReturn(100);
		
		when(calculateTax.getStateIncomeTax("MN", 1000)).thenReturn(300);
		
		showTax = new ShowTax(calculateTax);
	}
	
	@Test
	public void testprintSalesTax(){
		assertEquals(100, showTax.printSalesTax("MN", 1000));
		/*Assert.assertEquals(85, showTax.printSalesTax("NJ", 1000));
		Assert.assertEquals(75, showTax.printSalesTax("AZ", 1000));*/
	}
	
	@Test
	public void testPrintIncomeTax(){
		assertEquals(300, showTax.printIncomeTax("MN", 1000));
		
		/*Assert.assertEquals(200, showTax.printIncomeTax("NJ", 1000));
		Assert.assertEquals(20, showTax.printIncomeTax("AZ", 1000));*/
	}
}
