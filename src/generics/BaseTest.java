package generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import pom.ActitimeHomePage;
import pom.ActitimeLoginPage;

public class BaseTest 
{
	public WebDriver driver;
	
	@BeforeSuite
	public void executionstart()
	{
		Reporter.log("execution started" , true);
	}
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
	}
	
	@BeforeMethod
	public void logintoapp() throws InterruptedException
	{
		ActitimeLoginPage login=new ActitimeLoginPage(driver);
		login.loginMethod();
	}
	
	@AfterMethod
	public void logoutfromapp()
	{
		ActitimeHomePage home=new ActitimeHomePage(driver);
		home.logoutMethod();
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	
	@AfterSuite
	public void executioncomplete()
	{
		Reporter.log("execution completed" , true);
	}

}
