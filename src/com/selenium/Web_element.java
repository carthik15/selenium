package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_element {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthik ravi\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement emailid = driver.findElement(By.id("email"));
	emailid.sendKeys("karthik96.ravi@gmail.com");
		boolean displayed = emailid.isDisplayed();
		System.out.println("is displayed:"+ displayed);
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("yoyoyo1711_8");
		boolean enabled = password.isEnabled();
		System.out.println("is enabled:"+enabled);
		WebElement login = driver.findElement(By.name("login"));
		//login.click();
		boolean selected = login.isSelected();
		System.out.println("is seleted:"+selected);
		String attribute = emailid.getAttribute("name");
		System.out.println(attribute);
		String attribute2 = password.getAttribute("pass");
		System.out.println(attribute2);
		emailid.clear();
		
		
		
		
	
	

	
	
	}
}