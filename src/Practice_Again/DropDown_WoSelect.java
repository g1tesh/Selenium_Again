package Practice_Again;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDown_WoSelect {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		List<WebElement> allopts = driver.findElements(By.xpath("//select[@name = 'country_id']/option")); //Chained xpath
		
		for(int i = 0; i<allopts.size(); i++)
		{
			allopts.get(i).getText();
			if(allopts.get(i).getText().equals("Samoa"))
			{
				allopts.get(i).click();
				break;
			}
		}
	}

}
