package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	//declaration
@FindBy(xpath="//input[@type='text']")private WebElement emailtxt;
@FindBy(xpath="//input[@type='password']")private WebElement pwdxt;
@FindBy(xpath="//button[@value='1']")private WebElement loginBtn;
//initialization
public loginpage(WebDriver driver)
{
 PageFactory.initElements(driver,this);
}
//utilization
public WebElement getUntxt() {
	return emailtxt;
}
public WebElement getPwdxt() {
	return pwdxt;
}
public WebElement getLoginBtn() {
	return loginBtn;
}
}
