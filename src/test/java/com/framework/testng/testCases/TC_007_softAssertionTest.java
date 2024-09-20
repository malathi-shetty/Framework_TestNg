package com.framework.testng.testCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_007_softAssertionTest {

	@Test
	public void softAssertionTest() {
		SoftAssert softAssert = new SoftAssert();

		// This assertion will fail
		softAssert.fail();
		System.out.println("Failing"); // This will be printed

		// This assertion will pass
		softAssert.assertEquals(1, 1);
		System.out.println("Passing"); // This will also be printed

		// This will check all assertions and mark the test as failed if any failed
		softAssert.assertAll();

	}
}

/*
 * 
 * Soft Assertions: Useful when you want to validate multiple conditions in a
 * single test case without stopping on the first failure.
 * 
 * Logging: Both "Failing" and "Passing" messages will be printed, demonstrating
 * that the test continues running even after a failure.
 * 
 * assertAll() Method: Essential to call at the end to ensure that all
 * assertions are checked.
 * 
 */