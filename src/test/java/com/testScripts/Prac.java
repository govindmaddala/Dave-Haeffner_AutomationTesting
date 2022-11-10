package com.testScripts;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Prac {
	private static WebDriver lDriver;

	public static void main(String[] args) throws InterruptedException, IOException {
		lDriver = new ChromeDriver();
		lDriver.manage().window().maximize();
		lDriver.get("https://www.ilovepdf.com/word_to_pdf");
		lDriver.findElement(By.cssSelector("#pickfiles")).click();
		
		Thread.sleep(3000);
		String pathOfAutoITScriptExeFile = "C:\\Users\\govindmaddala\\OneDrive\\Desktop\\Resume\\fileUploaderScript.exe";
		
		//This class Runtime allows the application to interface with the environment in which the application is running.
		Runtime.getRuntime().exec(pathOfAutoITScriptExeFile);
		
		//Sleep is because to get that exe file
		Thread.sleep(3000);
		
	    //Upon uploading file, we have to click Convert button
		WebElement processBTN = lDriver.findElement(By.xpath("//span[@id='processTaskTextBtn']"));
		processBTN.click();
		
		//Here after uploading and converting only download button appears, so am using Explicit wait to perform download operation.
		WebDriverWait waitDriver = new WebDriverWait(lDriver, Duration.ofSeconds(30));
		waitDriver.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".downloader__btn"))).click();
		lDriver.close();
	}

}
