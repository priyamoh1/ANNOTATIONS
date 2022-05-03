package test;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.ActitimeHomePage;
import pom.deleteacustomer;

public class deleteacandlogout extends BaseTest
{
@Test
public void ldcl() throws InterruptedException
{
	ActitimeHomePage dc=new ActitimeHomePage(driver);
	dc.newuser();
	
	deleteacustomer dc1=new deleteacustomer(driver);
	dc1.deletec();
	
}
}
