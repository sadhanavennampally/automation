package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class hiddenpops {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","C:\\Users\\DELL\\Downloads\\edgedriver_win32\\msedgedriver.exe");

		WebDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
	driver.findElement(By.xpath("//span[@role='button']")).click();
	}

}
