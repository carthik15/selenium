package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowshandles {
	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karthik ravi\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement mobiles = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]"));
		Actions ac=new Actions(driver);
		ac.contextClick(mobiles).build().perform();
		
		Robot ro=new Robot();
		ro.keyPress(KeyEvent.VK_DOWN);
		ro.keyRelease(KeyEvent.VK_DOWN);
		
	//	ro.keyPress(KeyEvent.VK_DOWN);
	//	ro.keyRelease(KeyEvent.VK_DOWN);
		
		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement electronic = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]"));
		ac.contextClick(electronic).build().perform();
		
		ro.keyPress(KeyEvent.VK_DOWN);
		ro.keyRelease(KeyEvent.VK_DOWN);
		
	//	ro.keyPress(KeyEvent.VK_DOWN);
	//	ro.keyRelease(KeyEvent.VK_DOWN);
		
		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);
		
		Set<String> id = driver.getWindowHandles();
		
		for (String str : id) {
			String title = driver.switchTo().window(str).getTitle();
			System.out.println(title);
			
			String myTitle="Electronics Store: Buy Electronics products Online at Best Prices in India at Amazon.in";
			
			for (String str1 : id) {
				if (driver.switchTo().window(str1).getTitle().equals(myTitle)) {
					break;			
				}
					
			}
		}
		}
}
