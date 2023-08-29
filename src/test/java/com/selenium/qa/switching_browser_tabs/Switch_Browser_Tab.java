package com.selenium.qa.switching_browser_tabs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_Browser_Tab { // MAKE IT WORK PROPERLY

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://web.facebook.com");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"terms-link\"]")).click();
		driver.findElement(By.linkText("Terms")).click();
		Thread.sleep(1000);
		String parentWindow = driver.getWindowHandle();
		
		Set<String> windows = driver.getWindowHandles();
		
		for (String window: windows) {
			if(!window.equals(parentWindow)) {
				driver.switchTo().window(window);
			}
		}
		Thread.sleep(1000);
		
//		 driver.findElement(By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a")).click();
		 String x = driver.findElement(By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a")).getText();
		System.out.println(x);
//		driver.switchTo().window(parentWindow);

	}

}
