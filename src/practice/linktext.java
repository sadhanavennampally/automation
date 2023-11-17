package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class linktext {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\DELL\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.linkText("https://mail.google.com/mail/&ogbl")).click();
		
	}

}
