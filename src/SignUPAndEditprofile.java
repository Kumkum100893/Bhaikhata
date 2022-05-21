import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUPAndEditprofile {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://marketadvisor.co.in/bahikhata/dev/app/login");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Don't have an account?")).click();

		driver.findElement(By.name("first_name")).sendKeys("kumkum");
		driver.findElement(By.name("last_name")).sendKeys("Jain");
		driver.findElement(By.name("shop_name")).sendKeys("kirana king");
		driver.findElement(By.name("address")).sendKeys("adarsh nagar A");
		driver.findElement(By.name("mobile")).sendKeys("9876543212");
		driver.findElement(By.name("email")).sendKeys("kumkumjain123@gmail.com");
		driver.findElement(By.name("password")).sendKeys("password@123");

		WebElement choosePaymentPlan = driver.findElement(By.name("plans"));
		
		Select s1 = new Select(choosePaymentPlan);
		Thread.sleep(3000);
		s1.selectByVisibleText("free ");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		// TODO Auto-generated method stub

	}

}
