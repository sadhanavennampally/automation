package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class timeout {
	@Test
	public void a1() {
	Reporter.log("i am saadhana",true);
}
@Test(timeOut=10000)
public void a2() {
Reporter.log("hii",true);
}}	


