package Appeal.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Appeal.PageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	
	@Test
public void loginTest() throws InterruptedException
	{
		driver.get(baseURL);
		logger.info("Accessed URL");
		
		Thread.sleep(3000);
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserName(Username);
		logger.info("Entered UserName");		
		lp.setPassword(Password);
		logger.info("Entered Password");		
		lp.setCaptcha(Captcha);
		logger.info("Entered Captcha");		

		lp.clickSubmit();
		logger.info("Clicked on Login button");				
		String Title=driver.getTitle();
		
		if(driver.getTitle().equals("Goods & Services Tax (GST) | Login"))
			{
					Assert.assertTrue(true);
					logger.info("Title got matched");				

			}
		else
			{
					Assert.assertTrue(false);
					logger.info("Title didn't got matched");				

			}
	}
	

	}

