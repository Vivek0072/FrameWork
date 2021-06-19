package com.Milewise.Utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityHelper {
	
	
	
	public static void CaptureScreenShotMethod(WebDriver driver) {
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			
		 FileHandler.copy(src, new File("C:\\Users\\Vivek\\eclipse-workspace3\\FrameWorkMilewise\\src\\Screenshots\\MW Screenshot_"+getcurrentDateTime()+".png"));
		  System.out.println("Screenshot captured");
		
		} catch (Exception e) {
			System.out.println("unable to take screenshot error: "+e.getMessage());
		}
		
	}
	
	
	
	public static String getcurrentDateTime() {
		DateFormat df = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		
		Date currentDate = new Date();
		return df.format(currentDate);
		
	}

}
