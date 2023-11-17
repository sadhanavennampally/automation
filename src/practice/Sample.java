package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Sample {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver","C:\\Users\\DELL\\Downloads\\edgedriver_win32\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	Thread.sleep(5000);
	driver.get("https://www.google.com");
	//get the title of webpage
	String tit = driver.getTitle();
	System.out.println(tit);


}
}
