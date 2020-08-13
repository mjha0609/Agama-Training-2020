package com.testcase;



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ackage com.TestCase;
		package com.TestCase;

		import java.io.File;
		import java.io.IOException;
		import java.util.concurrent.TimeUnit;

		import org.apache.commons.io.FileUtils;
		import org.openqa.selenium.By;
		import org.openqa.selenium.OutputType;
		import org.openqa.selenium.TakesScreenshot;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.Select;

		import io.github.bonigarcia.wdm.WebDriverManager;

		public class WrapperMethod {
			WebDriver driver;
			public void insertapp(String url)
			{
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				driver.get(url);
				}

		public void enterbyid(String val,String name)
		{
		driver.findElement(By.id(val)).sendKeys(name);
			}

			public void enterbyxapth(String val2, String name2)
			{
				driver.findElement(By.xpath(val2)).sendKeys(name2);

			}
