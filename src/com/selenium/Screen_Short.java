package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen_Short {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karthik ravi\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://about.facebook.com/meta/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		TakesScreenshot ts= (TakesScreenshot) driver;
File src = ts.getScreenshotAs(OutputType.FILE);
		File des =new File("C:\\Users\\karthik ravi\\eclipse-workspace\\Selenium_Concepts\\screenshot//facebook.png");
		FileUtils.copyFile(src, des);
		
		driver.navigate().to("https://www.youtube.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		TakesScreenshot ki= (TakesScreenshot) driver;
		File src1 = ki.getScreenshotAs(OutputType.FILE);
		File des2=new File("C:\\Users\\karthik ravi\\eclipse-workspace\\Selenium_Concepts\\screenshot//youtube.png");
		FileUtils.copyFile(src1, des2);
		
		
	}
}
