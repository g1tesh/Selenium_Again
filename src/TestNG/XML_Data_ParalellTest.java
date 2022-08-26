package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class XML_Data_ParalellTest {
	
	
	WebDriver driver;
	@Parameters({"browser","url"})
	@BeforeClass
	void setup(String br, String appurl)
	{
		if(br.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		
		}
		else if(br.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get("https://demo.nopcommerce.com/login");
	}
	
	@Test()
	void Testlogin()
	{
		Assert.assertEquals(driver.getTitle(),"nopCommerce demo store. Login");
		
	}
	@Test()
	void imageValidation()
	{
		boolean value = driver.findElement(By.xpath("//img[@alt = 'nopCommerce demo store']")).isDisplayed();
		Assert.assertEquals(value, true);
	}
	
	@AfterClass
	void teardown() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.quit();
	}
}
