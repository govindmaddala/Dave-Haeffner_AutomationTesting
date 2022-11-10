package com.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrokenImagesPage {

    public BrokenImagesPage(WebDriver rdriver){
        PageFactory.initElements(rdriver, this);
    }
    
    
    @FindBy(css = ".example img")
    List<WebElement> imagesAndAvatar;
    
    public List<WebElement> getImagesAndAvatar() {
    	return imagesAndAvatar;
    }
    
}
