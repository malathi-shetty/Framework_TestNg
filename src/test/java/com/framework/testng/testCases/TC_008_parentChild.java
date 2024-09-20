package com.framework.testng.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_008_parentChild {

	@Test
	public void parentTest() {
		Assert.fail("Failed test");
	}

	@Test(dependsOnMethods = { "parentTest" }, alwaysRun = true)
	public void dependentTest() {
		System.out.println("Running even if parent test failed");
	}

}

/*
 * 
 * Here, even though the parentTest failed, the dependentTest will not get
 * skipped instead it will get executed because of “alwaysRun=true”. In case, we
 * remove the “alwaysRun=true” attribute from
 * 
 * @Test then the report will show one failure and one skipped test, without
 * trying to run the dependentTest method.
 * 
 */