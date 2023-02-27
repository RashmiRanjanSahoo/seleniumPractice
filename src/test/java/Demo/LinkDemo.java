package Demo;

import java.util.Iterator;
import java.util.List;

import org.apache.hc.core5.http.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkDemo {
    static WebDriver driver;
    static int brokenLinksCount=0;
	public static void main(String[] args) throws InterruptedException {
		driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.linkText("About Us")).click();
		driver.findElement(By.partialLinkText("Privacy Policy")).click();
		Thread.sleep(4000);
		getbrokenLinks();
	}
	private static void getbrokenLinks() {
		driver.get("https://www.amazon.in/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("The No of links on the page is "+links.size());
		Iterator<WebElement> it = links.iterator();
		while(it.hasNext()) {
			String url = it.next().getAttribute("href");
			System.out.println(url);
			if(url == null || url.isEmpty()){
				System.out.println("URL is either not configured for anchor tag or it is empty");
				                continue;
				            }
			if(!url.startsWith("https://www.amazon.in")){
                System.out.println("URL belongs to another domain, skipping it.");
                continue;
            }
			try {
				URL link =new URL(url);
				HttpURLConnection httpcon = (HttpURLConnection)link.openConnection();
				httpcon.connect();
				if(httpcon.getResponseCode()>=400) {
					System.out.println(httpcon.getResponseCode()+url+" is"+"Broken Link");
					brokenLinksCount++;
				}
				else
				{
					System.out.println(httpcon.getResponseCode()+url+" is"+"Valid Link");
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("The no of broken links are "+brokenLinksCount);		
}
}
