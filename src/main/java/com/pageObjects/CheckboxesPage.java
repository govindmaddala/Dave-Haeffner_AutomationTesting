package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckboxesPage {
	
	public CheckboxesPage(WebDriver rdriver) {
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(css = "[type='checkbox']:nth-child(1)")
	WebElement checkBox_1;
	
	@FindBy(css = "[type='checkbox']:nth-child(3)")
	WebElement checkBox_2;
	
	public String getHeadingText() {
		return "Checkboxes";
	}
	
	public WebElement getCheckBox_1() {
		return checkBox_1;
	}
	
	public WebElement getCheckBox_2() {
		return checkBox_2;
	}

}
