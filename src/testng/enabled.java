package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class enabled {
	@Test(enabled=false)
	public void a1()
	{
		Reporter.log("hello",true);
	}
		@Test
		public void a2()
		{
			Reporter.log("hii",true);
		}
	}


