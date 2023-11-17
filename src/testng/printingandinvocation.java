package testng;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class printingandinvocation {
@Test
public void m1() {
	Reporter.log("hii");
}
@Test(invocationCount=10)
public void one() {
	Reporter.log("hello",true);
	Assert.fail();
	
}
}
