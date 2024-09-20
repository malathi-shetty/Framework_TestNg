package com.framework.testng.testCases;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class TC_001_Test {
	
	WebDriver driver;
	
	
	
	
	
	
	
  @Test(dataProvider = "ProvideSearch")
  public void f(String username, String password) {
	  
	  String url = "https://practice.expandtesting.com/login";
	  
	  System.out.println("Launching Google Chrome browser"); 
	  WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	  driver.get(url);
	  
	  System.out.println(username);
	  System.out.println(password);
	  
  }
  
  

  
  
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Starting Test On Chrome Browser");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();
		System.out.println("Finished Test On Chrome Browser");
  }


  @DataProvider(name="ProvideSearch")
  public Object[][] getDataFromProvider() {
    return new Object[][] {
      new Object[] { "test", "test1" },
      new Object[] { "qaclick", "test2" },
      new Object[] { "practice", "SuperSecretPassword!"},
    };
  }
}
