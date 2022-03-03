package com.selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mini_project3 {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karthik ravi\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");

		driver.manage().window().maximize();
		
		//addtocart1

		WebElement womenTab = driver.findElement(By.xpath("//a[@title='Women']"));

		Actions ac = new Actions(driver);
		ac.moveToElement(womenTab).build().perform();

		WebElement casual = driver.findElement(By.xpath("//a[@title='Casual Dresses']"));
		casual.click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement dress = driver.findElement(By.xpath("//a[@title='Printed Dress']"));
		ac.moveToElement(dress).build().perform();

		WebElement add = driver.findElement(By.xpath("//a[@title='Add to cart']"));
		ac.click(add).build().perform();

		WebElement proceed = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a"));
		proceed.click();
		
		
		//addtocart 2
		
		WebElement clickon = driver.findElement(By.xpath("//a[@title='Continue shopping']"));
		clickon.click();
		
		WebElement clickont = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
		clickont.click();
		
		WebElement moveon = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li"));
	
		ac.moveToElement(moveon).build().perform();
		
		WebElement addto = driver.findElement(By.xpath("//a[@title='Add to cart']"));
		addto.click();
		
		WebElement check = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		check.click();
		
		WebElement finalpro = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		finalpro.click();
		
		 
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("karthikgtr15@gmail.com");
		
		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("Karthik@11yoyo");
		
		WebElement login = driver.findElement(By.id("SubmitLogin"));
		login.click();
		
		WebElement addre = driver.findElement(By.name("processAddress"));
		addre.click();
		
		WebElement agree = driver.findElement(By.id("cgv"));
		agree.click();
		
		WebElement ship = driver.findElement(By.name("processCarrier"));
		ship.click();
		
		WebElement clickpay = driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a"));
		clickpay.click();
		
		WebElement confirm = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		confirm.click();

	//	JavascriptExecutor js=(JavascriptExecutor)driver;
	//	js.executeScript("window.scrollBy(0,400)");
		
	//	TakesScreenshot ts=(TakesScreenshot)driver;
	//	File source=ts.getScreenshotAs(OutputType.FILE);
	//	File destination=new File("C:\\Users\\karthik ravi\\eclipse-workspace\\Selenium_Concepts\\screenshot\\take.png");
	//	FileUtils.copyFile(source, destination);
	
		
		
		
		
		
		
		
		
		
		
		

	}

}
