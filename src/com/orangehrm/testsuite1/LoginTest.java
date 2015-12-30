package com.orangehrm.testsuite1;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest extends Contants {
	@Parameters("browser")
@Test
public void loginTest1(String b) throws IOException
{
DesiredCapabilities cap=null;
		if(b.equals("firefox"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
		else if(b.equals("chrome"))
		{
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
		}
		driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.get("http://opensource.demo.orangehrm.com/");
		  LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
		String runmode=eo.getCellData(dataengine,0,1,2);
		if(runmode.equals("N"))
		{
			throw new SkipException("Login test case skipped");
		}
		else
		{
			lp.loginpage1("Admin","admin");
			System.out.println("sasa");
		}
		

	


        }
	}
