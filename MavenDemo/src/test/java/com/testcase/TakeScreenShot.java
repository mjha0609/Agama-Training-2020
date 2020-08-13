package com.testcase;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenShot {

//TODO Auto-generated method stub
              public static void main(String[] args) throws IOException {
	                   // TODO Auto-generated method stub

	           WebDriverManager.chromedriver().setup();
	           WebDriver driver = new ChromeDriver();
	           driver.manage().window().maximize();
	           driver.get("https://www.facebook.com/");
	           TakesScreenshot ts = (TakesScreenshot) driver;
	            File source = ts.getScreenshotAs(OutputType.FILE);
	            FileUtils.copyFile(source, new File(("src/test/resources/ScreenShot/screenshot.png")));

	   }
	           
	       }
	           
	           
	           
	           
	           
	           
	           
	