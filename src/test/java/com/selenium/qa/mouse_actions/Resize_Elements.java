package com.selenium.qa.mouse_actions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resize_Elements {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/resizable/");
		driver.switchTo().frame(0);
		
		WebElement resizeIcon = driver.findElement(By.cssSelector("div.ui-icon-gripsmall-diagonal-se"));
		
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		
		action.clickAndHold(resizeIcon).moveByOffset(30, 90).build().perform();
		

	}

}
