package com.Milewise.Pages;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.Milewise.Utilities.BrowserFactory;
import com.Milewise.Utilities.ConfigDataProvider;
import com.Milewise.Utilities.ExcelDataProvider;
import com.Milewise.Utilities.UtilityHelper;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class BaseClass {

	public WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigDataProvider config;
	public ExtentReports extent;
	public ExtentHtmlReporter reporter;

	@BeforeSuite
	public void suiteSetup()
	{
		excel= new ExcelDataProvider();
		config= new ConfigDataProvider();
		reporter= new ExtentHtmlReporter("C:\\Users\\Vivek\\eclipse-workspace3\\FrameWorkMilewise\\src\\ReportsFolder\\report.html");
		extent= new ExtentReports();
		extent.attachReporter(reporter);
       
	}
	
    @Parameters("Browser")
	@BeforeClass
	public void setUp(String Browser) {
		driver = BrowserFactory.startApp(driver, Browser, config.getUrl());
		
		//driver is must u wasted 1 day for this
	}

	@AfterClass
	public void tearDown() {
		BrowserFactory.quitBrowserMethod(driver);

	}
	
//	@AfterMethod----To take screenshot irrespective of Pass/Fail
//	public void tearDownMethod() {
//		UtilityHelper.CaptureScreenShotMethod(driver);
//	}
	
	//To take screenshot only Failed condition or viceversa use Interface Itestresult
	
	@AfterMethod
	public void tearDownMethod(ITestResult result)
	{
      if (result.getStatus()==ITestResult.FAILURE)
        {
	 UtilityHelper.CaptureScreenShotMethod(driver);
        }
	Reporter.log("generating report", true);	
	    extent.flush();
      Reporter.log("report flushed", true);
	}
}
