package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContextMenuPage {
	
	public ContextMenuPage(WebDriver rdriver) {
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(id = "hot-spot")
	WebElement checkBox_1;
	
	public WebElement getCheckBox_1() {
		return checkBox_1;
	}
	
	

}
