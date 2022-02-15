package org.base;

import java.awt.AWTException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {
	
public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\Actions1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("http://demo.automationtesting.in/Alerts.html");
		 driver.manage().window().maximize();
		 
	//simple
	 WebElement simpleInsertion = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	 simpleInsertion.click();
	 Thread.sleep(5000);
	 
     //Alert
	 Alert simpleAlert =driver.switchTo().alert();
	 simpleAlert.accept();
	 Thread.sleep(4000);

	 //conform
	 WebElement confirmInsertion = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel '] "));
	 confirmInsertion.click();
	 WebElement confirmButton = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	 confirmButton.click();
	 Thread.sleep(5000);
	 
	 //alert
	 Alert confirmAlert = driver.switchTo().alert();
	 confirmAlert.dismiss();
	 Thread.sleep(3000);
	 
	 //prompt
	 WebElement promptInsertion = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
	 promptInsertion.click();
	 WebElement promptButton = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
	 promptButton.click();
	 Thread.sleep(5000);
	 
	 //Alerts
	 Alert promptAlert = driver.switchTo().alert();
	 promptAlert.sendKeys("Akshyx");
	 promptAlert.accept();
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	
	
	
	
	
	
	
	

}}
