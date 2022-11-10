package com.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddRemoveButtonsPage {

    public AddRemoveButtonsPage(WebDriver rdriver){
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//button[contains(@onclick,'add')]")
    WebElement addButton;

    @FindBy(xpath = "//button[contains(@onclick,'delete')]")
    List<WebElement> deleteButton;

    public WebElement getAddButton() {
        return addButton;
    }

    public List<WebElement> getDeleteButton() {
        return deleteButton;
    }
}
