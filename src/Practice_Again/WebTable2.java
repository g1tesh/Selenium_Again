package Practice_Again;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		
		//No. of rows in the WebTable
		
		List <WebElement> rowsno = driver.findElements(By.xpath("//div[@class = 'ReactTable -striped -highlight']//div[@class = 'rt-tr-group']"));
		int rows = rowsno.size();
		System.out.println("No. of rows = "+rows);
		
		//find no of colomns
		
		List<WebElement> coloumn = driver.findElements(By.xpath("//div[@class = 'ReactTable -striped -highlight']//div[@class = 'rt-th rt-resizable-header -cursor-pointer']"));
		int colno = coloumn.size();
		//Find the specific value
		
		System.out.println("First Name = "+driver.findElement(By.xpath("//div[@class = 'ReactTable -striped -highlight']//div[text() = 'Kierra']")).getText());
		System.out.println("Last Name = "+driver.findElement(By.xpath("//div[@class = 'ReactTable -striped -highlight']//div[text() = 'Gentry']")).getText());

		
		//All the elements// //div[@class = 'ReactTable -striped -highlight']//div[@class = 'rt-tr-group'][1]
		
		for(int i = 1; i<rows; i++) {
			
		System.out.println(driver.findElement(By.xpath("//div[@class = 'ReactTable -striped -highlight']//div[@class = 'rt-tr-group']["+i+"]")).getText());
			
			
		}
		int totalSal= 0;
		for(int j = 1; j<=3; j++ )
		{
		String sal = driver.findElement(By.xpath("//div[@class = 'rt-tr-group']["+j+"]//div[@class = 'rt-td'][5]")).getText();
		
		totalSal = totalSal+Integer.parseInt(sal);
		
		}
		System.out.println("Total salary is = "+totalSal);
	}

}
