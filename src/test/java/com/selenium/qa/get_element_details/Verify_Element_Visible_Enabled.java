package com.selenium.qa.get_element_details;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Element_Visible_Enabled {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		boolean isDisplayed =  driver.findElement(By.id("email")).isDisplayed();
		
		boolean isEnabled =  driver.findElement(By.id("email")).isEnabled();
		
		System.out.println(isDisplayed);
		
		System.out.println(isEnabled);
		
		try {
			driver.findElement(By.id("idDoesNotExist"));
			System.out.println("Pass: Element exist on the page.");
		} catch (Exception e) {
			System.out.println("Fail: Element does not exist on the page.");
		}
		
		driver.close();

	}

}
