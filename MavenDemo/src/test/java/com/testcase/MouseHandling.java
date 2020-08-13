package com.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class MouseHandling {

public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.xpath("//input[@id = \'txtUsername\']")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	
	//Click submit button
	driver.findElement(By.xpath("//input[@name=\'Submit\' and @id=\'btnLogin\']")).click();
	
	WebElement admin = driver.findElement(By.xpath("//*[@id=\'menu_admin_viewAdminModule\']"));
	
	WebElement qualification = driver.findElement(By.id("menu_admin_Qualifications"));
	WebElement languages = driver.findElement(By.id("menu_admin_viewLanguages"));
	Actions action = new Actions(driver);
	
	//action.moveToElement(admin).click().perform();
	action.moveToElement(admin).perform();
	Thread.sleep(1000);
	action.moveToElement(qualification).perform();
	action.moveToElement(languages).click().build().perform();

	}

}
