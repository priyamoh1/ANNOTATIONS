package test;

import java.awt.AWTException;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.ActitimeHomePage;
import pom.deleteleavetype;

public class logindltlogout extends BaseTest
{
@Test
public void ldltl() throws InterruptedException, AWTException
{
	ActitimeHomePage clt1=new ActitimeHomePage(driver);
	clt1.leavetype();
	
	deleteleavetype dlt=new deleteleavetype(driver);
	dlt.deletelt();
}
}
