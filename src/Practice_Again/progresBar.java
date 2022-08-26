package Practice_Again;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class progresBar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demoqa.com/progress-bar");
		
		
		driver.findElement(By.id("startStopButton")).click();
		
		//String progress = "";
		
		while(true)
		{
		
	
		String progress = driver.findElement(By.xpath("//div[@role='progressbar']")).getText();
		System.out.println(driver.findElement(By.xpath("//div[@role='progressbar']")).getText());
		if(progress.equals("100%"))
		{
				break;
		}
	}

}
}
