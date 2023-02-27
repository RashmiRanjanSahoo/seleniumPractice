package TestNgDemo;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import PageFactoryDemo.Home_Page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Using_XML {
private static WebDriver driver;
	
	@BeforeTest
	void setup() {
		driver = WebDriverManager.chromedriver().create();
		driver.get("https://demo.automationtesting.in/");
		driver.manage().window().maximize();
	}
	
	@Test
	void loginTest() throws InterruptedException {
		Home_Page hp=new Home_Page(driver);
		hp.fillEmail("rsrrasmi@gmail.com");
		hp.clickNext();
		Thread.sleep(4000);	
	}
}
