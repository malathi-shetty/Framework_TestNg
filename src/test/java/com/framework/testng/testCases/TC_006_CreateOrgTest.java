package com.framework.testng.testCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_006_CreateOrgTest {
	
	@BeforeClass
	public void configBC() {
		System.out.println("====== Launch the Browser ======");		
	}
	
	@BeforeMethod
	public void configBM() {
		System.out.println("====== Login ======");
	}
	
	@AfterMethod
	public void configAM() {
		System.out.println("====== Logout ======");	
		System.out.println();
	}
	
	@AfterClass
	public void configAC() {
		System.out.println("====== Close the Browser ======");	
	}
	
	@Test
	public void CreateOrgTest() {
		System.out.println(" Navigate to Org Module ");
		System.out.println(" Create Org ");
		System.out.println("Verify");
	}
	
	@Test
	public void CreateOrgWithIndustriesTest() {
		System.out.println(" Navigate to Org Module ");
		System.out.println(" Create Org with Industries");
		System.out.println("Verify");
	}
	
	@Test
	public void CreateOrgWithRatingTest() {
		System.out.println(" Navigate to Org Module ");
		System.out.println(" Create Org with Rating");
		System.out.println("Verify");
	}
	

}
