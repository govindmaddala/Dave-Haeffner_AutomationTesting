package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	private WebDriver driver;
	private static String projectPath = System.getProperty("user.dir");
	private static Properties prop;
	private static FileInputStream fis;
	private String configFilePath = projectPath + "\\src\\main\\java\\com\\base\\configuration.properties";
	
	public WebDriver getDriver() throws IOException {
		fis = new FileInputStream(configFilePath);
		prop = new Properties();
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		switch(browserName){
		case "chrome":
			//WebDriverManager.chromedriver().setup();
			String headless = prop.getProperty("browser");
			ChromeOptions op = new ChromeOptions();
			
			Map<String, Object> prefs = new HashMap<String, Object>();
	        prefs.put("download.default_directory", projectPath + File.separator + "externalFiles" + File.separator + "downloadFiles");
	        
	        op.setExperimentalOption("prefs", prefs);
			if(headless.equalsIgnoreCase("true")) {
				op.addArguments("headless");
			}
			driver = new ChromeDriver(op);
			break;
		case "firefox":
			//WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "edge":
			//WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default:
			driver = null;
			break;
		}
		
		return driver;
	}
	
	public String pageUrl(){
		String pageUrl = prop.getProperty("url");
		return pageUrl;
	}
	
	public static void takeScreenshot(WebDriver instantDriver,String imageName) throws IOException {
		TakesScreenshot ss = (TakesScreenshot) instantDriver;
		
		String imgPath = projectPath + "\\images\\"+imageName+".png";
		File filePath = new File(imgPath);
		
		File file = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, filePath);
	}
	
	public static void takeScreenshotOnFailure(WebDriver instantDriver,String className,String methodName) throws IOException {
		TakesScreenshot ss = (TakesScreenshot) instantDriver;
		
		String imgPath = projectPath + "\\images\\"+className+ "_"+ methodName+  ".png";
		File filePath = new File(imgPath);
		
		File file = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, filePath);
	}
	
	public void implicitWait(WebDriver instantDriver,long seconds) {
		instantDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}
	
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}
	
	public void minimizeWindow() {
		driver.manage().window().minimize();
	}
}
