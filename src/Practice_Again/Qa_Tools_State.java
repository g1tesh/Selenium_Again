package Practice_Again;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.AWTException;
import java.awt.Robot;

public class Qa_Tools_State {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		WebElement state = driver.findElement(By.xpath("//div[@class = ' css-1wa3eu0-placeholder' and contains(text(),'Select State')]"));
		
		Actions action = new Actions(driver);
		Robot robot = new Robot();
		for(int i=0; i<30; i++){
			
			
			}
		
		state.click();
		action.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN);

	}

}
