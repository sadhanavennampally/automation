package practice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class getcurrent{
	

	 
	
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\DELL\\Downloads\\edgedriver_win32\\msedgedriver.exe");

		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com");
		//get the title of webpage
		String tit = driver.getCurrentUrl();
		System.out.println(tit);

	}
	}



