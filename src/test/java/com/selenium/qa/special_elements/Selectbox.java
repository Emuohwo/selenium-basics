package com.selenium.qa.special_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectbox {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://web.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		
		Thread.sleep(1000);
		
		String d = driver.findElement(By.id("day")).getAttribute("value");
		String m = driver.findElement(By.id("month")).getAttribute("value");
		String y = driver.findElement(By.id("year")).getAttribute("value");

		System.out.println(d);
		System.out.println(m);
		System.out.println(y);
		
		Select selectMonth =new Select(driver.findElement(By.id("month")));
		selectMonth.selectByVisibleText("Dec");
		

		String selectedMonth = driver.findElement(By.id("month")).getAttribute("value");
		System.out.println("Selected month: " + selectedMonth);
		
		driver.quit();

	}

}
