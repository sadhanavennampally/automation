
import java.io.FileInputStream;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class miniproject {
	@BeforeSuite
	public void m1() {
		Reporter.log("database connection eshtablished",true);
	}
	@BeforeClass
	public void m2(){
		Reporter.log("launching the edge browser",true);
	}
	@BeforeMethod
	public void m3() throws Throwable {
		FileInputStream fi=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Sadhna_selenium\\abc\\credentials1.properties.txt");
		Properties p =new Properties();
		p.load(fi);
		String user=p.getProperty("un");
		System.out.println(user);
		String password=p.getProperty("pwd");
		System.out.println(password);
		String URL = p.getProperty("url");
		System.setProperty("webdriver.edge.driver","C:\\Users\\DELL\\Downloads\\edgedriver_win32\\msedgedriver.exe");

		WebDriver driver=new EdgeDriver();
		driver.get(URL);
		Thread.sleep(4000);	
		}
		@Test
		public void m4() throws Throwable {
			FileInputStream fi=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Sadhna_selenium\\abc\\credentials1.properties.txt");
			Properties p =new Properties();
			p.load(fi);
			String user=p.getProperty("un");
			System.out.println(user);
			String password=p.getProperty("pwd");
			System.out.println(password);
			String URL = p.getProperty("url");
			System.setProperty("webdriver.edge.driver","C:\\Users\\DELL\\Downloads\\edgedriver_win32\\msedgedriver.exe");

			WebDriver driver=new EdgeDriver();
			driver.get(URL);
			Thread.sleep(4000);	
			driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(user);
			driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(password);
			driver.findElement(By.xpath("//input[@id='submitButton']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[text()='Organizations']")).click();
			driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
			Random ran =new Random();
			int r=ran.nextInt(100);
			FileInputStream f=new FileInputStream("C:\\Users\\DELL\\Desktop\\Book1.xlsx");
			Workbook Wb = WorkbookFactory.create(f);
			String data=Wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
			String data1=Wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
			String data2=Wb.getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();
			String data3=Wb.getSheet("Sheet1").getRow(0).getCell(3).getStringCellValue();
			String data4=Wb.getSheet("Sheet1").getRow(0).getCell(4).getStringCellValue();
			String data5=Wb.getSheet("Sheet1").getRow(0).getCell(5).getStringCellValue();
			String data6=Wb.getSheet("Sheet1").getRow(0).getCell(6).getStringCellValue();
			driver.findElement(By.xpath("//input[@class='detailedViewTextBox']")).sendKeys(data+r);
			driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[2]")).sendKeys(data1);
			driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[4]")).sendKeys(data2);
			driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[7]")).sendKeys(data3);
			driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[9]")).sendKeys(data4);
			WebElement industry= driver.findElement(By.xpath("//select[@name='industry']"));
			Select s=new Select(industry);
			s.selectByValue(data5);
			WebElement type= driver.findElement(By.xpath("//select[@name='accounttype']"));
			Select ss=new Select(type);
			ss.selectByValue(data6);
			driver.findElement(By.xpath("//input[@name='emailoptout']")).click();
			driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
			driver.findElement(By.xpath("(//a[@class='drop_down_usersettings'])[2]")).click();
	}
}
