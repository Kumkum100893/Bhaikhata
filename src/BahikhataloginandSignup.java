import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BahikhataloginandSignup
{

	public static void main(String[] args) throws InterruptedException
	
	{
		
	WebDriver driver = new ChromeDriver();	
	driver.manage().window().maximize();
	driver.get("https://marketadvisor.co.in/bahikhata/dev/app/");
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText("Don't have an account?")).click();
	
	
	
	Thread.sleep(2000);
	WebElement choosePaymentPlan = driver.findElement(By.name("plans"));
	Select s1 = new Select(choosePaymentPlan);
	s1.selectByValue("monthly");
	
	
	
	/**driver.findElement(By.cssSelector("input[type='email']")).sendKeys("kj@gmail.com");
	driver.findElement(By.name("password")).sendKeys("kj@12345");
    driver.findElement(By.className("login-btn")).click();
    Thread.sleep(2000);
    System.out.println(driver.findElement(By.className("text-muted")).getText());
    driver.findElement(By.cssSelector("input[placeholder = 'Product Name']")).sendKeys("Realme");
	driver.findElement(By.id("model")).sendKeys("20");
	driver.findElement(By.name("color")).sendKeys("white");
	driver.findElement(By.id("imei")).sendKeys("123456789101123");
	driver.findElement(By.xpath("//input[@name='ram']")).sendKeys("8");
	driver.findElement(By.xpath("//input[@name='hdd']")).sendKeys("20");
	driver.findElement(By.id("session-date")).click();
	driver.findElement(By.xpath("//input[@placeholder='Purchase From']")).sendKeys("dinesh sharma");
	driver.findElement(By.id("ph-no")).sendKeys("9876543212");
	driver.findElement(By.id("purchase-amount")).sendKeys("5500");
	driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm']")).click(); **/
	}

}
