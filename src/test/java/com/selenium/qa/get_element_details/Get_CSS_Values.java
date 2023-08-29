package com.selenium.qa.get_element_details;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_CSS_Values {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
//		String color = driver.findElement(By.id("u_0_5_nK")).getCssValue("color");
		String col = driver.findElement(By.id("u_0_5_nK")).getCssValue("color");
		Thread.sleep(1000);
		System.out.println(col);

	}

}
