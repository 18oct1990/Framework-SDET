package Appeal.TestCases;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;


import Appeal.TestUtilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readconfig =new ReadConfig();

	public String baseURL=readconfig.getbaseURL();
	public String Username=readconfig.getusername();
	public String Password=readconfig.getpassword();
	public String Captcha=readconfig.getcaptcha();
	public static WebDriver driver;
	public static Logger logger;

@Parameters("browser")
@BeforeClass
public void Setup(String br)

{
	
	logger = Logger.getLogger("Appeal");
	PropertyConfigurator.configure("Log4j.properties");
	
	if (br.equals("chrome"))
	{
	// ./ is used to get the path of root class
		System.setProperty("webdriver.chrome.driver",readconfig.getchromepath());
		driver=new ChromeDriver();
		
	}
	
	else if (br.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver",readconfig.getfirefoxpath());
		driver=new FirefoxDriver();
	}
}

@AfterClass
public void tearDown()
{
	driver.quit();
}

public void captureScreen(WebDriver driver, String tname) throws IOException
{
	TakesScreenshot ts= (TakesScreenshot) driver;
	File source= ts.getScreenshotAs(OutputType.FILE);
	File target= new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
	FileUtils.copyFile(source, target);
}



}