package com.selenium.qa.webelements_collection;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element_Reference {

	public static void main(String[] args) throws Exception {
		
		/*
		 * Working with WebElements within another WebElemnt
		 */

		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.walmart.com");
		
		driver.findElement(By.id("global-search-input")).click();
		
		driver.findElement(By.id("global-search-input")).sendKeys("Mens Shoes");
		
		driver.findElement(By.id("global-search-submit")).click();
		
		Thread.sleep(5000);
		
		List<WebElement> items = driver.findElements(By.cssSelector("div.search-result-gridview-item-wrapper"));
		
		//div.search-result-gridview-item-wrapper span.price-main:first-child
		
		for(WebElement item : items) {
			String itmPz = item.findElement(By.cssSelector("span.price-main:first-child")).getText().trim();
			String itmPz2 = itmPz.replace("$", "").replace(" ", "");
			double itmPz3 = Double.parseDouble(itmPz2);
			if (itmPz3 < 20.0 || itmPz3 > 50.00) {
				WebElement productTitle = item.findElement(By.cssSelector("a.product-title-link"));
				System.out.println(productTitle.getText());
				System.out.println(productTitle.getAttribute("href"));
				System.out.println(itmPz);
				System.out.println("-------------------------");
			}
		}
		
		//driver.quit();
		
	}

}
