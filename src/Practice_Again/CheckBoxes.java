package Practice_Again;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@class = 'form-check-input' and @type = 'checkbox']"));
		
		//Select all the checkBox
		
		for(int i = 0; i<checkbox.size(); i++)
		{
			checkbox.get(i).click();
		}
		
		WebElement element = driver.findElement(By.className("custom-select"));
		Select select = new Select(element);
		select.selectByVisibleText("Spain");
		
		
		//Total number of options in dropdown
		
	
		
		
		
		
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
