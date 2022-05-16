package com.johndeere.basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.grid.Main;
import org.openqa.selenium.support.ui.Select;

public class Demo3FBsignoff {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.facebook.com/");
	
	
	driver.findElement(By.linkText("Create New Account")).click();
	driver.findElement(By.name("firstname")).sendKeys("Rasmi");
	driver.findElement(By.name("lastname")).sendKeys("Perua");
	driver.findElement(By.name("reg_email__")).sendKeys("87932329");
	driver.findElement(By.id("password_step_input")).sendKeys("welcome@123");
	driver.findElement(By.xpath("//input[@value='1']")).click();
	
	Select selectDay=new Select(driver.findElement(By.id("day")));
	selectDay.selectByVisibleText("30");
	
	Select selectMonth=new Select(driver.findElement(By.id("month")));
	selectMonth.selectByVisibleText("Jan");
	
	Select selectYear=new Select(driver.findElement(By.id("year")));
	selectYear.selectByVisibleText("1992");
	driver.findElement(By.name("websubmit")).click();

}
}
