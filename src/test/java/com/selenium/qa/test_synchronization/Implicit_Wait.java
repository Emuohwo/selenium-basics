package com.selenium.qa.test_synchronization;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait {

//	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.dezlearn.com/test-sync-example/");

		driver.findElement(By.cssSelector("input[name='fname']")).sendKeys("John");
		
		driver.findElement(By.id("u_5_6")).click();
		
		driver.findElement(By.xpath("//a[@id='nav']")).click();

	}

}
