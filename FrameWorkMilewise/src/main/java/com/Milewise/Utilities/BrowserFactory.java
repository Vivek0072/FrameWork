package com.Milewise.Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class BrowserFactory {

	public static WebDriver startApp(WebDriver driver,String BrowserName,String Url) {
		
		
		if(BrowserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Vivek\\eclipse-workspace3\\FrameWorkMilewise\\src\\Drivers\\chromedriver.exe");
			 driver=new ChromeDriver();
		}
		
		else if (BrowserName.equals("FireFox"))
				
				{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Vivek\\eclipse-workspace3\\FrameWorkMilewise\\src\\Drivers\\geckodriver.exe");
			 driver=new FirefoxDriver();
				}
		else 
		{System.out.println("Sorry we dont support this Browser");}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Url);
		driver.manage().window().maximize();
		Reporter.log("driver returned",true);
		return driver;
		
		
	}
	 

	
	public static void  quitBrowserMethod(WebDriver driver)
	{
		
		driver.quit();
		
	}
}
