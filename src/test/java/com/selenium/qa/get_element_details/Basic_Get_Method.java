package com.selenium.qa.get_element_details;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Get_Method {

	public static void main(String[] args) {
		
		/*
		 * Basic Get Methods
		 * 1. Get Attribute
		 * 2. Get Text
		 * 3. Get Tag Name
		 */
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String att1 = driver.findElement(By.id("email")).getAttribute("class");
		String att2 = driver.findElement(By.id("email")).getAttribute("aria-label");
		String att3 = driver.findElement(By.id("email")).getTagName();
		
//		String text = driver.findElement(By.id("u_0_5_nK")).getText();
		
		System.out.println(att1);
		System.out.println(att2);
		System.out.println(att3);
//		System.out.println(text);
		
		driver.quit();

	}

}
