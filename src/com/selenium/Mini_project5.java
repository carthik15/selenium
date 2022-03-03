package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mini_project5 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karthik ravi\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		signin.click();
		
	//	JavascriptExecutor jse= (JavascriptExecutor)driver;
	//	jse.executeScript("window.scrollBy(0,200)");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("karthikgtr15@gmail.com");
		
		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("Karthik@11yoyo");
		
		WebElement login = driver.findElement(By.id("SubmitLogin"));
		login.click();
		
	//	jse.executeScript("window.scrollBy(0,700)");
		
		
		WebElement home = driver.findElement(By.xpath("(//a[contains(@class,'button')])[3]"));
		home.click();
		
		WebElement clickonwomen = driver.findElement(By.xpath("//a[@title='Women']"));
		clickonwomen.click();
		
	//	jse.executeScript("window.scrollBy(0,1500)");
		
		WebElement find = driver.findElement(By.xpath("(//li[contains(@class,'col')])[33]"));
		Actions are= new Actions(driver);
		are.moveToElement(find).build().perform();
		
		WebElement clickmore = driver.findElement(By.xpath("(//a[@title='View'])[6]"));
		clickmore.click();
		
	//	jse.executeScript("window.scrollBy(0,500)");
		
		WebElement select = driver.findElement(By.xpath("//select[contains(@class,'form')]"));
		Select s1=new Select(select);
		s1.selectByValue("2");
		
		WebElement addto = driver.findElement(By.name("Submit"));
		addto.click();
		Thread.sleep(2000);
		WebElement clickcon = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a"));
		clickcon.click();
	}

}
