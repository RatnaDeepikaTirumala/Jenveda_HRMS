package com.MSME.HRMS.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.MSME.HRMS.Util.TestUtil;

public class BaseClass {
	
	public static WebDriver driver;
	public static Properties prop;

	
	public BaseClass() {
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("D:/Projects/Testing/Jenveda/src/main/java/com/MSME/"
					+ "/HRMS/Config/config.Properties"); 				
			prop.load(ip);
			//D:\Projects\Testing\Jenveda\src\main\java\com\MSME\HRMS\Config\config.Properties
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();	
		}
	}
	
	@SuppressWarnings("deprecation")
	public static void initialization() {
		String browsername = prop.getProperty("browser");
		if(("chrome").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:/Projects/chromedriver-win64/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browsername.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:/Testing/Projects/Tetsing/MSME/Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
	
	}
	
	
 	
}
