package com.orangehrm.testsuite1;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class AddEmployee extends Contants{
	@Test
	public void AddEmployee1() throws IOException
	{
		AddEmployeePage addemp=PageFactory.initElements(driver, AddEmployeePage.class);
		int rowcount=eo.getRowCount(emplist, 0);
		String runmode=eo.getCellData(dataengine,0,2,2);
		if(runmode.equals("N"))
		{
			throw new SkipException("AddEmpl test case skipped");
		}
		else
		{

		for(int i=1;i<=rowcount;i++)
		{
			Row r=eo.getrow(emplist,0,i);
			Sleeper.sleepTight(2);
			addemp.menu.pim();
			Sleeper.sleepTight(5);
			addemp.AddEmployee.click();
			Sleeper.sleepTight(5);
			addemp.AddEmployee1(r);
		}
	 }
	
	}
}
