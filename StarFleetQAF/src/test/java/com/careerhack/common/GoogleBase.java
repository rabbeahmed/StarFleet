package com.careerhack.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleBase {

	public WebDriver driver;

	protected void launchBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		
	}
	
	public void closeDriver() {
		driver.close();
	}
	

	/*protected void safaribrowser() {
		
		WebDriverManager.safaridriver().setup();
		driver = new SafariDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
	}*/
}