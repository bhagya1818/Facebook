package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	
	@FindBy (xpath = "//input[@type='text']")
	private WebElement emailOrPhoneNo;
	
	@FindBy (xpath = "//input[@type='password']")
	private WebElement password;
	
	@FindBy (xpath = "//button[@value='1']")
	private WebElement logInButton;
	
	@FindBy (xpath = "(//a[contains(text(),'Forgotten password?')])[1]")
	private WebElement forgotMessage;
	
	@FindBy (xpath = "(//a[@role='button'])[2]")
	private WebElement createNewAcc;
	
	
	
	public LogInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendEmailOrPhoneNo(String user) {
		emailOrPhoneNo.sendKeys(user);
		
	//	emailOrPhoneNo.sendKeys("bhagyashripatil00@gmail.com");
		//String userValue = emailOrPhoneNo.getText();
	}
	
	public void sendPassword(String pass) {
		password.sendKeys(pass);
		//password.sendKeys("vrunda1234");
		//String pass = password.getText();
	}
	
	public void clickOnLoginButton() {
		logInButton.click();
	}
	
	public void clickOnForgotPasswordButton() {
		forgotMessage.click();
		
	}
	
	public void clickOnCreateNewAcc() {
		createNewAcc.click();
	}
	
	public void verifyTextBox()
	{
		String userValue = emailOrPhoneNo.getText();
		//userValue = emailOrPhoneNo.getAttribute(userValue);
		System.out.println(userValue);
		String pass = password.getText();
		System.out.println(pass);
		
		String expectedVallue = "bhagyashripatil00@gmail.com";
		String expectedPass = "vrunda1234";
		
		if(userValue.equals(expectedVallue) && pass.equals(expectedPass))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		/*String userValue = emailOrPhoneNo.getText();
		String pass = password.getText();
		if(emailOrPhoneNo == null )
		{
			System.out.println("Please Enter Email");
			System.out.println("Fail");
		}
		else
		{
			if(password == null)
			{
				System.out.println("Please Enter Password");
				System.out.println("Fail");
			}
			System.out.println("PASS");
		}
		System.out.println("PASS");
		*/
	}
	

}
