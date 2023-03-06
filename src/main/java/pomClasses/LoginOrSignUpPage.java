package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginOrSignUpPage {
	
	@FindBy (xpath = "(//a[@role='button'])[2]")
	private WebElement signUpButton;
	
	@FindBy (xpath = "//input[@name='firstname']")
	private WebElement firstName;
	
	@FindBy (xpath = "//input[@name='lastname']")
	private WebElement lastName;
	
	@FindBy (xpath = "//input[@name='reg_email__']")
	private WebElement email;
	
	@FindBy (xpath = "//input[@name=\"reg_email_confirmation__\"]")
	private WebElement confirmEmail;
	
	@FindBy (xpath = "(//input[@type='password'])[2]")
	private WebElement password;
	
	@FindBy (xpath = "//select[@name='birthday_day']")
	private WebElement birthDay;
	
	@FindBy (xpath = "//select[@name='birthday_month']")
	private WebElement birthMonth;
	
	@FindBy (xpath = "//select[@name='birthday_year']")
	private WebElement birthYear;
	
	@FindBy (xpath = "(//input[@name='sex'])[1]")
	private WebElement women;
	
	@FindBy (xpath = "//button[@name='websubmit']")
	private WebElement submitButton;
	
	//Constructor call
	public LoginOrSignUpPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSignUpButton()
	{
		signUpButton.click();
	}
	
	public void sendFirstName()
	{
		firstName.sendKeys("Vrunda");
	}
	
	public void sendLastName()
	{
		lastName.sendKeys("Kadam");
	}
	
	public void sendPassword()
	{
		password.sendKeys("Kadam");
	}
	
	public void sendEmail()
	{
		email.sendKeys("bhagya18@gmail.com");
	}
	
	public void sendEmailAgain()
	{
		confirmEmail.sendKeys("bhagya18@gmail.com");
	}
	
	public void sendBirthDetails()
	{
		Select s = new Select(birthDay);
		s.selectByValue("18");
		birthMonth.sendKeys("January");
		birthYear.sendKeys("1992");
		
	}
	
	public void selectGender()
	{
		 boolean result1 = women.isSelected();
		 if(result1==true)
		 {
			 System.out.println(result1);
			 System.out.println("Selected");
		 }
		 else
		 {
			 System.out.println(result1);
			 System.out.println("Not Selected");
			 women.click();
		 }
		 result1 = women.isSelected();
		 System.out.println(result1);
	}
	
	public void clickOnSubmitButton()
	{
		submitButton.click();
	}
	
	

}
