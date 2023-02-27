package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextAreaDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("LLIGG #@/a,  HB Colony, CHANDRASEKHAR PUR Ph-1, Bhubanreswat 751016");
		String addr = driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).getAttribute("value");
		System.out.println("The Address is "+addr);
		Thread.sleep(3000);
	}
}
