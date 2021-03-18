/**
 * 
 */
package com.SwadeshMart.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * @author Nana
 *This class contains starting application  & closing Application
 */
public class BrowserFactory {
	
	public static WebDriver startApplication(WebDriver driver,String browername,String appUrl )
	{
		if(browername.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		}
		else if(browername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);	
		}
		else if(browername.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.io.driver", ".//Drivers//EIE11_EN-US_MCM_WIN764.EXE");
			driver=new InternetExplorerDriver();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);	
		}
		else {
			System.out.println("This Browser is not compatible");
		}
		driver.get(appUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
	
	public static void quitBrowser(WebDriver driver) {
		driver.quit();
	}

}
