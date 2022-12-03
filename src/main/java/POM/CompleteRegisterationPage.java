package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CompleteRegisterationPage extends PageBase{

	public CompleteRegisterationPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="id_gender1")
	WebElement MrGender;
	
	@FindBy(id="id_gender2")
	WebElement MrsGender;
	
	@FindBy(id="name")
	WebElement Name;
	
	@FindBy(id="email")
	WebElement Email;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(id="days")
	WebElement Days;
	
	@FindBy(id="months")
	WebElement Months;
	
	@FindBy(id="years")
	WebElement Years;
		
	@FindBy(id="first_name")
	WebElement FName;
	
	@FindBy(id="last_name")
	WebElement LName;
	
	@FindBy(id="company")
	WebElement Company;
	
	@FindBy(id="address1")
	WebElement Address1;
	
	@FindBy(id="address2")
	WebElement Address2;
	
	@FindBy(id="country")
	WebElement Country;
	
	@FindBy(id="state")
	WebElement State;
	
	@FindBy(id="city")
	WebElement City;
	
	@FindBy(id="zipcode")
	WebElement ZipCode;

	@FindBy(id="mobile_number")
	WebElement MobileNumber;
	
	@FindBy(css ="button[data-qa='create-account']")
	WebElement CreateBtn;
				
	
	public void CompleteRegisteration(String password,String day,String month, String year, String fName, String lName, String company,
			String address1, String address2,String country, String state, String city, String zipcode, String mobileNumber)
	{
		MrsGender.click();
		Password.sendKeys(password);
		Select days = new Select(Days);
		days.selectByValue(day);
		Select months = new Select(Months);
		months.selectByVisibleText(month);
		Select years = new Select(Years);
		years.selectByValue(year);
		FName.sendKeys(fName);
		LName.sendKeys(lName);
		Company.sendKeys(company);
		Address1.sendKeys(address1);
		Address2.sendKeys(address2);
		Select countries = new Select(Country);
		countries.selectByValue(country);
		State.sendKeys(state);
		City.sendKeys(city);
		ZipCode.sendKeys(zipcode);
		MobileNumber.sendKeys(mobileNumber);
		ScrollToElement(CreateBtn);
		CreateBtn.click();
	}
	

	public String GetName()
	{
		String name = Name.getAttribute("value");
		return name;
	}
	
	public String GetEmail()
	{
		String email = Email.getAttribute("value");
		return email;
	}
	
}
