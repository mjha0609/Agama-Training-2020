package com.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LoginIntExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
System.setProperty("webdriver.ie.driver", "C:\\Users\\jhamo\\Downloads\\IEDriverServer_x64_3.150.1.exe");
 WebDriver driver = new InternetExplorerDriver();
 driver.get("https://opensource-demo.orangehrmlive.com/");
System.out.println(driver.getTitle());
driver.close();
driver.get("https://opensource-demo.orangehrmlive.com//");
driver.findElement(By.id ("txtUsername")).sendKeys("Admin");
driver.findElement(By.id("txtPassword")).sendKeys("admin123");
driver.findElement(By.xpath("//*[@id=\'u_0_b\']")).click();
	        }
	}


