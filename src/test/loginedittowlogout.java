package test;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.ActitimeHomePage;
import pom.edittypeofwork;

public class loginedittowlogout extends BaseTest
{
@Test
public void letowl() throws InterruptedException
{
	ActitimeHomePage dc=new ActitimeHomePage(driver);
	dc.createtypeofwork();
	
	edittypeofwork etw=new edittypeofwork(driver);
	etw.edittaypeofwork();
}
}
