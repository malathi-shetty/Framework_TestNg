package com.framework.testng.testCases;

import org.testng.annotations.Test;

public class TC_004_Customer {
	
	@Test(priority = 1)
	public void createCustomerTest()
	{
		System.out.println("execute HDFC createCustomerTest");
	}
	
	@Test(priority = 2, dependsOnMethods = "createCustomerTest")
	public void modifyCustomerTest()
	{
		System.out.println("execute modify HDFC to ICICI CustomerTest");
	}
	
	@Test(priority = 3, dependsOnMethods = "modifyCustomerTest")
	public void deleteCustomerTest()
	{
		System.out.println("execute delete ICICI CustomerTest");
	}
	
	@Test(invocationCount = 4)
	public void BankSendAmountTest()
	{
		System.out.println("execute send Amount 50K");
	}

}
