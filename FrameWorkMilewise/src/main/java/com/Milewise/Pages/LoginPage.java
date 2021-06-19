package com.Milewise.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Milewise.Utilities.UtilityHelper;

public class LoginPage 
{
 
WebDriver driver;
 
 
public LoginPage(WebDriver ldriver)
{
this.driver=ldriver;
}
 
@FindBy(id="nav-link-accountList") WebElement loginBtn;
@FindBy(id="ap_email") WebElement EmailTextBox;
@FindBy(id="continue") WebElement ContinuBtn;
@FindBy(id="ap_password") WebElement Password;
@FindBy(id="signInSubmit") WebElement SigInBtn;




public void loginMethod(String EmailValue,String pswd) {
	//UtilityHelper.CaptureScreenShotMethod(driver);- keep after every step in order to take screenshot for every step 
	loginBtn.click();	
	EmailTextBox.sendKeys(EmailValue);	
	ContinuBtn.click();	
	Password.sendKeys(pswd);	
	SigInBtn.click();
	
	
}

 
 
}