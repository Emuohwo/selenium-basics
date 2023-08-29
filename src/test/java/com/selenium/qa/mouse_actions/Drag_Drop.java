package com.selenium.qa.mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		
		WebElement source = driver.findElement(By.cssSelector("#draggable"));

		WebElement target = driver.findElement(By.cssSelector("#droppable"));
		
		Actions action = new Actions(driver);
		
//		action.dragAndDrop(source, target).perform(); // short form of the line below
		action.clickAndHold(source).moveToElement(target).release(source).build().perform();

	}

}
