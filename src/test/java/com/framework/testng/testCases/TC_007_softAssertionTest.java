package com.framework.testng.testCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_007_softAssertionTest {
	
	@Test
	public void softAssertionTest(){
	SoftAssert softAssert= new SoftAssert();
	//Assertion failing
	softAssert.fail();
	System.out.println("Failing");
	//Assertion passing
	softAssert.assertEquals(1, 1);
	System.out.println("Passing");
	//Collates test results and marks them pass or fail
	softAssert.assertAll();

}
}