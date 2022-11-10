package com.testScripts;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Saucelabs {
	public static String linkString = "https://oauth-maddala.govind2107-4600e:5e9e3950-9a65-4a97-9dde-442162b0cbab@ondemand.eu-central-1.saucelabs.com:443/wd/hub";
	  
	//for desired capabilities link is : https://saucelabs.com/platform/platform-configurator#/ 
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("browserName", "chrome");
		caps.setCapability("platform", "Windows 7");
		caps.setCapability("version", "26");

		RemoteWebDriver driver = new RemoteWebDriver(new URL(linkString), caps);
		
		driver.get("http://the-internet.herokuapp.com/");
		System.out.println(driver.getTitle());
		driver.close();
	}

}
