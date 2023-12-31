package com.selenium.qa.switching_browser_tabs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Browser_Tabs {

	public static void main(String[] args) {
		/*
		 * Working with Multiple Browser Windows
		 */

		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dezlearn.com/multiple-browser-windows/");
		
		driver.findElement(By.id("u_7_8")).click();
		
		Set<String> windows = driver.getWindowHandles();
		
		for(String window : windows) {
			System.out.println(window);
			driver.switchTo().window(window);
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			System.out.println("-------------------");
			if(driver.getCurrentUrl().equals("https://www.facebook.com/")) {
				break;
			}
		}
		
		driver.findElement(By.id("u_0_c")).sendKeys("wfdjyegahkrsdf");
		driver.findElement(By.id("u_0_e")).sendKeys("wqjvwhr");


	}

}
