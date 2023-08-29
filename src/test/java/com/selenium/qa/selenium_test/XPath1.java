package com.selenium.qa.selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath1 {

	public static void main(String[] args) {

		/*
		 * 1. What is XPath
		 * 	A query language which is used to find a node or set of nodes in XML/HTML document
		 * 
		 * 2. Relative XPath Using Node Attributes
		 * 
		 *  Syntax: //TagName[@Attribute Name="Attribute Value"]
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.kingsch.at/");
		
		driver.findElement(By.xpath("//input[@placeholder='Username, Phone Number or E-mail']")).sendKeys("test@mailinator.com");
		
		driver.findElement(By.xpath("//input[@data-vv-as=\"Password\"]")).sendKeys("MyPassword");

	}

}
