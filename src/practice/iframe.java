package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class iframe 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver","C:\\Users\\DELL\\Downloads\\edgedriver_win32\\msedgedriver.exe");
WebDriver driver=new EdgeDriver();
driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test");
driver.switchTo().frame("iframeResult");

	//driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("sadhana");
	//driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("vineela@123");
	//Thread.sleep(5000);
	//driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	}

}
