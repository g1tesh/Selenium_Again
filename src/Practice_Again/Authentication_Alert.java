package Practice_Again;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication_Alert {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("http://the-internet.herokuapp.com/basic_auth"); //Normal url
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth"); //Authenticator url, where we add user:password

	}

}
