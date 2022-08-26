package Practice_Again;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_Search {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bing.com/");
		Thread.sleep(2000);
		
		
		
		driver.findElement(By.xpath("//input[@id = 'sb_form_q']")).sendKeys("Selenium");
		Thread.sleep(3000);
		
		List<WebElement> optns =  driver.findElements(By.xpath("//div[@id = 'sw_as']//span[@class = 'sa_tm_text']")); //Chained xpath
		
		for(int i = 0; i<optns.size(); i++)
		{
			System.out.println(optns.get(i).getText());
		}

	}

}
