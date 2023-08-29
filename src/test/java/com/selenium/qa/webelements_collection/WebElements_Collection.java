package com.selenium.qa.webelements_collection;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements_Collection {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.actitime.com/");
		
		List <WebElement> links = driver.findElements(By.cssSelector("a"));
		
		for(WebElement link : links) {
			String text = link.getText();
			if (!text.trim().isEmpty()) {
			  System.out.println(link.getText());
			  System.out.println("-------------");
			}
		}
		
		driver.close();

	}

}
