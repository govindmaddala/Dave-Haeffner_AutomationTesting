package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChallengingDOM {

	public ChallengingDOM(WebDriver rdriver) {
		PageFactory.initElements(rdriver, this);		
	}
	
	@FindBy(css = "a.alert")
    WebElement fooButton;

	public WebElement getFooButton() {
		return fooButton;
	}
	
	@FindBy(linkText = "baz")
    WebElement bazButton;

	public WebElement getBazButton() {
		return bazButton;
	}
	
	@FindBy(css = "a.success")
    WebElement barButton;

	public WebElement getBarButton() {
		return barButton;
	}
	
	

}
