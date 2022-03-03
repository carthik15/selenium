package com.selenium;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Mini_project_addtocart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karthik ravi\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		signin.click();
		
	JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,200)");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("karthikgtr15@gmail.com");
		
		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("Karthik@11yoyo");
		
		WebElement login = driver.findElement(By.id("SubmitLogin"));
		login.click();
		
		jse.executeScript("window.scrollBy(0,700)");
		
		
		WebElement home = driver.findElement(By.xpath("(//a[contains(@class,'button')])[3]"));
		home.click();
		
		
		jse.executeScript("window.scrollBy(0,800)");
		
		WebElement blouse = driver.findElement(By.xpath("(//img[@title='Blouse'])[1]"));
		Actions ar=new Actions(driver);
		ar.moveToElement(blouse).build().perform();
		
		WebElement clickmore = driver.findElement(By.xpath("(//a[contains(@class,'button ')])[6]"));
		clickmore.click();
		
	//	jse.executeScript("window.scrollBy(0,500)");
	Thread.sleep(2000);	
		WebElement add = driver.findElement(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]"));
		add.click();
		
		WebElement select = driver.findElement(By.xpath("//select[contains(@class,'control ')]"));
		Select dh=new Select(select);
		dh.selectByValue("2");
		
		WebElement color = driver.findElement(By.name("White"));
		color.click();
		
		WebElement addtocart = driver.findElement(By.name("Submit"));
		addtocart.click();
		//WebElement pro = driver.findElement(By.xpath("(//a[contains(@class,'btn ')])[2]"));
		//WebElement pro = driver.findElement(By.xpath("(//a[contains(@class,'button ')])[2]"));
		//WebElement pro = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a"));
		WebElement pro = driver.findElement(By.xpath("(//a[@rel='nofollow'])[6]"));
		//WebElement pro = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		pro.click();
		
		
	//	jse.executeScript("window.scrollBy(0,-100)");
		
		
	//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	//	WebElement clickproceed = driver.findElement(By.xpath("(//a[@rel='nofollow'])[6]"));
	//	ar.doubleClick(clickproceed).build().perform();
		
	//	jse.executeScript("window.scrollBy(0,-100)");
		
      
		//WebElement drop = driver.findElement(By.xpath("//select[contains(@class,'control ')]"));
	//	Select as=new Select(drop);
		 
	//	as.selectByValue("2");
	
		
		//WebElement contiune = driver.findElement(By.xpath("//span[contains(@class,'continue ')]"));
	//	contiune.click();
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//	 WebElement add = driver.findElement(By.xpath("(//a[@data-field-qty='qty'])[2]"));
	//	 add.click();
		
		
		
		
	}

}
