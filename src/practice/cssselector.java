package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class cssselector {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\DELL\\Downloads\\edgedriver_win32\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.facebook.com");
	driver.findElement(By.cssSelector("input[type='text']")).sendKeys("admin");
	driver.findElement(By.cssSelector("input[type='password']")).sendKeys("manager");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
			
	}

}
