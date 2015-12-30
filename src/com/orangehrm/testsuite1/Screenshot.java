package com.orangehrm.testsuite1;

	import java.io.IOException;

	import org.testng.annotations.Test;

	public class Screenshot extends Contants {
		
			@Test
			public void Screenshot1() throws IOException
			{
//				 scr.takescreenshot_method(driver,"Addemp");
				scr.takescreenshot_method(driver, "path12");
				 
			}
					
	}

	


