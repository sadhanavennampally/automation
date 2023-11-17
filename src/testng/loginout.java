package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class loginout {
	@Test
	public void a1()
	{
		Reporter.log("hii login",true);
	}
	@Test(dependsOnMethods = {"a2"})
	public void a2()
	{
		Reporter.log("hello logout",true);
	}

}
