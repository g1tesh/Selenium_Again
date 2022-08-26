package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementScreenShot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mvnrepository.com/artifact/commons-io/commons-io/2.11.0");
		
		WebElement img = driver.findElement(By.className("im-logo"));
		File scr = img.getScreenshotAs(OutputType.FILE);
		File trg = new File(System.getProperty("user.dir")+"\\ScrenShot\\img.png");
		FileUtils.copyFile(scr, trg);
		System.out.println("Please refresh Screnshot folder");

	}

}
