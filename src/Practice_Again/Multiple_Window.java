package Practice_Again;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Window {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com");
		
		driver.findElement(By.className("wikipedia-search-input")).sendKeys("Welcome");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Welcome")).click();
		driver.findElement(By.linkText("Welcome Back, Kotter")).click();
		driver.findElement(By.linkText("Welcome to the N.H.K.")).click();
		
		Set<String> handles = driver.getWindowHandles();
		
		List<String> listhandles = new ArrayList(handles);
		
		System.out.println(listhandles.size());
		
		for(int i = 0; i<listhandles.size(); i++)
		{
			String Allhandles = listhandles.get(i);
			driver.switchTo().window(Allhandles);
			String title = driver.getTitle();
			if(title.equals("Welcome Back, Kotter - Wikipedia"))
			{
				System.out.println("Keep this open "+title);
			}
			else
			{
				driver.close();
			}
		}
		
		
	}

}
