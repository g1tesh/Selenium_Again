package Practice_Again;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.webroot.com/services/popuptester1.htm");
		
		Set<String> Allhandles = driver.getWindowHandles();
		
		List<String> handle = new ArrayList(Allhandles);
		
		String ParentHandle = handle.get(0);
		System.out.println(ParentHandle);
		String ChildHandle = handle.get(1);
		
		driver.switchTo().window(ChildHandle);
		
		System.out.println(driver.getTitle());
		
		driver.close();

	}

}
