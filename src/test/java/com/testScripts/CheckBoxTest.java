package com.testScripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pageObjects.CheckboxesPage;
import com.pageObjects.HomePage;

public class CheckBoxTest extends BaseClass {
	
	private WebDriver lDriver;
	private HomePage homePage;
	private CheckboxesPage checkboxesPage;
	private boolean checkBox_1;
	private boolean checkBox_2;
	
	@BeforeTest
	public void openWebSIte() throws IOException {
		lDriver = getDriver();
		maximizeWindow();
		lDriver.get(pageUrl());
		homePage = new HomePage(lDriver);
		checkboxesPage = new CheckboxesPage(lDriver);
		homePage.checkBox().click();
	}
	
	@Test(priority = 1)
	public void statusOfCheckBoxesBeforeHandling() {
		
		checkBox_1 = checkboxesPage.getCheckBox_1().isSelected();
		checkBox_2 = checkboxesPage.getCheckBox_2().isSelected();
		
		// Here one wil
		Assert.assertEquals(checkBox_1, false);
		Assert.assertEquals(checkBox_2, true);
	}
	
	@Test(priority = 2)
	public void handleCheckBoxes() {
		checkboxesPage.getCheckBox_1().click();
		checkboxesPage.getCheckBox_2().click();
		
	}
	
	@Test(priority = 3)
	public void statusOfCheckBoxesAfterHandling() {
		
		checkBox_1 = checkboxesPage.getCheckBox_1().isSelected();
		checkBox_2 = checkboxesPage.getCheckBox_2().isSelected();
		
		// Here one wil
		Assert.assertEquals(checkBox_1, true);
		Assert.assertEquals(checkBox_2, false);
	}
	
	@AfterTest
	public void tearDown() {
		lDriver.quit();
	}

}
