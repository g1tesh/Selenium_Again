package Extend_Report;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Extend_report_Test {
	
	WebDriver driver;
	@BeforeClass
	void setup()
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/login");
	}
	
	@Test(priority = 1)
		void Testlogin()
		{
			Assert.assertEquals(driver.getTitle(),"nopCommerce demo store. Login");
			
		}

	@Test(priority = 2)
	void imageValidation()
	{
		boolean value = driver.findElement(By.linkText("Computers ")).isDisplayed();
		Assert.assertEquals(value, true);
	}
	
	@Test(priority = 3 , dependsOnMethods = "imageValidation")
	void Test3()
	{
		System.out.println("Depends on Methods");
		
	}
	@AfterClass
	void teardown() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.quit();
	}
	
}
