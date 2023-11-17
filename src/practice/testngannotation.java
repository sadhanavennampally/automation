package practice;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testngannotation {
	@BeforeClass
	public void B()
	{
		Reporter.log("launch the browser",true);
	}
	@BeforeMethod
	public void C()
	{
		Reporter.log("log in to app",true);
	}
	@Test
	public void D()
	{
		Reporter.log("main test case",true);
	}
	@AfterClass
	public void F()
	{
		Reporter.log("Close the browser",true);
	}
	@AfterMethod
	public void I()
	{
		Reporter.log("log out the app",true);
	}
	@BeforeSuite
	public void A()
	{
		Reporter.log("database connection",true);
	}
	@AfterSuite
	public void E()
	{
		Reporter.log("database disconnection",true);
	}
		
	}


