package Firstpro;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClasses.ForgotPasswordPage;
import pomClasses.LogInPage;
import pomClasses.LoginOrSignUpPage;

public class TextClass {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		/*ForgotPasswordPage forgotPasswordPage = new  ForgotPasswordPage(driver);
		forgotPasswordPage.getTextMessage();
		forgotPasswordPage.sendEmailOrPhoneNo();
		forgotPasswordPage.clickOnSearchButton();
		forgotPasswordPage.clickOnCancelButton();*/
		
		LogInPage logInPage = new LogInPage(driver);
		/*logInPage.sendEmailOrPhoneNo();
		logInPage.sendPassword();
		logInPage.clickOnLoginButton();
		//logInPage.clickOnForgotPasswordButton();
		//logInPage.clickOnCreateNewAcc();*/
		
		logInPage.clickOnForgotPasswordButton();
		ForgotPasswordPage forgotPasswordPage = new  ForgotPasswordPage(driver);
		forgotPasswordPage.getTextMessage();
		forgotPasswordPage.searchButtonClick();
		//forgotPasswordPage.sendForgotPassword();
		//forgotPasswordPage.clickOnLoginButtonn();
		//forgotPasswordPage.clickOnSubmitButton();
		//forgotPasswordPage.clickOnSearchButton();
		//forgotPasswordPage.clickOnCancelButton();*/
		
		/*LoginOrSignUpPage loginOrSignUpPage = new LoginOrSignUpPage(driver);
		loginOrSignUpPage.clickOnSignUpButton();
		loginOrSignUpPage.sendFirstName();
		loginOrSignUpPage.sendLastName();
		loginOrSignUpPage.sendEmail();
		loginOrSignUpPage.sendEmailAgain();
		loginOrSignUpPage.sendPassword();
		loginOrSignUpPage.sendBirthDetails();
		loginOrSignUpPage.selectGender();
		loginOrSignUpPage.clickOnSubmitButton();*/
		
		
		
	}

}
