package Appeal.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="username")
	WebElement Username;
	
	@FindBy(id="user_pass")
	WebElement Password;
	
	@FindBy(id="captcha")
	WebElement Captcha;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement Login;
	
	public void setUserName(String uname)
	{
		Username.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		Password.sendKeys(pwd);
	}
	
	public void setCaptcha(String cap)
	{
		Captcha.sendKeys(cap);
	}
	
	public void clickSubmit()
	{
		Login.click();
	}
}
	
	
