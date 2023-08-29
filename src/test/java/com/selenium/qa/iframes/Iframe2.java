package com.selenium.qa.iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe2 {  // MAKE IT WORK

	public static void main(String[] args) throws Exception {
		
		/*
		 * Working with Nested iFrames
		 */
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dezlearn.com/nested-iframes/");
		Thread.sleep(2000);
		
		driver.switchTo().frame("demo_parent_iframe");
		
		driver.switchTo().frame("demo_frame1");
		
		driver.findElement(By.id("u_5_6")).click();
		System.out.println(driver.findElement(By.id("u_5_6")).getText());
		
		Thread.sleep(2000);
		
		driver.switchTo().parentFrame();
		
		driver.findElement(By.id("u_5_5")).click();
		
		driver.switchTo().defaultContent();

	}

}
