package Demo;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowserDemo {

	public static void main(String[] args) throws InterruptedException {
		//		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		//		WebDriver driver=new ChromeDriver();
		//		driver.get("https://app.kalingahospital.com/kalingahospital/");
		//		Thread.sleep(1000);

		// Using WebDriverManager

		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://app.kalingahospital.com/kalingahospital/");
		Thread.sleep(1000);
	}
}
