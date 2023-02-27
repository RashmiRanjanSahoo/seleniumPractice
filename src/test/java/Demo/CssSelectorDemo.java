package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelectorDemo {

	public static void main(String[] args) {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//Using ID
		driver.findElement(By.cssSelector("#nav-logo-sprites")).click();
		//Using class
		driver.findElement(By.cssSelector(".nav-left")).click();
		//using multiple classes
		driver.findElement(By.cssSelector(".nav-logo-link.nav-progressive-attribute")).click();
		//Using any attribute
		driver.findElement(By.cssSelector("a[data-csa-c-content-id='nav_cs_mobiles']")).click();
		//using multiple attribute
		driver.findElement(By.cssSelector("a[data-csa-c-content-id='nav_cs_mobiles'][class='nav-a  ']")).click();
		//using Parent child (>)
		driver.findElement(By.cssSelector("#nav-xshop>a")).click();
		//contains (*)
		driver.findElement(By.cssSelector("a[data-csa-c-content-id*='cs_mob']")).click();
		//starts with (^)
		driver.findElement(By.cssSelector("a[data-csa-c-content-id*='nav_cs_mo']")).click();
		//Ends with ($)
		driver.findElement(By.cssSelector("a[data-csa-c-content-id$='cs_mobiles']")).click();
		//:first-of-type
		driver.findElement(By.cssSelector("#nav-xshop>a:first-of-type")).click();
		//:last-of-type
		driver.findElement(By.cssSelector("#nav-xshop>a:last-of-type")).click();
		//:nth-of-type(n)
		driver.findElement(By.cssSelector("#nav-xshop>a:nth-of-type(3)")).click();
		//sibling of element(+)
		driver.findElement(By.cssSelector("#nav-xshop>a:nth-of-type(3)+a")).click();
		//OR operation(,)
		driver.findElement(By.cssSelector("a[data-csa-c-content-id='nav_cs_mobiles'],[data-csa-c-content-id='nav_cs_help']"));
		//NOT operation (:not())
		driver.findElement(By.cssSelector(".nav-a:not([data-csa-c-content-id='nav_cs_mobiles'])")).click();
	}
}
