package TP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stpl {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://uat46.auruspay.com/storeplace/AdminLogin.do");
		driver.findElement(By.id("username")).sendKeys("hpatil1");
		driver.findElement(By.id("password")).sendKeys("Hpatil1!!");
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		driver.findElement(By.id("OtpEntered")).sendKeys("5345");
		driver.findElement(By.xpath("//button[text() = 'Login']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text() = 'Select Corporate...']")).click();
		
		driver.findElement(By.xpath("//li[text() = 'Toshiba Corp']")).click();
	}

}
