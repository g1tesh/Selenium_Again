package Practice_Again;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Total {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		WebElement options = driver.findElement(By.id("input-country"));
		
		Select dropOptions = new Select(options);
		
		List <WebElement> Alloptions = dropOptions.getOptions();
		
		for(int i = 0; i<Alloptions.size(); i++)
		{
		System.out.println(Alloptions.get(i).getText());
		}

	}

}
