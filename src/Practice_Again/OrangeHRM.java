package Practice_Again;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeHRM {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//driver.findElement(By.xpath("//input[@id = 'txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[contains(@id, 'txtUsername')]")).sendKeys("Admin");
	}

}
