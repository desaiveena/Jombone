

// Candidate clicks on the Forgot password link

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

public class JMB_CASignUp008 extends BaseClass 
{
	
	@Test(priority=1)
	public void JMB_CASignUp008() throws IOException
	{
		//Started the login test
		logger.info("Started Logintest");
		//Create the object for LandingPage
		CA_LandingPage lp = new CA_LandingPage(driver);
		//Clicking on Login button
		lp.clkbtnLogin();
		
		//find the forgot link
		WebElement fl_link =driver.findElement(By.xpath("//*[@id=\"candidateLogin\"]/div[3]/div[3]/div[1]/a"));
		fl_link.click();
		
		//enter the email into the box provided
		
		WebElement emailBox = driver.findElement(By.id("email"));
		emailBox.sendKeys(username1);
		
		//Click on submit button
		WebElement submitBtn = driver.findElement(By.id("sbBt"));
		submitBtn.click();
		
		WebElement message = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/p"));
		System.out.println(message);
		
		String ExpectedText = "We have sent a 4 digit code to email\niteach.veena@gmail.com";
		
		System.out.println(message.getText());
		Assert.assertEquals(ExpectedText,message.getText());
		System.out.println("Expected message is displayed. SignUp005 passed");
		
		
		
		
	}
}
