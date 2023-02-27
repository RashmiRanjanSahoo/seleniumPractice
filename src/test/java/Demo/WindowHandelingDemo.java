package Demo;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandelingDemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".btn.btn-info")).click();
		String wid = driver.getWindowHandle();
		System.out.println("The Id of current window is "+wid);
		driver.switchTo().window(wid);
		String CurrentURL = driver.getCurrentUrl();
		System.out.println(CurrentURL);
		
		Set<String> wids = driver.getWindowHandles();
		Iterator<String> itr = wids.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		Object[] wd = wids.toArray();
		System.out.println(wd[0].toString());
		System.out.println(wd[1].toString());
		
		driver.switchTo().window(wd[1].toString());
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.close();
		driver.switchTo().window(wd[0].toString());
		Thread.sleep(5000);
		
		//Open New Seperate Windows
		driver.findElement(By.linkText("Open New Seperate Windows")).click();
		driver.findElement(By.cssSelector(".btn.btn-primary")).click();
		
		Set<String> wids1 = driver.getWindowHandles();
		Object[] wd1 = wids1.toArray();
		System.out.println(wd1[0].toString());
		System.out.println(wd1[1].toString());
		
		driver.switchTo().window(wd1[1].toString());
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		driver.switchTo().window(wd1[0].toString());
		//Open Seperate Multiple Windows
		driver.findElement(By.linkText("Open Seperate Multiple Windows")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[@class='btn btn-info'])[2]")).click();
		
		Set<String> ids = driver.getWindowHandles();
		Object[] arr = ids.toArray();
		for(int i=0;i<ids.size();i++) {
			System.out.println(arr[i].toString());
		}
		
	}
}
