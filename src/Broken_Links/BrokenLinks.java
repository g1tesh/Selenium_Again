package Broken_Links;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.apache.batik.anim.timing.Trace;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		
		int brokernLink = 0;
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(int i = 0; i<links.size(); i++)
		{
			String url = links.get(i).getAttribute("href");
			
			if(url.isEmpty() || url.equals("Null"))
			{
				System.out.println("Link is Empty"+ url);
				continue;
			}
			
			URL link = new URL(url);
			
			try {
			HttpURLConnection httpcon = (HttpURLConnection)link.openConnection();
			httpcon.connect();
			
			if(httpcon.getResponseCode()>400)
			{
				System.out.println(httpcon.getResponseCode()+"----"+url+"----"+" Link is Brokern");
				brokernLink++;
			}
			else
			{
				System.out.println("Link is not Brokern");
			}
			
			}
			catch(Exception e)
			{
				
			}
		}
		System.out.println("Number of Brokern Link = "+brokernLink);
		driver.quit();

	}

}
