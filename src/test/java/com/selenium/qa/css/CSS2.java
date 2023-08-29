package com.selenium.qa.css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.findElement(By.cssSelector("span.hm-icon-label")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.partialLinkText("Kindle E-readers & Books")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.partialLinkText("Kindle Paperwhite")).click();
		
		Thread.sleep(1000);
		
		String title = driver.findElement(By.cssSelector("span#productTitle")).getText();
		
//		Thread.sleep(1000);

		System.out.println(title);
		
		if (title.contains("Kindle Paperwhite")) {
			System.out.println("Pass");
		} 
		else {
			System.out.println("Fail");
		}
		
		
		driver.close();
	}

}
