package com.selenium.qa.get_element_details;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Element_Selected {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com/sch/ebayadvsearch");
		
		// to maximize window
		driver.manage().window().maximize();
		
		boolean rc1 = driver.findElement(By.xpath("//input[@name='LH_LPickup']")).isSelected();		
		driver.findElement(By.xpath("//input[@name='LH_LPickup']")).click();		
		boolean rc2 = driver.findElement(By.xpath("//input[@name='LH_LPickup']")).isSelected();		
		System.out.println(rc1);		
		System.out.println(rc2);
		
		
		boolean rc3 = driver.findElement(By.xpath("//input[@id='s0-1-17-6[3]-[1]-LH_Auction']")).isSelected();		
		driver.findElement(By.xpath("//input[@id='s0-1-17-6[3]-[1]-LH_Auction']")).click();		
		boolean rc4 = driver.findElement(By.xpath("//input[@id='s0-1-17-6[3]-[1]-LH_Auction']")).isSelected();		
		System.out.println(rc3);		
		System.out.println(rc4);
		

	}

}
