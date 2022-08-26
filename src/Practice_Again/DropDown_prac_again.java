package Practice_Again;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDown_prac_again {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).sendKeys("Aus");
		List<WebElement> country = driver.findElements(By.xpath("//li[@class = 'ui-menu-item']"));
		Thread.sleep(3000);
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		
		for(int i = 0; i<country.size(); i++)
		{
			WebElement select = country.get(i);
			if(select.getText().equals("Australia"))
			{
				
				js.executeScript("arguments[0].click()", select);
				
			}
		}
			
			
	}

}

	


