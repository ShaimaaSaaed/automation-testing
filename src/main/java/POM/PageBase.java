package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class PageBase {

	protected WebDriver driver ;
	public JavascriptExecutor js;

	// create constructor 
	public PageBase(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.js = (JavascriptExecutor) driver;
	}
	
	public void ScrollToElement(WebElement element) {
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	
}
