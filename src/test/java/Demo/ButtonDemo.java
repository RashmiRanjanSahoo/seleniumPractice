package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%2F%3F_encoding%3DUTF8%26adgrpid%3D57434613725%26ext_vrnc%3Dhi%26gclid%3DCjwKCAiAqaWdBhAvEiwAGAQltuRKqv4r1SSyqQ726GzRchNO4abLUh-sv5zU4BhgOzOpsv5WuXNZUBoC3yIQAvD_BwE%26hvadid%3D617724335989%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D1007799%26hvnetw%3Dg%26hvpone%3D%26hvpos%3D%26hvptwo%3D%26hvqmt%3Db%26hvrand%3D7221260563350060684%26hvtargid%3Dkwd-317907835099%26hydadcr%3D15413_2322997%26ie%3DUTF8%26index%3Daps%26keywords%3Damaozn%26ref%3Dpd_sl_2j92my16t3_b%26tag%3Dgooginhydr1-21%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		driver.manage().window().maximize();
		driver.findElement(By.id("ap_customer_name")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ap_customer_name")).sendKeys("Rashmi");
		driver.findElement(By.id("ap_phone_number")).submit();  //submitting the form using any element inside form
		//we can use any element inside the form to submit the form,
		//But we have use button type=submit to submit the form using click or submit method.
		Thread.sleep(2000);
		driver.findElement(By.id("ap_phone_number")).sendKeys("1122334455");
		driver.findElement(By.id("continue")).click(); //submitting the form using click()
		Thread.sleep(2000);
		driver.findElement(By.id("ap_password")).sendKeys("Pass");
		Thread.sleep(6000);
		driver.findElement(By.id("continue")).submit(); //submitting the form using submit()
		Thread.sleep(5000);
	}
}
