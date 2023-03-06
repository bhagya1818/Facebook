package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ForgotPasswordPage {
	
	
	@FindBy (xpath = "//div[contains(text(),'Please enter your email address or mobile number to search for your account.')]")
	private WebElement forgotMessage;
	
	@FindBy (xpath = "//input[@type='text']")
	private WebElement emailOrPhoneNo;
	
	//@FindBy (xpath = "//input[@type='password']")
	//private WebElement forgotPassword;
	
	@FindBy (xpath = "//button[@type='submit']")
	private WebElement searchButton;
	
	//@FindBy (xpath = "//button[@value='1']")
	//private WebElement logInButton;
	
	@FindBy (xpath = "(//a[@role='button'])[1]")
	private WebElement cancelButton;
	
	public ForgotPasswordPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void getTextMessage() {
	String text	= forgotMessage.getText();
	System.out.println(text);
	}
	
	public void sendEmailOrPhoneNo() {
		emailOrPhoneNo.sendKeys("bhagyashripatil00@gmail.com");
	}
	
	public void searchButtonClick()
	{
		searchButton.click();
	}
	

	public void clickOnCancelButton() {
		cancelButton.click();
	}
	
	
	/*public void clickOnLoginButtonn() {
		logInButton.click();
	}*/
	
	
	
	
	
	
	
	
	

}
