package com.testScripts;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pageObjects.HomePage;

public class FileUploadTest extends BaseClass {
	
	
	private WebDriver lDriver;
	private HomePage homePage;
	String projectPath = System.getProperty("user.dir");
	
	@BeforeTest
	public void openBrowser() throws IOException {
		lDriver = getDriver();
		maximizeWindow();
		
//		lDriver.get(pageUrl());
		lDriver.get("https://www.ilovepdf.com/word_to_pdf");
		homePage = new HomePage(lDriver);
//		homePage.upload().click();
	}
	
	@Test
	public void clickChooseFile() throws InterruptedException, IOException {
//		lDriver.findElement(By.cssSelector("[type='file']")).sendKeys("C:\\Users\\govindmaddala\\OneDrive\\Desktop\\Resume\\MyResumeFinal.docx");
//		Thread.sleep(3000);
//		Runtime.getRuntime().exec("C:\\Users\\govindmaddala\\eclipse-workspace\\Dave Haeffner\\fileUploadScript.exe");
		lDriver.findElement(By.cssSelector("#pickfiles")).click();
		
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\govindmaddala\\OneDrive\\Desktop\\Resume\\fileUploaderScript.exe");
		
		Thread.sleep(3000);
		
		
		WebElement processBTN = lDriver.findElement(By.xpath("//span[@id='processTaskTextBtn']"));
		
//		waitDriver.until(ExpectedConditions.visibilityOf(processBTN));
		processBTN.click();
		
		WebDriverWait waitDriver = new WebDriverWait(lDriver, Duration.ofSeconds(30));
		waitDriver.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".downloader__btn"))).click();
		Thread.sleep(9000);
		
		File downloadedFilePath = new File("C:\\Users\\govindmaddala\\eclipse-workspace\\Dave Haeffner\\externalFiles\\downloadFiles\\MyResumeFinal.pdf");
		
		boolean fileExists = downloadedFilePath.exists();
		
		Assert.assertTrue(fileExists);
		
		downloadedFilePath.delete();
		boolean deletedFile = downloadedFilePath.exists();
		Assert.assertFalse(deletedFile);
	}
	
	@AfterTest
	public void tearDown() {
		lDriver.quit();
	}

}
