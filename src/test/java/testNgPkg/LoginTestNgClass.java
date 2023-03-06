package testNgPkg;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import browser.Browser;
import pomClasses.LogInPage;
import utils.Utility;

public class LoginTestNgClass {
	
	WebDriver driver;
	@Parameters("browser")
	
	@BeforeClass
	public void openBrowser(String browserName)
	{
		System.out.println("Open Browser");	
		if(browserName.equals("Chrome"))
		{
		//System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\chromedriver_win32\\chromedriver.exe");
	   // driver = new ChromeDriver();
			driver = Browser.openChromeBrowser();
		}
		
		
		if(browserName.equals("Firefox"))
		{
			
		//System.setProperty("webdriver.gecko.driver", "E:\\Automation Testing\\geckodriver.exe");
	    //driver = new FirefoxDriver();
			driver = Browser.openFireFoxBrowser();
	    
		}
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		/*System.out.println("Before Class");
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
	}
	
	@BeforeMethod
	public void loginPage()
	{
		System.out.println("Before Method");
		driver.get("https://www.facebook.com/");
		
		
	}
	
	@Test
	public void verifyLoginPage() throws EncryptedDocumentException, IOException
	{
		LogInPage logInPage = new LogInPage(driver);
		
		//Utility.getExcelData(String sheet,int rowNo, int cellNo)
		
		//String user = Utility.getExcelData("Sheet2", 1, 0);
		
		logInPage.sendEmailOrPhoneNo(Utility.getExcelData("Sheet2", 1, 0));
		
		//String pass = Utility.getExcelData("Sheet2", 1, 1);
		
		logInPage.sendPassword(Utility.getExcelData("Sheet2", 1, 1));
		//logInPage.verifyTextBox();
		logInPage.clickOnLoginButton();
		
	}
	
	@Test 
	public void verifyTextBoxMethod()
	{
		LogInPage logInPage = new LogInPage(driver);
		logInPage.verifyTextBox();
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		System.out.println("After Method");
		//driver.close();
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class");
		driver.quit();
	}
	

}
