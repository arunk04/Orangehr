package com.orangehrm.testsuite1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class LoginPage extends Contants {
	@FindBy(id="txtUsername")
	WebElement username;
	@FindBy(id="txtPassword")
	WebElement password;
	@FindBy(id="btnLogin")
	WebElement login;
	
	public void loginpage1(String u,String p)
	{
		username.sendKeys(u);
		password.sendKeys(p);
		login.click();
	}

}
