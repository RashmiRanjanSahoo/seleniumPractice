package PageFactoryDemo;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Home_Test {

	private static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = WebDriverManager.chromedriver().create();
		driver.get("https://demo.automationtesting.in/");
		driver.manage().window().maximize();
		
		Home_Page hp=new Home_Page(driver);
		hp.fillEmail("rsrrasmi@gmail.com");
		hp.clickNext();
		Thread.sleep(4000);	
	}
}
