package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		//singleframe
		driver.switchTo().frame("singleframe");
		driver.findElement(By.tagName("input")).sendKeys("Rashmi");
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		//driver.switchTo().parentFrame();  //This can be used also
		
		//Iframe with in an Iframe
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		Thread.sleep(4000);
		driver.switchTo().frame(1);
		driver.switchTo().frame(0);
		driver.findElement(By.tagName("input")).sendKeys("Rashmi");
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		
		//get no of iframes
		int n=driver.findElements(By.tagName("iframe")).size();
		System.out.println("The no i frames are"+n);
		
	}

}
