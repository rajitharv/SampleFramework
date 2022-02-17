package com.palmera.testCases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.palmera.pageObject.HomePage;




public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void loginTest() {
		
		HomePage hp = new HomePage(driver);
		hp.menuclick();
	
		SoftAssert softasset = new SoftAssert();
		
				
		if(driver.getTitle().equalsIgnoreCase("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"))
		{
			
			softasset.assertTrue(true);
			System.out.println("The title is as per expected result");
		}
		else
		{
		   softasset.assertFalse(false);
		   System.out.println("The title is inaccurate");
		}
		
		
		
		
	}
	}
