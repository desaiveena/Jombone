
//company login-availability of primary content of login form


package com.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.BaseClass;
import com.pageObjects.CA_LandingPage;
import com.pageObjects.LoginPage;

public class JMB_CASignUp009 extends BaseClass {
	
	@Test(priority=1)
	public void JMB_CASignUp009() throws IOException
	{
		//Started the login test
		logger.info("Started Logintest");
		//Create the object for LandingPage
		CA_LandingPage lp = new CA_LandingPage(driver);
		//Clicking on Login button
		lp.clkbtnLogin();
		logger.info("Clicked on Login");
		
		if(driver.findElement(By.id("sbBt"))!= null)
		{
			System.out.println("Primary content-submit button is Present");
		}else
		{
			System.out.println(" Primary content-submit button is Absent");
		}
	}
}