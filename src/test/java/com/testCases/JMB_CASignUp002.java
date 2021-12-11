
//username is missing




package com.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.BaseClass;
import com.pageObjects.CA_LandingPage;
import com.pageObjects.LoginPage;

public class JMB_CASignUp002 extends BaseClass {
	
	@Test(priority=1)
	public void JMB_CASignUp002() throws IOException
	{
		//Started the login test
		logger.info("Started Logintest");
		//Create the object for LandingPage
		CA_LandingPage lp = new CA_LandingPage(driver);
		//Clicking on Login button
		lp.clkbtnLogin();
		logger.info("Clicked on Login");
		//Create an object for LoginPage
		LoginPage loginpg = new LoginPage(driver);
		//loginpg.settxtemail(username1);		//Pass username1 declared in config file
		loginpg.settxtpassword(password);	//Pass password declared in config file
		loginpg.clkbtnSubmit();             //Click on submit button
		
		//validate if username present or not
		//SoftAssert softassert = new SoftAssert();
		
		WebElement message = driver.findElement(By.xpath("//*[@id=\"candidateLogin\"]/div[3]/div[1]/div/span"));
		String ExpectedText = "Please enter valid email.";
		
		System.out.println(message.getText());
		Assert.assertEquals(ExpectedText,message.getText());
		System.out.println("Expected message is displayed. SignUp002 passed");
		
		
		
		
		
		
		
		
		
		//Validate whether login is successful
	/**	SoftAssert softassert = new SoftAssert();
		if(driver.getTitle().equals("Dashboard"))
		{
			softassert.assertTrue(true);
			logger.info("Test Passed! Login Successful!");
		}
		else
		{
			softassert.assertTrue(false);
			logger.error("Test Failed! Login failed!");
			captureScreen(driver,"JMB_CASignUp001");
		}
		softassert.assertAll();
		logger.info("Completed JMB_CASignUp001");
		
	}**/
	
	}
 }