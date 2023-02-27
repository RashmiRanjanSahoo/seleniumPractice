package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TextBoxDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop");
		Thread.sleep(4000);
		WebElement Tb_Searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		Tb_Searchbox.clear();
		StringBuffer sb=new StringBuffer().append("Mobiles");
		Tb_Searchbox.sendKeys(sb);
		Thread.sleep(4000);
		Tb_Searchbox.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		String text1 = driver.findElement(By.id("twotabsearchtextbox")).getAttribute("value");
		System.out.println("The text on the searchbox is "+text1);
	}
}
