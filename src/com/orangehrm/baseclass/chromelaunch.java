package com.orangehrm.baseclass;

import org.openqa.selenium.chrome.ChromeDriver;

public class chromelaunch {
	public static void main(String[] args){
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://google.com");
	}

}
