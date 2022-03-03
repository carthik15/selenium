package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots1 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karthik ravi\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination =new File("C:\\Users\\karthik ravi\\eclipse-workspace\\Selenium_Concepts\\screenshot\\facebook.png");
		FileUtils.copyFile(source, destination);
		
		driver.navigate().to("https://www.instagram.com/");
		TakesScreenshot st=(TakesScreenshot) driver;
		File source1 = st.getScreenshotAs(OutputType.FILE);
		File destination1=new File("C:\\Users\\karthik ravi\\eclipse-workspace\\Selenium_Concepts\\screenshot\\instagram.png");
		FileUtils.copyFile(source1, destination1);
		
		
	}

}
