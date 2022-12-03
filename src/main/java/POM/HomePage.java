package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(linkText="Signup / Login")
	WebElement SignUp ; 
	
	@FindBy(linkText = "Logout")
	WebElement Logout;
	
	public void ClickSignUp()
	{
		SignUp.click();
	}
	
	public void ClickLogout() {
		Logout.click();
	}
	
	public String GetSignUpTxt()
	{
		String SignupTxt = SignUp.getText();
		return SignupTxt;
	}

}
