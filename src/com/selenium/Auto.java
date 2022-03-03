package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Auto {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karthik ravi\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		WebElement find = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]"));
		Actions as=new Actions(driver);
		as.moveToElement(find).build().perform();
		
		WebElement add = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]"));
		add.click();
		
		WebElement pro = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		pro.click();
	}
}
