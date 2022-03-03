package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_pratices_program {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\karthik ravi\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//WebElement alert1 = driver.findElement(By.xpath("//a[contains(@class,'categories')][1]"));
		//alert1.click();
		WebElement simple = driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
		simple.click();
		Alert simple1 = driver.switchTo().alert();
		simple1.accept();
		
		WebElement confirm = driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
		confirm.click();
		Alert confirm1 = driver.switchTo().alert();
		confirm1.dismiss();
		
		WebElement prompt = driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
		prompt.click();
		Thread.sleep(2000);
		Alert prompt1 = driver.switchTo().alert();
		prompt1.sendKeys("seleinum with java");
		String text = prompt1.getText();
		System.out.println(text);
		prompt1.dismiss();
		
		
	}

}
