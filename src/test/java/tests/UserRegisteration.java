package tests;

import org.testng.annotations.Test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import com.github.javafaker.Faker;

import POM.AccountCreatedPage;
import POM.CompleteRegisterationPage;
import POM.HomePage;
import POM.RegisterAndLoginPage;

import io.qameta.allure.Story;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;

@Epic("Regression Tests")
@Feature("User Registration Test")
public class UserRegisteration extends TestBase
{

	HomePage HomeObject;
	RegisterAndLoginPage SignupandLoginObject ;
	CompleteRegisterationPage CompleteRegObject;
	AccountCreatedPage CreatedAccountObject;

	
	@DataProvider(name="testData")
	public static Object[][] userData()
	{
		Faker fakerData = new Faker();

		String Name = fakerData.name().firstName();
		String Email = fakerData.name().firstName()+"@gmail.com";
		String password =fakerData.number().digits(8).toString();
		String day = "7";
		String month = "March";
		String year = "1992";
		String firstName=fakerData.name().firstName();
		String lastName=fakerData.name().lastName();
		String company = fakerData.company().name();
		String address1=fakerData.address().firstName();
		String address2=fakerData.address().lastName();
		String country="Canada";
		String state=fakerData.address().state();
		String city=fakerData.address().city();
		String zipCode=fakerData.address().zipCode()	;
		String mobileNumber=fakerData.phoneNumber().cellPhone();
		
		return new Object[][] {
			{Name, Email,password,day,month,year,firstName,lastName,company,address1,address2,country,state,city,zipCode,mobileNumber}
			};
	}
	
	@Test(priority = 1, dataProvider ="testData")
	@Description("Test Description: Registration test with random data.")
	@Story("Valid data registration")
	public void UserCanRegister(String name,String email, String password, String day,String month,String year,String firstName,String lastName,
			String company,String address1,String address2, String country,String state,String city, String zipCode,String mobileNumber)
	{
		HomeObject = new HomePage(driver);
		HomeObject.ClickSignUp();
		SignupandLoginObject = new RegisterAndLoginPage(driver);
		SignupandLoginObject.FirstRegisteration(name, email);
		CompleteRegObject = new CompleteRegisterationPage(driver);

		String EnteredName = CompleteRegObject.GetName();
		String EnteredEmail = CompleteRegObject.GetEmail();
		System.out.println(EnteredName);
		System.out.println(EnteredEmail);
		Assert.assertEquals(EnteredName, name);
		Assert.assertEquals(EnteredEmail, email);
		
		CompleteRegObject.CompleteRegisteration(password, day, month, year, firstName, lastName, company, address1, address2, country, state, city, zipCode, mobileNumber);
		
		CreatedAccountObject = new AccountCreatedPage(driver);
		
		String SuccessMsg = CreatedAccountObject.GetSuccessMsg();
		System.out.println(SuccessMsg);
		Assert.assertEquals(SuccessMsg, "ACCOUNT CREATED!");
		Assert.assertTrue(SuccessMsg.contains("ACCOUNT CREATED!"));
	}
	
	@Test(priority = 2)
	public void Logout()
	{
		CreatedAccountObject.ClickContinue();
		HomeObject.ClickLogout();
		String Signuptext = HomeObject.GetSignUpTxt();
		System.out.println(Signuptext);
		Assert.assertEquals(Signuptext, "Signup / Login");
	}
	

}
