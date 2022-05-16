package com.johndeere.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1OpenEMR {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.facebook.com/");

	
	Thread.sleep(2000);
	String title= driver.getTitle();
	System.out.println(title);
	
	String url=driver.getCurrentUrl();
	System.out.println(url);
	
	String pageSource= driver.getPageSource();
	System.out.println(pageSource);
	
	driver.findElement(By.id("email")).sendKeys("hello@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("welcome123");
	
	driver.findElement(By.name("login")).click();
	//driver.close();
	
}
}
