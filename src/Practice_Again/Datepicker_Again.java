package Practice_Again;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Datepicker_Again {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoqa.com/date-picker");
		driver.findElement(By.xpath("//input[@id = 'datePickerMonthYearInput']")).click();
		
		Thread.sleep(2000);
		
		Select select = new Select(driver.findElement(By.xpath("//select[@class = 'react-datepicker__month-select']")));
		select.selectByVisibleText("December");
		
		Select select1 = new Select(driver.findElement(By.xpath("//select[@class = 'react-datepicker__year-select']")));
		select1.selectByVisibleText("2023");
		
		driver.findElement(By.xpath("//div[text()= '25']")).click();

	}

}
