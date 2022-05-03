package test;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.ActitimeHomePage;
import pom.edittypeofwork;

public class logineditltlogout extends BaseTest
{
@Test
public void ldltl() throws InterruptedException
{
	ActitimeHomePage clt1=new ActitimeHomePage(driver);
	clt1.leavetype();
	
	
	edittypeofwork edtw=new edittypeofwork(driver);
	edtw.edittaypeofwork();
}
}
