package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountCreatedPage extends PageBase {

	public AccountCreatedPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css ="h2[data-qa='account-created']")
	WebElement CreatedMsg;
	
	@FindBy(linkText = "Continue")
	WebElement ContinueBtn;
	
	public String GetSuccessMsg()
	{
		String msg = CreatedMsg.getText();
		return msg;
	}
	
	public void ClickContinue()
	{
		ContinueBtn.click();
	}
}
