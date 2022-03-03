package com.selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_hotelbooking {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karthik ravi\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("benz1596");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Karthik@1996");
		
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		
		WebElement locations = driver.findElement(By.id("location"));
		Select se=new Select(locations);
		se.selectByIndex(2);
		
		WebElement hotels = driver.findElement(By.name("hotels"));
		Select se1=new Select (hotels);
		se1.selectByVisibleText("Hotel Cornice");
		
		WebElement typesofrooms = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select se2=new Select(typesofrooms ); 
		se2.selectByVisibleText("Super Deluxe");
		
		WebElement noofrooms = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select se3=new Select(noofrooms);
		se3.selectByValue("1");
		
		WebElement checkin = driver.findElement(By.xpath("//*[@id=\"datepick_in\"]"));
		checkin.sendKeys("12/02/2022");
		
		WebElement checkout = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		checkout.sendKeys("15/02/2022");
		
		WebElement adults = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select se4=new Select(adults);
		se4.selectByValue("1");
		
		WebElement childs = driver.findElement(By.xpath("//*[@id=\"child_room\"]"));
		Select se5=new Select(childs);
		se5.selectByValue("1");
		
		WebElement search = driver.findElement(By.id("Submit"));
		search.click();
		
		WebElement radiobutton = driver.findElement(By.xpath("//input[@type='radio']"));
		radiobutton.click();
		
		WebElement continueb = driver.findElement(By.id("continue"));
		continueb.click();
		
		WebElement first = driver.findElement(By.xpath("//input[@name='first_name']"));
		first.sendKeys("karthik");
		
		WebElement last = driver.findElement(By.xpath("//input[@name='last_name']"));
		last.sendKeys("ravi");
		
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("no19/20 north kavaristreet,westmambalam,chennai-33");
		
		WebElement credit = driver.findElement(By.xpath("//*[@id=\"cc_num\"]"));
		credit.sendKeys("2547896321456254");
		
		WebElement credittype = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select se6=new Select(credittype);
		se6.selectByValue("MAST");
		
		WebElement month = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select se7=new Select(month);
		se7.selectByVisibleText("March");
		
		WebElement years = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select se8=new Select(years);
		se8.selectByIndex(11);
		
		WebElement cvv = driver.findElement(By.xpath("(//input[@type='text'])[14]"));
		cvv.sendKeys("287");

		WebElement book = driver.findElement(By.xpath("(//input[@type='button'])[1]"));
		book.click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		TakesScreenshot tss=(TakesScreenshot)driver;
		File source = tss.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\karthik ravi\\eclipse-workspace\\Selenium_Concepts\\screenshot\\hotel.png");
		FileUtils.copyFile(source, destination);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
