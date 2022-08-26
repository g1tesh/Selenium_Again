package Practice_Again;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demoqa.com/slider");
		
		WebElement slider = driver.findElement(By.cssSelector("span.range-slider__wrap"));
		
		System.out.println(driver.findElement(By.cssSelector("span.range-slider__wrap")).getLocation());
		
		Actions action = new Actions(driver);
		
		action.dragAndDropBy(slider, 60, 0).perform();
		
		

	}

}
