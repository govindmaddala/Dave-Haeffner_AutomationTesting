package com.testScripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pageObjects.A_B_SplitTestingPage;
import com.pageObjects.CommonElements;
import com.pageObjects.HomePage;

public class A_B_SplitTest extends BaseClass{
	private HomePage homePage;
	private WebDriver lDriver;
	private CommonElements commonElements;
	
	@BeforeTest
	public void openWebSIte() throws IOException {
		lDriver = getDriver();
		maximizeWindow();
		homePage = new HomePage(lDriver);
		lDriver.get(pageUrl());
	}
	
	@Test(priority = 1)
	public void A_by_B_test() throws InterruptedException {
		homePage.A_by_B().click();
	}
	
	
	@Test(priority = 2)
	public void checkHeading() {
		commonElements = new CommonElements(lDriver);
		String actualHeading =  commonElements.pageHeading();
		String expectedHeading = A_B_SplitTestingPage.expectedHeadingText();
		Assert.assertEquals(actualHeading, expectedHeading);
	}
	
	@Test(priority = 3)
	public void checkParaText() {
		String actualPara =  commonElements.pageParagraph();
		
		String expectedPara = A_B_SplitTestingPage.expectedParagraphText();
		Assert.assertEquals(actualPara, expectedPara);
	}
	
	@AfterTest
	public void tearDown() {
		lDriver.quit();
	}
}
