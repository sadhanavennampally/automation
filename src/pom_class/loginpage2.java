package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class loginpage2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\DELL\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		loginpage page=new loginpage(driver)
	}

}
