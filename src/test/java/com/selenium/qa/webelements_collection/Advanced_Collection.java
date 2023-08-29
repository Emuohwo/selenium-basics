package com.selenium.qa.webelements_collection;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Advanced_Collection {

	public static void main(String[] args) {

		System.setProperty("webdriver.firefox.driver", "C:\\Users\\eWarri\\eclipse-workspace\\selenium-test\\src\\test\\java\\Drivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.goodreads.com/");
		
		List <WebElement> books = driver.findElements(By.cssSelector("img[src$='jpg']"));
		
		System.out.println(books.size());
		
		for(WebElement book : books) {
			  System.out.println(book.isDisplayed()); // visible element
			  System.out.println(book.getAttribute("alt"));
			  System.out.println("-------------");
		}
		
		driver.close();
	}

}
