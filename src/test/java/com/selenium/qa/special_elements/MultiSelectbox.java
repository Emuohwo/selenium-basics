package com.selenium.qa.special_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiSelectbox { //BACK TO IT 

	public static void main(String[] args) throws Exception  {
		
		/*
		 * Selecting multiple options from a Multi-Selectbox
		 */
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/jobs/information-technology-jobs-haven-ks?trk=homepage-basic_suggested-search&pageNum=0&position=1");
		
		driver.findElement(By.xpath("//button[contains(text(),'Experience Level')]")).click();
		Thread.sleep(1000);
		
		List<WebElement> options = driver.findElements(By.cssSelector("#EXPERIENCE-dropdown li"));
		
		for (WebElement option: options) {
			if (option.getText().contains("Associate")
					|| option.getText().contains("Director")) {
				option.click();
			}
		}

	}

}
