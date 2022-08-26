package Practice_Again;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com");
		
		
		
		//Number of rows
		int rows = driver.findElements(By.xpath("//table[@name = 'BookTable']//tr")).size();
		
		//number of colmns
		int cols = driver.findElements(By.xpath("//table[@name = 'BookTable']//th")).size();
		
		
		for(int i = 2; i<=rows; i++)
		{
			System.out.println(driver.findElement(By.xpath("//table[@name = 'BookTable']//tr["+i+"]")).getText());
			System.out.println("----");
		}
		
		//Total price
		int total = 0;
		for(int i = 2; i<=rows; i++)
		{
		String price = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr["+i+"]/td[4]")).getText();
		total = total+Integer.parseInt(price);
		}
		System.out.println(total);
		

	}

}
