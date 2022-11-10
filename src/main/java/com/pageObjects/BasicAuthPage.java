package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasicAuthPage {
	
    public BasicAuthPage(WebDriver rdriver){
        PageFactory.initElements(rdriver, this);
    }
    
    private String headingText = "Basic Auth";
    private String paratextString = "Congratulations! You must have the proper credentials.";
    private String unAuthorizedText = "Not authorized";
    
    @FindBy(tagName = "body")
    WebElement bodyElementOnUnAuth;
    
    
    @FindBy(xpath = "*//li[3]")
    WebElement listTagOfAuth;
    
    public WebElement getBodyElement() {
    	return bodyElementOnUnAuth;
    }
    
    public String getHeadingText() {
		return headingText;
	}
    
    public String getParaText() {
		return paratextString;
	} 
    
    public String getUnauthorizedText() {
		return unAuthorizedText;
	}
    
    
    public String getUsernameAndPassword() {
    	String textString = listTagOfAuth.getText();
    	String[] wordStrings = textString.split(" ");
		String password = wordStrings[wordStrings.length-1];
		String authString = password.substring(0, password.length()-1);
		return authString;
    }
    
    
}
