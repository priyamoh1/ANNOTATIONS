package test;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.ActitimeHomePage;
import pom.createleavetype;

public class logincaltlogout extends BaseTest
{
@Test
public void lcltl() throws InterruptedException
{
	ActitimeHomePage clt1=new ActitimeHomePage(driver);
	clt1.leavetype();
	
	createleavetype clt=new createleavetype(driver);
	clt.createaleavetype();
}
}
