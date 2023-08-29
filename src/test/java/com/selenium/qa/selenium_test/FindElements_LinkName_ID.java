package com.selenium.qa.selenium_test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindElements_LinkName_ID {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.actitime.com");
		
		driver.findElement(By.linkText("Try Free")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
//		
		wait.until(ExpectedConditions.urlToBe("https://www.actitime.com/free-online-trial"));
		
		driver.findElement(By.id("FirstName")).sendKeys("Meet");
		
		driver.findElement(By.id("LastName")).sendKeys("Google");
		
		driver.findElement(By.id("Email")).sendKeys("Google@gmail.com");
		
		driver.findElement(By.id("Company")).sendKeys("Google Company");
		

	}

}
