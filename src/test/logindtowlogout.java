package test;

import java.awt.AWTException;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.ActitimeHomePage;
import pom.deletetypeofwork;

public class logindtowlogout extends BaseTest
{
@Test
public void ldtowl() throws InterruptedException, AWTException
{
	ActitimeHomePage dc=new ActitimeHomePage(driver);
	dc.createtypeofwork();
	
	deletetypeofwork dtw=new deletetypeofwork(driver);
	dtw.deletetoww();
}
}
