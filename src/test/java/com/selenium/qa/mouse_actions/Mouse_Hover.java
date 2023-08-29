package com.selenium.qa.mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.konga.com");
		
		Actions action = new Actions(driver);
		// Link to hover
		WebElement help =driver.findElement(By.linkText("Help"));
		// Action to hover link
		action.moveToElement(help).perform();		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Contact Us")).click();
		Thread.sleep(2000);
		// Get title of new page
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);

	}

}
