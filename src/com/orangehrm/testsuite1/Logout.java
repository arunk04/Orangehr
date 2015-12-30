package com.orangehrm.testsuite1;


	import org.openqa.selenium.server.browserlaunchers.Sleeper;
	import org.openqa.selenium.support.PageFactory;
	import org.testng.annotations.Test;

	public class Logout extends Contants {
		@Test
		public void logtest()
		{
			Menu menu=PageFactory.initElements(driver,Menu.class);
			Sleeper.sleepTightInSeconds(5);
			menu.logout();
		}
	}



