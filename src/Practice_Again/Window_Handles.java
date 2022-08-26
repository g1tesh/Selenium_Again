package Practice_Again;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handles {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Welcome");
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Welcome")).click();
		driver.findElement(By.linkText("Welcome Back, Kotter")).click();
		driver.findElement(By.linkText("Welcome to the N.H.K.")).click();
		driver.findElement(By.linkText("Welcome to Night Vale")).click();
		
		Set<String>windowID = driver.getWindowHandles();
		
		List<String> WindowsID = new ArrayList(windowID);
		
		for(int i = 0; i<WindowsID.size(); i++)
		{
			String Allhandle = WindowsID.get(i);
			driver.switchTo().window(Allhandle);
			System.out.println(driver.getTitle());
			if(driver.getTitle().equals("Welcome to the N.H.K. - Wikipedia"))
			{
				System.out.println("will remain open");
			}
			else
			{
				driver.close();
			}
		}
		
		

	}

}
