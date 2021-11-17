package Appeal.TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Appeal.PageObjects.APL01;
import Appeal.PageObjects.LoginPage;

public class TC_Apl01_003 extends BaseClass {
	
	
	@Test
	public void appeal() throws InterruptedException
	{
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
		
		
		
		//Thread.sleep(3000);
		
		APL01 AP=new APL01(driver);
		AP.setUserName(Username);
		
		AP.setPassword(Password);
	
		AP.setCaptcha(Captcha);
		
		AP.clickSubmit();
		
		Thread.sleep(3000);
		
		String Actual=driver.getTitle();
		
		System.out.println(Actual);
		
		//String Expected="GSTN";
		
		//Assert.assertEquals(Actual, Expected, "Title does not match");
	
		
		Thread.sleep(3000);
		
		//AP.clickServices();
		
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		WebElement userser;
		//userser= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//a[@data-ng-show=\"udata && (udata.role == 'login'||udata.role == 'panLogin')\"]")));
		//userser.click();
		
		//Thread.sleep(3000);
		
		
		Actions action = new Actions(driver);
		WebElement element1=driver.findElement(By.xpath("//a[@data-ng-show=\"udata && (udata.role == 'login'||udata.role == 'panLogin')\"]"));
		WebElement element2=driver.findElement(By.xpath("//*[@id=\"main\"]/ul/li[2]/ul/li[6]/a[2]"));
		//action.moveToElement(element).click().perform();
		//action.doubleClick(element).perform();
		
		//action.clickAndHold(element).perform();
		
		//action.contextClick(element).perform();
		//System.out.println("Click & hold performed");
		
		List<WebElement> elements = driver.findElements(By.name("menuList"));
		 System.out.println("Number of elements:" +elements.size());
		 
		 for (int i=0; i<elements.size();i++)
		 {
		      System.out.println("Elements are" + elements.get(i).getAttribute("value"));
		 }
		 
		 
		
		
		
		action.dragAndDrop(element1, element2).build().perform();
		
		
		
		Thread.sleep(4000);
		
		//AP.clickMyapp();
		
		//Thread.sleep(3000);
		
		
				
		
		

		
	}
	
	
	

}
