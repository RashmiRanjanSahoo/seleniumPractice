package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='checkbox'][@value='Cricket']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox'][@value='Hockey']")).click();
		Thread.sleep(4000);
	}
}
