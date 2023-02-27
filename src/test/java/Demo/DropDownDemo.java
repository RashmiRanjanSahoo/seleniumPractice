package Demo;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//select an element using select class
		WebElement sel = driver.findElement(By.xpath("//select[@title='Search in']"));
		new Select(sel).selectByVisibleText("Amazon Devices");
		Thread.sleep(4000);
		Select s=new Select(driver.findElement(By.xpath("//select[@title='Search in']")));
		s.selectByVisibleText("Appliances");
		Thread.sleep(4000);
		
		//get all the list of options
		List<WebElement> allOpt = s.getOptions();
		for(int i=0;i<allOpt.size();i++) {
			System.out.println(allOpt.get(i).getText());
		}
		
		//select an element without using select class
		List<WebElement> opt = driver.findElements(By.cssSelector("#searchDropdownBox>option"));
		for(int i=0;i<opt.size();i++) {
			if(opt.get(i).getText().equals("Amazon Fresh")) {
				opt.get(i).click();
			}
		}
		//Handeling bootstrap dropdown
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		driver.findElement(By.id("dropdownMenuButton")).click();
		Thread.sleep(4000);
		List<WebElement> BsOpt = driver.findElements(By.cssSelector(".dropdown-menu.show>a"));
		for(WebElement opts:BsOpt) {
			if(opts.getText().equals("Action")) {
				opts.click();
				Thread.sleep(5000);
			}
		}
		
		//Handling combo box
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".select2-selection.select2-selection--single")).click();
		//driver.findElement(By.id("select2-country-container")).click();
		driver.findElement(By.cssSelector(".select2-search__field")).sendKeys("I");
		List<WebElement> CB_Opts = driver.findElements(By.cssSelector("#select2-country-results>li"));
		//printing the options of combobox
		for(int i=0;i<CB_Opts.size();i++) {
			System.out.println("Optin :- "+CB_Opts.get(i).getText());
		}
		for(WebElement CB_opt:CB_Opts) {
			if(CB_opt.getText().equals("India")) {
				CB_opt.click();
				Thread.sleep(4000);
				break;
			}
		}
		//ListBox demo
		
		driver.get("https://www.htmlelements.com/demos/listbox/overview/index.htm");
		driver.findElement(By.xpath("//div[text()='Android']")).click();
		driver.findElement(By.xpath("//div[text()='DCIM']")).click();
		
		Thread.sleep(4000);

	}

}
