package Demo;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicLocatorsDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("nav-logo-sprites")).click();
		driver.findElement(By.name("nav-logo")).click();
		driver.findElement(By.className("nav-progressive-content")).click();
		driver.findElement(By.cssSelector("#nav-logo-sprites")).click();
		driver.findElement(By.xpath("//div[@id='nav-logo']")).click();
		driver.findElement(By.linkText("Today's Deals")).click();
		driver.findElement(By.partialLinkText("Today's")).click();
		List<WebElement> AnchorCount = driver.findElements(By.tagName("a"));
		Thread.sleep(3000);
	}
}
