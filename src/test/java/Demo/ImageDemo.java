package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		String altlink = driver.findElement(By.xpath("(//img[@src='original.png'])[1]")).getAttribute("alt");
		System.out.println("The value of alt attribute is "+altlink);
		driver.findElement(By.xpath("(//img[@src='original.png'])[1]")).click();
		Thread.sleep(4000);
		
		String redirectedUrl = driver.getCurrentUrl();
		System.out.println("Redirected URL is "+redirectedUrl);
		Assert.assertEquals("https://demo.automationtesting.in/Register.html#google_vignette", redirectedUrl);
	}
}
