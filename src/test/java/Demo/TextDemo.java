package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		String txt = driver.findElement(By.id("footer")).getText();
		System.out.println(txt);  //@ 2016"Automation Testing"All Rights Reserved.
		Thread.sleep(4000);
	}
}
