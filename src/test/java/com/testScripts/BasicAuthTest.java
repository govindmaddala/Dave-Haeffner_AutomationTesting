package com.testScripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pageObjects.BasicAuthPage;
import com.pageObjects.CommonElements;
import com.pageObjects.HomePage;

public class BasicAuthTest extends BaseClass {
	
	private WebDriver lDriver;
	private HomePage homePage;
	private BasicAuthPage basicAuthPage;
	private String usernameAndPassword;
	private String domain;
	private CommonElements commonElements;
	
	@BeforeTest
	public void openWebSIte() throws IOException, InterruptedException {
		lDriver = getDriver();
		maximizeWindow();
		lDriver.get(pageUrl());
		homePage = new HomePage(lDriver);
		basicAuthPage = new BasicAuthPage(lDriver);
		commonElements = new CommonElements(lDriver);
		usernameAndPassword = basicAuthPage.getUsernameAndPassword();
		domain = lDriver.getCurrentUrl().substring(7);
		homePage.auth().click();
//		Thread.sleep(3000);
	}
	
	
	@SuppressWarnings("deprecation")
	@Test(priority = 1)
	public void enterCred() throws InterruptedException {
		String authUrl = "http://"+ usernameAndPassword +":"+usernameAndPassword +"@" + domain + "basic_auth";
		lDriver.get(authUrl);

//		lDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);		
	}
	
	@Test(priority = 2)
	public void checkHeading() {
		String actualHeading = commonElements.pageHeading();
		String expectedHeading = basicAuthPage.getHeadingText();
		Assert.assertEquals(actualHeading, expectedHeading);
		
	}
	
	@Test(priority = 2)
	public void checkParagraph() {
		String actualPara = commonElements.pageParagraph();
		String expectedPara = basicAuthPage.getParaText();
		Assert.assertEquals(actualPara, expectedPara);
	}
	
	@AfterTest
	public void tearDown() {
		lDriver.quit();
	}
}
