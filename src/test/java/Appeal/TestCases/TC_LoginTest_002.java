package Appeal.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Appeal.PageObjects.LoginPage;
import Appeal.TestUtilities.XLUtils;

public class TC_LoginTest_002 extends BaseClass {
	
	@Test(dataProvider="LoginData")
	public void loginDDT(String user, String pwd, String cap) throws InterruptedException, IOException
	{
		driver.get(baseURL);
		logger.info("Accessed URL");
		Thread.sleep(3000);
		
		LoginPage LP=new LoginPage(driver);
		LP.setUserName(user);
		logger.info("Entered Username");
		LP.setPassword(pwd);
		logger.info("Entered Password");
		LP.setCaptcha(cap);
		logger.info("Entered Captcha");
		LP.clickSubmit();
		logger.info("Clicked on Login button");
		
		if(driver.getTitle().equals("Goods & Services Tax (GST) | Logi"))
			{
				Assert.assertTrue(true);
				logger.info("Title got matched");				

			}
		else
			{
				captureScreen(driver,"loginDDT");
				logger.info("Title didn't got matched");	
				Assert.assertTrue(false);
						

			}
	}
	
	
	@DataProvider(name="LoginData")
	public String [] [] getData() throws IOException
	{
		
		String path=System.getProperty("user.dir")+"/src/test/java/Appeal/TestData/TestData.xlsx";
		
		int rownumber=XLUtils.getRowCount(path,"Sheet1");
		int columncount= XLUtils.getCellCount(path,"Sheet1",1);
		
		String logindata [][]= new String [rownumber][columncount];
		
		for (int i=1; i<=rownumber; i++)
		{
			for (int j=0; j<columncount; j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1",i,j); // 1 0
			}
		}
		
		return logindata;
		
		
	}

}
