package Practice_Again;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Iframes {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		driver.switchTo().frame("packageListFrame");  //Will switch to frame
		driver.findElement(By.xpath("//a[text() ='org.openqa.selenium']")).click();
		driver.switchTo().defaultContent();   //Will switch to main webpage
		
		Thread.sleep(3000);
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("//span[text() = 'Alert']")).click();
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		
		driver.switchTo().frame("classFrame");
		String validate =driver.findElement(By.xpath("//li[@class = 'blockList']")).getText();
		
		if(validate.equals("public interface Alert"))
		{
			System.out.println(validate);
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println(validate);
		}
		
		
		

	}

}
