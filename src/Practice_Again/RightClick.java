package Practice_Again;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick{

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement click = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.doubleClick(click).perform();
		

	}

}
