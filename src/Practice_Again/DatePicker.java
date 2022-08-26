package Practice_Again;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@class = 'hasDatepicker']")).click();
		
		String month = "December";
		String year = "2023";
		
		//String currentMonth = driver.findElement(By.xpath("//span[@class = 'ui-datepicker-month']")).getText();
		
		while(true)
		{
			String currentMonth = driver.findElement(By.xpath("//span[@class = 'ui-datepicker-month']")).getText();
			String currentyear = driver.findElement(By.className("ui-datepicker-year")).getText();
			if(currentMonth.equals(month) && currentyear.equals(year))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//span[text() = 'Next']")).click();
			}
			
		}
		
		driver.findElement(By.xpath("//a[text() = '31']")).click();

	}

}
