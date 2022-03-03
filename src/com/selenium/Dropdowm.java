package com.selenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowm {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karthik ravi\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.leafground.com/");
driver.manage().window().maximize();
Thread.sleep(3000);
WebElement Dropdowm = driver.findElement(By.xpath("(//a[contains(@class,'categories')])[5]"));
Dropdowm.click();
System.out.println("**** single dropdown ****");

WebElement sel1 = driver.findElement(By.id("dropdown1"));
Select s=new Select(sel1);
boolean multiple = s.isMultiple();
System.out.println("this dropdown is multiple:"+multiple);
s.selectByValue("1");

WebElement sel2 = driver.findElement(By.name("dropdown2"));
Select s2=new Select(sel2);
s2.selectByIndex(2);

WebElement sel3 = driver.findElement(By.id("dropdown3"));
Select s3= new Select(sel3);
s3.selectByVisibleText("UFT/QTP");

WebElement sel4 = driver.findElement(By.xpath("//select[@class='dropdown']"));
Select s4=new Select(sel4);
List<WebElement> list = s4.getOptions();
for (WebElement list1 : list) {
	String tex = list1.getText();
	System.out.println(tex);
	
}
System.out.println("***** multiple dropdown *****");

WebElement sel5 = driver.findElement(By.xpath("(//select)[6]"));
Select s5=new Select(sel5);
boolean multiple2 = s5.isMultiple();
System.out.println(multiple2);
s5.selectByIndex(1);
s5.selectByValue("3");
s5.selectByVisibleText("Loadrunner");
System.out.println("*** getoption ***");

List<WebElement> list2 = s5.getOptions();
for (WebElement list3 : list2) {
	String tex2 = list3.getText();
	System.out.println(tex2);	
}

System.out.println("*** getallselectoption ***");
List<WebElement> selectedOptions = s5.getAllSelectedOptions();
for (WebElement selectedOptions1 : selectedOptions) {
	String text = selectedOptions1.getText();
	System.out.println(text);
	
}
s5.deselectAll();

System.out.println("*** getfirstselectoption ***");
WebElement firstSelectedOption = s5.getFirstSelectedOption();
String text = firstSelectedOption.getText();
System.out.println(text);








	}

}
