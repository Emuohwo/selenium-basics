package com.selenium.qa.selenium_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Navigation_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		Get a url
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		// Navigate to a specific URL
		driver.navigate().to("https://www.facebook.com");
		System.out.println(driver.getTitle());
		
		// Go back to previous page
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		// Go forward to a previous page
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		// Refresh page
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
		

	}

}
