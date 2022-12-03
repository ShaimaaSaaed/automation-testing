package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterAndLoginPage extends PageBase {

	public RegisterAndLoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css ="input[data-qa='signup-name']")
	WebElement SignUpName;
	
	@FindBy(css="input[data-qa='signup-email']")
	WebElement SignUpEmail;
	
	@FindBy(css ="button[data-qa='signup-button']")
	WebElement SignUpBtn;
	
	public void FirstRegisteration(String Name , String Email)
	{
		SignUpName.sendKeys(Name);
		SignUpEmail.sendKeys(Email);
		SignUpBtn.click();
	}
	
}
