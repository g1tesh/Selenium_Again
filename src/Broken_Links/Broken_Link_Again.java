package Broken_Links;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_Link_Again {

	public static void main(String[] args) throws MalformedURLException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		int BrokernLink = 0;
		List<WebElement> tag = driver.findElements(By.tagName("a"));
		
		for(int i = 0; i<tag.size(); i++)
		{
			String url = tag.get(i).getAttribute("href");
			
			if(url == null || url.isEmpty() )
			{
				System.out.println("url is Empty");
				continue;
			}
			
			URL link = new URL(url);
			try
			{
			HttpURLConnection httpsconnect = (HttpURLConnection)link.openConnection();
			if(httpsconnect.getResponseCode()>400)
				{
				System.out.println(httpsconnect.getResponseCode()+"    ----- Link is Broken");
				BrokernLink++;
				}
			else
				{
				System.out.println("Link is not broken");
				}
			}
				catch(Exception e)
			{
				
			}
			
			
			
		}
		
		System.out.println("Number of Brokern Link = "+BrokernLink);	
		driver.quit();
	}

}
