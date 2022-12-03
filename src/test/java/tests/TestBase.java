package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class TestBase {

	public static WebDriver driver ; 

	@BeforeSuite
	public void startDriver()
	{
		System.out.println("----------------------------------------");
		System.out.println(System.getProperty("os.name"));
		System.out.println("----------------------------------------");
		
		if (System.getProperty("os.name").contains("Mac OS X")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver");

		} else {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		}

		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.navigate().to("https://automationexercise.com/");
	}

	@AfterSuite
	public void stopDriver() 
	{
		driver.quit();
	}

}
