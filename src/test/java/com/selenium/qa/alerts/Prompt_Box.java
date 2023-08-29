package com.selenium.qa.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prompt_Box {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.dezlearn.com/javascript-alerts/");
		
		driver.findElement(By.xpath("//button[@id='p_alert3']")).click();
		
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		
		alert.sendKeys("Lagos");
		Thread.sleep(2000);
		System.out.println(alert.getText());
		
		alert.accept();

	}

}
