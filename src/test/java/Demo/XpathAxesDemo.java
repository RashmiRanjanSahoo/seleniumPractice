package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAxesDemo {
	public static void main(String[] args) {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//self
		driver.findElement(By.xpath("//div[@id='nav-xshop-container']/self::div")).click();
		//parent
		driver.findElement(By.xpath("//div[@id='nav-xshop-container']/parent::div")).click();
		//child
		driver.findElement(By.xpath("//div[@id='nav-xshop-container']/child::div")).click();
		//ancestor
		driver.findElements(By.xpath("//div[@id='nav-xshop-container']/ancestor::div"));
		//descendant
		driver.findElements(By.xpath("//div[@id='nav-xshop-container']/descendant::a"));
		//following
		driver.findElements(By.xpath("//a[@data-csa-c-content-id='nav_cs_mobiles']/following::a"));
		//following-sibling
		driver.findElements(By.xpath("//a[@data-csa-c-content-id='nav_cs_mobiles']/following-sibling::a"));
		//preceding
		driver.findElements(By.xpath("//a[@data-csa-c-content-id='nav_cs_mobiles']/preceding::a"));
		//preceding-sibling
		driver.findElements(By.xpath("//a[@data-csa-c-content-id='nav_cs_mobiles']/preceding-sibling::a"));
		//ancestor-or-self
		driver.findElements(By.xpath("//div[@id='nav-xshop-container']/ancestor-or-self::div"));
		//descendant-or self
		driver.findElement(By.xpath("//div[@id='nav-xshop-container']/descendant-or-self::div"));
	}	
}
