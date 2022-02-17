package com.palmera.pageObject;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.palmera.testCases.BaseClass;

public class HomePage  {
	
	WebDriver ldriver;
	
	public HomePage(WebDriver rdriver) {
		
		ldriver =rdriver;
		PageFactory.initElements(rdriver, this);
					
	}
	
	@FindBy(css="a#nav-hamburger-menu")
	WebElement Menu;
	
	public void menuclick() {
		Menu.click();
	}


}
