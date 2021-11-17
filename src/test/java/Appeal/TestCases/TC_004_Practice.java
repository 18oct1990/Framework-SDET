package Appeal.TestCases;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TC_004_Practice extends BaseClass {
	
	
	@Test
	public  void Practice()
	{
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\uat02\\eclipse-workspace\\Appeal\\Drivers\\chromedriver.exe");
	//WebDriver driver=new ChromeDriver();
	
	driver.get("https://uatr1services.gst.gov.in/services/login");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	
	Select dd= new Select(driver.findElement(By.xpath("")));
	dd.selectByValue("");;
	dd.selectByVisibleText(null);
	
	WebElement e1=driver.findElement(By.xpath(""));
	Actions action = new Actions(driver);
	action.contextClick(e1);
	
	
	Alert simpleAlert = driver.switchTo().alert();
    simpleAlert.accept();
    simpleAlert.dismiss();

	driver.switchTo().frame(0);
	driver.switchTo().parentFrame();
    

;
	}
}
	
	
	
	
