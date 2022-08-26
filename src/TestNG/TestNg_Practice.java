package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNg_Practice {
	
	WebDriver driver;
	
	@BeforeMethod()
	void setup()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
	}
	@Test
	void login() throws InterruptedException
	{
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		driver.findElement(By.className("password")).clear();
		driver.findElement(By.className("password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		Thread.sleep(3000);
		
		String tag= driver.findElement(By.xpath("//h1[normalize-space()='Dashboard']")).getText();
		
		Assert.assertEquals(tag, "Dashboard","String does not match");
		
	}

}
