package com.testScripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pageObjects.AddRemoveButtonsPage;
import com.pageObjects.HomePage;

public class AddRemoveButtonsTest extends BaseClass {
	
	private WebDriver lDriver;
	private HomePage homePage;
	private AddRemoveButtonsPage addRemoveButtonsPage;
	
	
	public void clickAddButton(int n) {
		for(int i=0;i<n;i++) {
			addRemoveButtonsPage.getAddButton().click();
		}
	}
	
	public void clickDeleteButton(int n) {
		for(int i=0;i<n;i++) {
			addRemoveButtonsPage.getDeleteButton().get(i).click();
		}
	}
	
	@BeforeTest
	public void openWebSIte() throws IOException {
		lDriver = getDriver();
		maximizeWindow();
		lDriver.get(pageUrl());
		homePage = new HomePage(lDriver);
		homePage.Add_or_Remove().click();
		addRemoveButtonsPage = new AddRemoveButtonsPage(lDriver);
	}
	
	@Test(priority = 1)
	public void checkVisibilityOfDeleteButtonOnStart() {
		boolean deleteButtonVisibility = false;
		try {
			deleteButtonVisibility =  addRemoveButtonsPage.getDeleteButton().get(0).isDisplayed();
		}catch (Exception e) {
			
		}
		Assert.assertFalse(deleteButtonVisibility);
	}
	
	@Test(priority = 2)
	public void checkVisibilityOfDeleteButtonOnClickingAddButton() {
		clickAddButton(1);
		boolean deleteButtonVisibility = false;
		try {
			deleteButtonVisibility =  addRemoveButtonsPage.getDeleteButton().get(0).isDisplayed();
		}catch (Exception e) {
			
		}
		Assert.assertTrue(deleteButtonVisibility);
	}
	
	@Test(priority = 3)
	public void checkAddAndDeleteButtonsAreEnabled() {
		addRemoveButtonsPage.getAddButton().isEnabled();
		addRemoveButtonsPage.getDeleteButton().get(0).isEnabled();
	}
	
	
	@Test(priority = 4)
	public void checkNDeleteButtonsVisibileOnClickingAddButtonNTimes() {
		int n = 5;
		clickAddButton(n);
//		count should be "n+1" because in previous testcase, already 1 time add button is clicked
		int countOfDeleteButtons =  addRemoveButtonsPage.getDeleteButton().size();
		Assert.assertEquals(countOfDeleteButtons, n+1);
	}
	
	@Test(priority = 5)
	public void clickDeleteButtonNTimesAndCheckDeleteButtonCountDecreasedByN() {
		int n = 1;
		int beforeDeleteClickCount = addRemoveButtonsPage.getDeleteButton().size();
		clickDeleteButton(n);
		int afterDeleteClickCount =  addRemoveButtonsPage.getDeleteButton().size();
		Assert.assertEquals(afterDeleteClickCount, beforeDeleteClickCount-n);
	}
		
	@AfterTest
	public void tearDown() {
		lDriver.quit();
	}

}
