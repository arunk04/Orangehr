package com.orangehrm.testsuite1;

//import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.orangehrm.utility.ExcelOperations;
import com.orangehrm.utility.TakeScreenshot;

public class Contants {

 static RemoteWebDriver driver=null;
	ExcelOperations eo=new ExcelOperations();
	TakeScreenshot scr=new TakeScreenshot();
	String emplist="C:\\Users\\qedge\\Desktop\\OrangeHRM1\\OrangeHRM1\\src\\com\\orangehrm\\excelfiles\\EmployeeList.xlsx";
	String path1="C:\\Users\\qedge\\Desktop\\OrangeHRM1\\OrangeHRM1\\src\\com\\orangehrm\\screenshots";
	String dataengine="C:\\Users\\qedge\\Desktop\\OrangeHRM1\\OrangeHRM1\\src\\com\\orangehrm\\dataengine\\DataEngine.xlsx";
}