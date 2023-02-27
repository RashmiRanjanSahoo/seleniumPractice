package POM_Demo_Test;

import org.openqa.selenium.WebDriver;

import POM_DEMO_Pages.ContactUs_Page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ContactUs_Test {

	private static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.globalsqa.com/contact-us/");
		driver.manage().window().maximize();
		
		ContactUs_Page cup=new ContactUs_Page(driver);
		cup.fillUserName("Rashmi");
		cup.fillEmail("rsrrasmi@gmail..com");
		cup.fillSubject("PAGE OBJECT MODEL");
		cup.clickOnSend();
		Thread.sleep(4000);

	}
}
