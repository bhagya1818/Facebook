package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyPolicyPage {
	@FindBy (xpath ="(//a[@role='button'])[2]")
	private WebElement createNewAccButton;
	
	@FindBy (xpath = "//a[@id='terms-link']")
	private WebElement verifyTerms;
	
	@FindBy (xpath = "//a[@id='privacy-link']")
	private WebElement verifyPrivacyPolicy;
	
	@FindBy (xpath = "//a[@id='cookie-use-link']")
	private WebElement verifyCookiePolicy;
	
	public VerifyPolicyPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnCreateNewAccButton()
	{
		createNewAccButton.click();
	}
	
	public void clickOnVerifyTerms()
	{
		verifyTerms.click();
	}
	
	public void ClickOnVerifyPrivacyPolicy()
	{
		verifyPrivacyPolicy.click();
	}
	
	public void ClickOnVerifyCookiePolicy()
	{
		verifyCookiePolicy.click();
	}

}
