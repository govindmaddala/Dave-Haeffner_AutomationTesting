package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonElements {
//
//    private WebDriver ldriver;
    public CommonElements(WebDriver rdriver){
//        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(css="#content h3")
    WebElement pageHeading;

    @FindBy(css="#content p")
    WebElement pageParagraph;

    
    public String pageHeading() {
        return pageHeading.getText();
    }

    public String pageParagraph() {
        return pageParagraph.getText();
    }
}
