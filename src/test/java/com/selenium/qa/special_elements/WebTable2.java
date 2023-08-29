package com.selenium.qa.special_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) { // MAKE IT WORK
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.dezlearn.com/webtable-example/");
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='tg']/tbody/tr"));
		
		for (WebElement row: rows) {
			String name = row.findElement(By.xpath("td[1]")).getText();
			int c = 0;
			if (name.equals("John White")) {
				c++;
				if (c == 1) {
					continue;
				}
				row.findElement(By.xpath("td[4]/input")).click();
				List<WebElement> options = row.findElements(By.xpath("td[5]/select/option"));
				
				for (WebElement opt: options) {
					if (opt.getText().contains("Sports")) {
						opt.click();
						break;
					}
				}
				
				row.findElement(By.xpath("td[6]/input")).sendKeys("Comments added");
				break;
			}
		}
		
		driver.findElement(By.xpath("//button[@id='demo']")).click();
		
		driver.quit();

	}

}
