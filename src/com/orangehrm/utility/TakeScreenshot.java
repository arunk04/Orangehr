package com.orangehrm.utility;
	import java.io.File;
	import java.io.IOException;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;



	public class TakeScreenshot {
		
		public void takescreenshot_method(WebDriver driver,String filename) throws IOException
			{
				File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(srcFile,new File("C:\\Users\\qedge\\Desktop\\OrangeHRM1\\OrangeHRM1\\src\\com\\orangehrm\\screenshots\\"+filename+".png"));
			}
		}

