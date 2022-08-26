package Practice_Again;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider_again {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demoqa.com/slider");
		WebElement slider = driver.findElement(By.xpath("//input[@class = 'range-slider range-slider--primary']"));
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(slider, 55, 0).perform();
		
		
	}

}
