package com.selenium.qa.switching_browser_tabs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_Popup_Windows {

	public static void main(String[] args) throws Exception {
		
		/*
		 * How to close all popup browser windows?
		 */

		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dezlearn.com/multiple-browser-windows/");
		
		driver.findElement(By.id("u_7_8")).click();
		Thread.sleep(3000);
		
		String parentWindow = driver.getWindowHandle();
		
		Set<String> windows = driver.getWindowHandles();
		
		for(String window : windows) {
			if(!window.equals(parentWindow)) {
				driver.switchTo().window(window);
				driver.close();
				Thread.sleep(1000);
			}
		}
		
		driver.switchTo().window(parentWindow);

	}

}
