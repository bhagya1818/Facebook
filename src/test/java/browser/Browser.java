package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	
	public static WebDriver openChromeBrowser() {
		
		//System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\chromedriver_win32\\chromedriver.exe");
	   
		//System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\New Crome\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\New Crome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
	    return driver;
	    
	}
	
    public static WebDriver openFireFoxBrowser() {
		
    	System.setProperty("webdriver.gecko.driver", "E:\\Automation Testing\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    return driver;
	}
	
    
}
