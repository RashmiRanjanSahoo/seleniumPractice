package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".btn.btn-danger")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Alert with OK & Cancel")).click();
		driver.findElement(By.cssSelector(".btn.btn-primary")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".btn.btn-primary")).click();
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Alert with Textbox")).click();
		driver.findElement(By.cssSelector(".btn.btn-info")).click();
		String txt = driver.switchTo().alert().getText();
		System.out.println("The text in alert box is "+txt);
		driver.switchTo().alert().sendKeys("Rashmi");
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
	}
	
}
