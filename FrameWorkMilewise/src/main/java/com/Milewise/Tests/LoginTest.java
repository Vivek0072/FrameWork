package com.Milewise.Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Milewise.Pages.BaseClass;
import com.Milewise.Pages.LoginPage;

public class LoginTest extends BaseClass  {

	
	
	@Test
	public void LoginMethodTest()
	
	{		
	LoginPage LoginPage= PageFactory.initElements(driver, LoginPage.class);
	LoginPage.loginMethod(excel.getStringData("userInfo", 0, 0),excel.getStringData("userInfo", 0, 1));			
		
	}
}
