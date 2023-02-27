package POM_DEMO_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUs_Page {

	WebDriver driver=null;
	//constructor is required to initialize the webDriver instance when we want to create the object of it.
	public ContactUs_Page(WebDriver driver) {
		this.driver=driver;
	}
	
	//locating webElements
	By ContactUs_Page_TxtName=By.id("comment_name");
	By ContactUs_Page_TxtEmail= By.name("email");
	By ContactUs_Page_TxtSubject= By.xpath("//input[@placeholder='Subject']");
	By ContactUs_Page_BtnSend = By.name("submit");
	
	//Methods to perform actions on webElements
	
	public void fillUserName(String name) {
		driver.findElement(ContactUs_Page_TxtName).sendKeys(name);
	}
	
	public void fillEmail(String email) {
		driver.findElement(ContactUs_Page_TxtEmail).sendKeys(email);
	}
	
	public void fillSubject(String sub) {
		driver.findElement(ContactUs_Page_TxtSubject).sendKeys(sub);
	}
	public void clickOnSend() {
		driver.findElement(ContactUs_Page_BtnSend).click();
	}
	
	
}
