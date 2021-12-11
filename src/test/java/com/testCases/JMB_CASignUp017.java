

//Company Login - Sign up page link





package com.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.BaseClass;
import com.pageObjects.CA_LandingPage;
import com.pageObjects.LoginPage;


public class JMB_CASignUp017 extends BaseClass 
{
	
	@Test(priority=1)
	public void JMB_CASignUp017() throws IOException
	{
		//Started the login test
		logger.info("Started Logintest");
		//Create the object for LandingPage
		CA_LandingPage lp = new CA_LandingPage(driver);
		
		
		WebElement SIn = driver.findElement(By.xpath("//*[@id=\"collapsibleNavbar\"]/ul[2]/li[2]/a"));
		SIn.click();
		
		WebElement CIn = driver.findElement(By.xpath("//*[@id=\"collapsibleNavbar\"]/ul[2]/li[2]/div/div/div/a[2]"));
		CIn.click();
		
		//WebElement JoinNow = driver.findElement(By.id("empSbBt"));
		
		SoftAssert softassert = new SoftAssert();
		if(driver.getTitle().equals("SignUp"))
		{
			softassert.assertTrue(true);
			logger.info("Test Passed! ");
		}
		else
		{
			softassert.assertTrue(false);
			logger.error("Test Failed! ");
			//captureScreen(driver,"JMB_CASignUp001");
		}
		//softassert.assertAll();
		//logger.info("Completed JMB_CASignUp001");
		
		
	}
}
