package com.selenium.qa.test_synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.dezlearn.com/explicit-wait-example/");

		driver.findElement(By.cssSelector("input[name='fname']")).sendKeys("John");
		
		driver.findElement(By.id("u_5_6")).click();
//		driver.findElement(By.xpath("//a[@id='nav']"));
		
		// Initialize and wait till element(link) became clickable - timeout in 10 seconds
		WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
		        .until(ExpectedConditions.elementToBeClickable(By.cssSelector("#u_5_7")));

		System.out.println(firstResult.getText());

	}

}
