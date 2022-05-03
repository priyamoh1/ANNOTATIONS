package test;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.ActitimeHomePage;
import pom.createtypeofwork;

public class loginctowlogout extends BaseTest
{
@Test
public void lctowl() throws InterruptedException
{
	ActitimeHomePage dc=new ActitimeHomePage(driver);
	dc.createtypeofwork();
	
	createtypeofwork ct=new createtypeofwork(driver);
	ct.createtyeofwork();
}
}
