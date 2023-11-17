package practice;

import org.openqa.selenium.WebDriver;

 
import org.openqa.selenium.edge.EdgeDriver;

public class getpagesource {
public static void main(String[]args)
{
	System.setProperty("webdriver.edge.driver","C:\\Users\\DELL\\Downloads\\edgedriver_win32\\msedgedriver.exe");
WebDriver driver=new EdgeDriver();
driver.get("https://www.flipkart.com//");
String A=driver.getPageSource();
System.out.println(A);


}
}
