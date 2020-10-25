package sef.moduleFinal.activity;

import junit.framework.TestCase;

public class SecondActivityTest extends TestCase {

	private SecondActivity theSecondActivity;
	
	//Setup and tear down
	public void setUp() throws Exception {
		super.setUp();
		// Initialize variables to be used here
		theSecondActivity = new SecondActivity();
	}

	public void tearDown() throws Exception {
		super.tearDown();
	}

	public void testSum() {
		
		//Variables to test with
		double a = 4;
		double b = 2;
		
		//Testing through assert
		assertEquals(6.0, (theSecondActivity.sum(a,b)));
		assertEquals(6.0, (theSecondActivity.sum(b,a)));
		
	}
	
	public void testSubtract() {
		
		//Variables to test with
		double a = 4;
		double b = 2;
		
		//Testing through assert
		assertEquals(2.0, (theSecondActivity.subtract(a,b)));
		assertEquals(-2.0, (theSecondActivity.subtract(b,a)));
		
	}
	
	public void testMultiply() {
		
		//Variables to test with
		double a = 4;
		double b = 2;
		
		//Testing through assert
		assertEquals(8.0, (theSecondActivity.multiply(a,b)));
		assertEquals(8.0, (theSecondActivity.multiply(b,a)));
		
	}
	
	public void testDivide() {
		
		//Variables to test with
		double a = 4;
		double b = 2;
		double c = 0;
		
		//Testing through assert
		assertEquals(2.0, (theSecondActivity.divide(a,b)));
		assertEquals(0.5, (theSecondActivity.divide(b,a)));
		assertEquals(0.0, (theSecondActivity.divide(a,c)));
		
	}

}
