package com.selenium.qa.selenium_test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindElements_Name {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.amazon.com");
		
		driver.findElement(By.name("field-keywords")).sendKeys("barbie dolls");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.partialLinkText("Nurse Fashion Doll with Medical Tool Print")).click();
		
		Thread.sleep(2000);
		
		String productTitle = driver.findElement(By.id("productTitle")).getText();
		
		String productPrice = driver.findElement(By.className("a-offscreen")).getText();
		
		//System.out.println(driver.getTitle());
		System.out.println("productTitle: " + productTitle );
		
		System.out.println("productPrice: " + productPrice );
		

	}

}
