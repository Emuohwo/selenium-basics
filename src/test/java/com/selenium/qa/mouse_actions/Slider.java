package com.selenium.qa.mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/slider/");
		driver.switchTo().frame(0);
		
		WebElement slider = driver.findElement(By.cssSelector("div#slider > span"));
		
		Actions action = new Actions(driver);
		
		action.clickAndHold(slider).moveByOffset(20, 0).release(slider).build().perform();

	}

}
