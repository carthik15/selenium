package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karthik ravi\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		
		System.out.println("****************all data**************");
		
		List<WebElement> alldata = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for (WebElement all : alldata) {
			String text = all.getText();
			System.out.println(text);
		}
		
		
		System.out.println("************particular row*************");
		
		List<WebElement> row = driver.findElements(By.xpath("//table/tbody/tr[2]/td"));
		for (WebElement parrow : row) {
			String text1 = parrow.getText();
			System.out.println(text1);
			
		}
		System.out.println("*************particular cell***********");
		WebElement roco = driver.findElement(By.xpath("//table/tbody/tr[4]/td[6]"));
		String text = roco.getText();
		System.out.println(text);
		
		
		System.out.println("**********column************");
		List<WebElement> column = driver.findElements(By.xpath("//table/tbody/tr/td[6]"));
		for (WebElement webElement : column) {
			String text2 = webElement.getText();
			System.out.println(text2);
		}
		
		
		System.out.println("**********header****");
		List<WebElement> headerr = driver.findElements(By.tagName("th"));
		for (WebElement header : headerr) {
			String text2 = header.getText();
			System.out.println(text2);
		}
		
		
			
		}
			
			
		
			
		
		
		
		
	}


