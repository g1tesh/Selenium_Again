package Broken_Links;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks_Practice {

	public static void main(String[] args) throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.deadlinkcity.com/");
		
		List <WebElement> tag = driver.findElements(By.tagName("a"));
		
		int brokenLink = 0;
		for(int i = 0; i<tag.size(); i++)
		{
			String link = tag.get(i).getAttribute("href");
			if(link == null || link.isEmpty())
			{
				System.out.println("Empty Link");
				continue;
			}
			
			URL url = new URL(link);
			try {
			HttpURLConnection httpcon = (HttpURLConnection)url.openConnection();
			if(httpcon.getResponseCode()>400)
			{
				System.out.println(httpcon.getResponseCode()+" Broken Link ");
				brokenLink++;
			}
			else
			{
				System.out.println("NOt borken Link");
			}
			}
			catch(Exception e)
			{
				
			}
			
			
		}
		System.out.println("Total Broken Links "+brokenLink);
		
		
	}

}
