package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Events {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karthik ravi\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
		WebElement clickbutton = driver.findElement(By.xpath("//button[text()='Click Me']"));
		Actions ac=new Actions(driver);
		ac.click(clickbutton).build().perform();
	
		WebElement rightclick = driver.findElement(By.id("rightClickBtn"));
		ac.contextClick(rightclick).build().perform();
		
		WebElement doubleclick = driver.findElement(By.id("doubleClickBtn"));
		ac.doubleClick(doubleclick).build().perform();
		
		
		driver.navigate().to("http://www.leafground.com/pages/drop.html");
		
		WebElement drag = driver.findElement(By.id("draggable"));
		
		WebElement drop = driver.findElement(By.id("droppable"));
		ac.dragAndDrop(drag, drop).build().perform();
		
		
	}

}
