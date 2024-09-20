package com.framework.testng.testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_003_Login {
	
	@BeforeMethod
	public void before()
	{
		System.out.println("Execute before every test method");
	}
	
	@AfterMethod
	public void after()
	{
		System.out.println("Execute after every test method");
	}
	
	
	
	  @Test(groups= {"Sanity"}, priority=1)
	  public void Login() {
		  System.out.println("Login is successful");
	  }
	  
	  
	  @Test(enabled = false)
	  public void validateDate()
	  {
		  System.out.println("Validate Date is successful");
	  }
	  
	  @Test(groups= {"Regression"}, dependsOnMethods= {"Login"}, priority=2, invocationCount = 5)
	  public void verifyPayment() {
		  System.out.println("Payment verification is successful");
		  System.out.println("This scenario will execute 5 times and will print on console five times");
	  }
	  
	  @Test(groups= {"Regression"}, dependsOnMethods= {"verifyPayment"}, priority=3, invocationCount = 5, timeOut = 6000)
	  public void validatePayment() {
		  System.out.println("Payment validation is successful");
		  System.out.println("This scenario will fail if execution takes more than 6000ms");
	  }
	  
	  @Test(dependsOnMethods= {"validatePayment"})
	  public void validateHistory() {
		  System.out.println("History is validated");
	  }

}
