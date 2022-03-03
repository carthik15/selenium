package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practices {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karthik ravi\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	WebElement findElement = driver.findElement(By.xpath("//input[@type='text']"));
		findElement.sendKeys("karthikdanger007@gmail.com");
		boolean displayed = findElement.isDisplayed();
		System.out.println("is displayed:"+ displayed);
	WebDriverWait wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOf(findElement));
	WebElement findElement2 = driver.findElement(By.name("password"));
		findElement2.sendKeys("yoyoyo17");
		boolean enabled = findElement.isEnabled();
		System.out.println("is enabled:"+enabled);
		WebElement findElement3 = driver.findElement(By.xpath("//button[contains(@class,'L3NKy')]"));
		findElement3.click();
		boolean selected = findElement3.isSelected();
		System.out.println("is selected:"+ selected);
		String attribute = findElement.getAttribute("name");
		System.out.println(attribute);
		String attribute2 = findElement2.getAttribute("value");
		System.out.println(attribute2);
		
	}

}
