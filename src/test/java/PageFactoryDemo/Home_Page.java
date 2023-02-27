package PageFactoryDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
WebDriver driver=null;

	@FindBy(id="email")
	WebElement HomePage_TxtEmail;
	
	@FindBy(id="enterimg")
	WebElement HomePage_BtnNext;
	
	//The constructor will initialize the driver instance and also webElements.
		public Home_Page(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
	public void fillEmail(String email) {
		HomePage_TxtEmail.sendKeys(email);
	}
	
	public void clickNext() {
		HomePage_BtnNext.click();
	}
}
