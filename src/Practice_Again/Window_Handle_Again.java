package Practice_Again;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handle_Again {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/popup.php");
		
		driver.findElement(By.xpath("//a[text() = 'Click Here']")).click();
		
		//driver.get("https://www.webroot.com/services/popuptester1.htm");
		
		Set<String> handles = driver.getWindowHandles();
		
		List<String> WindowHandle = new ArrayList(handles);
		
		String ParentID = WindowHandle.get(0);
		String ChildID = WindowHandle.get(1);
		
		driver.switchTo().window(ChildID);
		
		driver.close();

	}

}
