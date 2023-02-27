package Demo;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HtmlTableDemo {

	public static void main(String[] args) {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		List<WebElement> rows = driver.findElements(By.cssSelector("#customers>tbody>tr"));	
		List<WebElement> thead = driver.findElements(By.cssSelector("#customers>tbody>tr:nth-of-type(1)>th"));
		for(int h=0;h<thead.size();h++) {
			System.out.println(thead.get(h).getText());
			System.out.println();
		}
			for(int i=1;i<rows.size();i++) {
			List<WebElement> tdata = driver.findElements(By.cssSelector("#customers>tbody>tr:nth-of-type("+i+")>td"));
				for(int j=0;j<tdata.size();j++) {
					System.out.println(tdata.get(j).getText());
				}
		}
	}
}
