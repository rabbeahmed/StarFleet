package com.careerhack.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomepage {

	WebDriver driver;
	
	public GoogleHomepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	//WebElement searchbox = driver.findElement(By.name("q"));
	//searchbox.sendKeys(string);
	
	
	@FindBy(name = "q")
	WebElement searchbox;
	
	public void enterSearch(String string) {
		searchbox.sendKeys(string);
		
	}
	//WebElement searchButtom = driver.findElement(By.name("btnK"));
	//searchButtom.submit();
	
	@FindBy(name = "btnK")
	WebElement searchButton;
	
	public void clickSearch() {
		searchButton.submit();
	}
	
}
