package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Mini_Project {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karthik ravi\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		
		WebElement signin = driver.findElement(By.xpath("//a[@rel='nofollow']"));
		signin.click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		WebElement emailid = driver.findElement(By.id("email_create"));
		emailid.sendKeys("karthikgtr15@gmail.com");
		
		WebElement clickbutton = driver.findElement(By.id("SubmitCreate"));
		clickbutton.click();
		Thread.sleep(2000);
		
		WebElement radio = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		
		radio.click();
		WebElement frist = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		frist.sendKeys("karthik");
		
		WebElement last = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		last.sendKeys("ravi");
		
		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("Karthik@11yoyo");
		
		js.executeScript("window.scrollBy(0,300)");
		
		WebElement day = driver.findElement(By.id("days"));
		Select s=new Select(day);
		s.selectByValue("17");
		
		WebElement months = driver.findElement(By.id("months"));
		Select s1=new Select(months);
		s1.selectByIndex(11);
		
		WebElement years = driver.findElement(By.id("years"));
		Select s2=new Select(years);
		s2.selectByVisibleText("1996  ");
		
		WebElement first1 = driver.findElement(By.id("firstname"));
		first1.sendKeys("karthik");
		
		WebElement last1 = driver.findElement(By.id("lastname"));
		last1.sendKeys("ravi");
		
		WebElement address = driver.findElement(By.id("address1"));
		address.sendKeys("no 51/98 jones road");
		
		js.executeScript("window.scrollBy(0,600)");
		
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("dallas");
		
		WebElement state = driver.findElement(By.xpath("(//select[contains(@class,'form')])[4]"));
		Select s3=new Select(state);
		s3.selectByIndex(43);
		
		WebElement postalcode = driver.findElement(By.id("postcode"));
		postalcode.sendKeys("75001");
		
		WebElement ph_no = driver.findElement(By.xpath("(//input[@type='text'])[13]"));
		ph_no.sendKeys("9677527091");
		
		WebElement submit = driver.findElement(By.id("submitAccount"));
		submit.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
