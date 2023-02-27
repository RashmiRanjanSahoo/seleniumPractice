package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathDemo {

	public static void main(String[] args) {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//using any attribute valve
		driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).click();
		//using multiple attribute
		driver.findElement(By.xpath("//span[@id='logo-ext'][@class='nav-sprite nav-logo-ext nav-progressive-content']")).click();
		//using parent child (/)
		driver.findElement(By.xpath("//div[@id='nav-logo']/a/span")).click();
		//indexing ([n])
		driver.findElement(By.xpath("//a[@class='nav-a  '][3]")).click();
		//text()
		driver.findElement(By.xpath("//a[text()='Customer Service']")).click();
		//contains()
		driver.findElement(By.xpath("//a[contains(text(),'Customer Service')]")).click();
		//position()
		driver.findElement(By.xpath("//a[@class='nav-a  '][position()=4]")).click();
		//starts-with()
		driver.findElement(By.xpath("//a[starts-with(text(),'Mobiles')]")).click();
		//OR operator (or)
		driver.findElement(By.xpath("//a[@class='nav-a  'or @data-csa-c-content-id='nav_cs_mobiles']")).click();
		//AND operator (and)
		driver.findElement(By.xpath("//a[@class='nav-a  'and @data-csa-c-content-id='nav_cs_mobiles']")).click();
	}
}
