package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class navigateto {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver","C:\\Users\\DELL\\Downloads\\edgedriver_win32\\msedgedriver.exe");
WebDriver driver=new EdgeDriver();
driver.navigate().to("https://www.amazon.com");
Thread.sleep(5000);
driver.navigate().to("https://www.flipkart.com");
driver.navigate().back();
Thread.sleep(5000);
driver.navigate().forward();
Thread.sleep(5000);
driver.navigate().refresh();

	}

}
