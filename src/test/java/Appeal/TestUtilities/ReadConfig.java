package Appeal.TestUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig()
	{
		File src= new File("./Configuration/Config.properties");
		
		try {
			FileInputStream fis= new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is" +e.getMessage());
		}
		
	}
	
	public String getbaseURL()
	{
		String url= pro.getProperty("baseURL");
		return url;
	}
	
	public String getusername()
	{
		String un= pro.getProperty("Username");
		return un;
	}
	
	public String getpassword()
	{
		String pwd= pro.getProperty("Password");
		return pwd;
	}
	
	public String getcaptcha()
	{
		String cap= pro.getProperty("Captcha");
		return cap;
	}
	
	public String getchromepath()
	{
		String cpath= pro.getProperty("chromepath");
		return cpath;
	}
	
	public String getfirefoxpath()
	{
		String fpath= pro.getProperty("firefoxpath");
		return fpath;
	}


}
