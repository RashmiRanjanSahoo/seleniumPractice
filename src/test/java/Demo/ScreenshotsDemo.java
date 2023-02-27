package Demo;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotsDemo {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File SrcFile = ts.getScreenshotAs(OutputType.FILE);
		
		File DestFile=new File(System.getProperty("user.dir")+"/Screenshots/"+"s1"+".png");
		
		FileHandler.copy(SrcFile, DestFile);
		System.out.println(System.getProperty("user.dir"));	
	}
}
