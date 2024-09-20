package com.framework.testng.testCases;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class TC_009_Factory {

	private String str;

	// Constructor
	public TC_009_Factory(String str) {
		this.str = str;
	}

	@Test
	public void testMethod() {
		System.out.println(str);
	}

	// Factory class to create instances of TC_009_Factory
	public static class TestFactory {

		@Factory
		public Object[] factoryMethod() {
			return new Object[] { new TC_009_Factory("K1"), new TC_009_Factory("K2") };
		}

	}
}

/*
 * 
 * Static Factory Class: The TestFactory class is now a static inner class. This
 * allows it to access the outer class's constructor without requiring an
 * instance of TC_009_Factory.
 * 
 * Factory Method: The factoryMethod() creates instances of TC_009_Factory with
 * different parameters ("K1" and "K2") and returns them as an array.
 * 
 * Naming Conventions: Changed TestMethod to testMethod to follow Java naming
 * conventions for methods (usually camelCase).
 * 
 * Execution:
 * 
 * When you run this test, TestNG will execute the testMethod() twice, printing
 * "K1" and "K2" to the console. 
 * 
 * 
 * @Factory method creates instances of test class and runs all the test methods in that class with
a different set of data.

Whereas, @DataProvider is bound to individual test methods and runs the specific methods multiple
times.
 * 
 */