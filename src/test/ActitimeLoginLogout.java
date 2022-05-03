package test;

import org.testng.Reporter;
import org.testng.annotations.Test;
import generics.BaseTest;

public class ActitimeLoginLogout extends BaseTest
{
	@Test
	public void login()
	{
		Reporter.log("test method is executed" , true);
	}
}