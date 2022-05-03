package test;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.ActitimeHomePage;
import pom.createacustomerr;

public class acticreateclogout extends BaseTest
{
@Test
public void lccl() throws InterruptedException
{
	ActitimeHomePage cac1=new ActitimeHomePage(driver);
	cac1.newuser();
	
	createacustomerr cac=new createacustomerr(driver);
	cac.createacustomer1();
	
}
}
