
////Company login- password in encrypted form

package com.testCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.BaseClass;
import com.pageObjects.CA_LandingPage;
import com.pageObjects.LoginPage;

public class JMB_CASignUp019 extends BaseClass {
	
	@Test(priority=1)
	public void JMB_CASignUp019() throws IOException, InterruptedException
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
		loginpg.settxtemail(company_username);		//Pass username1 declared in config file
		loginpg.settxtpassword(company_password);	//Pass password declared in config file
		loginpg.clkbtnSubmit();             //Click on submit button
		Thread.sleep(1000);
	}
}
