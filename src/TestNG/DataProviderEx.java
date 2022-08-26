package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProviderEx {
	
	
	WebDriver driver;
	
	@BeforeClass
	void Setup()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test(dataProvider ="DP")
	void testlogin(String usr, String pwd) throws InterruptedException
	{
		driver.get("https://demo.nopcommerce.com/login");
		driver.findElement(By.id("Email")).sendKeys(usr);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[text() ='Log in']")).click();
		Thread.sleep(1000);
		String expTitle = driver.getTitle();
		System.out.println(expTitle);
		Assert.assertEquals(expTitle, "nopCommerce demo store");
	}
	
	@DataProvider(name  = "DP")
	String[][] testdata()
	{
		String data[][] = {{"Admin@gmail.com","Talent_123"},
							{"admin@yourstore.com","admin_123"},
							{"abcd@gmail.com","123456"},
							{"hello@gmail.com","Hello"}};		
		return data;
	}

	@AfterClass
	void TearDown()
	{
		driver.quit();
	}
}
