package com.careerhack.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.careerhack.common.GoogleBase;
import com.careerhack.pages.GoogleHomepage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchStarFleetQAF extends GoogleBase{
	
	
	//WebDriver driver;

	@Given("I am on google homepege")
	public void i_am_on_google_homepege() { 
		
		launchBrowser();
		//safaribrowser();
		
	}
	
	/*WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("http://google.com");
	driver.manage().window().maximize();*/

	@When("I enter a search {string} on the search box")
	public void i_enter_a_search_on_the_search_box(String string) {
			
		
		//throws InterruptedException {
		
		//WebElement searchbox = driver.findElement(By.name("q"));
		//searchbox.sendKeys(string);
		GoogleHomepage gph = new GoogleHomepage(driver);
		gph.enterSearch(string);
		
		//Thread.sleep(2000);
		//WebElement searchbox = driver.findElement(By.partialLinkText(string)));
	}

	@When("I click on the search buttom")
	public void i_click_on_the_search_buttom() {
		
		//WebElement searchButtom = driver.findElement(By.name("btnK"));
		//searchButtom.submit();
		//driver.findElement(By.name("btnK"));
		GoogleHomepage gph = new GoogleHomepage(driver);
		gph.clickSearch();
	}

	@Then("I find revelant results and count of the results")
	public void i_find_revelant_results_and_count_of_the_results() {

		WebElement results = driver.findElement(By.id("result-stats"));
		String resultsCounts = results.getText();
		System.out.println("=======================");
		System.out.println(resultsCounts);
		System.out.println("=======================");
		
		//driver.close();
		closeDriver();
		
	}

}
