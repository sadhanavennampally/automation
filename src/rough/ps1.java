package rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ps1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\DELL\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.com");
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
	driver.findElement(By.id("nav-search-submit-button")).click();
	
	}

}
