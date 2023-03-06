package testNgPkg;
import utils.Utility;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import browser.Browser;
import pomClasses.LogInPage;
import pomClasses.VerifyPolicyPage;
import utils.Utility;

public class NewPolicyTestNgClass extends Browser {
	
  WebDriver driver;
 private String TestId;
 private SoftAssert softAssert;
	
	@Parameters("browser")
	//@Parameters("browser") 
	
	@BeforeTest
	public void openBrowser(String browserName) {
		
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
		
		
	}
	
	@BeforeMethod
	public void LoginOrSignUpPage()
	{
		System.out.println("Before Method");
		driver.get("https://www.facebook.com/");
		LogInPage logInPage = new LogInPage(driver);
		logInPage.clickOnCreateNewAcc();
	}
	
	@Test 
	public void verifyTermsLink()
	{
		 String TestId = "T12302";
		System.out.println("Test_1");
		VerifyPolicyPage verifyPolicyPage = new VerifyPolicyPage(driver);
		verifyPolicyPage.clickOnVerifyTerms();
		
		ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(1));
		
		String actualUrl = driver.getCurrentUrl();
		String actualTitle = driver.getTitle();
		
		String expectedUrl = "https://www.facebook.com/legal/terms/update";
		String expectedTitle = "Facebook";
		
		Assert.assertEquals(actualUrl, expectedUrl);
		
		softAssert.assertEquals(actualTitle, expectedTitle);
		softAssert.assertAll();
	/*	if(actualUrl.equals(expectedUrl)&& actualTitle.equals(expectedTitle))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("Fail");
		}*/
		
	}
	
	@Test //(priority=-1 ,invocationCount=3)
	
	public void verifyPrivacyPolicy( )
	{
		  String TestId = "T12301";
		System.out.println("Test_2");
		
		VerifyPolicyPage verifyPolicyPage = new VerifyPolicyPage(driver);
		verifyPolicyPage.ClickOnVerifyPrivacyPolicy();
		
		ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(1));
		
		String actualUrl = driver.getCurrentUrl();
		String actualTitle = driver.getTitle();
		
		String expectedUrl = "https://www.facebook.com/privacy/policy/?entry_point=data_policy_redirect&entry=0";
		String expectedTitle = "Meta Privacy Policy – How Meta collects and uses user data | Privacy Centre | Manage your privacy on Facebook, Instagram and Messenger | Facebook Privacy";
		
		Assert.assertEquals(actualUrl,expectedUrl);
		
		softAssert.assertEquals(actualTitle, expectedTitle);
		softAssert.assertAll();
		
		/*if(actualUrl.equals(expectedUrl)&& actualTitle.equals(expectedTitle))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("Fail"+TestId);
		}*/
		
	}
	
	@Test
	public void verifyCookiePolicy()
	{
		 String TestId = "T12303";
		System.out.println("Test_3");
		
		VerifyPolicyPage verifyPolicyPage = new VerifyPolicyPage(driver);
		verifyPolicyPage.ClickOnVerifyCookiePolicy();
		
		ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(1));
		
		String actualUrl = driver.getCurrentUrl();
		String actualTitle = driver.getTitle();
		
		String expectedUrl = "https://www.facebook.com/privacy/policies/cookies/?entry_point=cookie_policy_redirect&entry=0";
		//String expectedTitle = "Meta Cookies Policy | Privacy Centre | Manage your privacy on Facebook, Instagram and Messenger | Facebook Privacy";

		
		String expectedTitle = "Meta Cookies Policy | Privacy Centre | Manage your privacy on Facebook, Instagram and Messenger ";
		
        Assert.assertEquals(actualUrl,expectedUrl);
		
		softAssert.assertEquals(actualTitle, expectedTitle);
		softAssert.assertAll();
		
		
		/*if(actualUrl.equals(expectedUrl)&& actualTitle.equals(expectedTitle))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("Fail");
		}*/
		
		
	}
	
	
	@AfterMethod
	public void closeCurrentTab(ITestResult result) throws IOException 
	{
		
		if(ITestResult.FAILURE == result.getStatus())
		{
			
			Utility.getScreenShot(TestId);
			
			
			//Utility.getScreenShot(TestId);
		}
		System.out.println("After Method");
		driver.close();
		ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(0));
	}
	
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test");
		driver.quit();
	}
	
	
	

}
