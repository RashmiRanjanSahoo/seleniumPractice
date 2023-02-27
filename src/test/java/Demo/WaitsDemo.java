package Demo;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitsDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		//its applicable whenever we want irrespective of webelement available or nor, it will wait for a foxed duration of time.
		Thread.sleep(2000);
		
		//Implicit wait
		//Its applicable for all the webelement present on the page, and it will wait till the webelement gets load, 
		//and it will not wait if the webelement is already present
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		
		//Explicit wait
		//Its applicable for a particular web element for a certain condition
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[@claaa='btn']")));
		driver.findElement(By.xpath("//button[@claaa='btn']")).click();
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		
		//Fluent Wait
		// the web driver to wait for a condition, as well as the frequency with which we want to check the condition
		FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver)
							.withTimeout(Duration.ofSeconds(2))
							.pollingEvery(Duration.ofMinutes(1))
							.ignoring(Exception.class);
		
		fwait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[@claaa='btn']")));
		fwait.until(ExpectedConditions.alertIsPresent());
		
		
		}

}
