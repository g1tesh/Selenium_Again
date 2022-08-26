package Practice_Again;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com");
		
		
		//To Find number of rows
		
		int rows = driver.findElements(By.xpath("//table[@name = 'BookTable']//tr")).size();
		System.out.println("Number of Rows are "+rows);
		
		// To find number of coloumns
		
		int cols = driver.findElements(By.xpath("//table[@name = 'BookTable']//th")).size();
		System.out.println("No. of colomns = "+cols);
		
		// To Find Specific text from given row colomn
		// for eg 5 row 2 column
		
		String specificText = (driver.findElement(By.xpath("//table[@name = 'BookTable']//tr[5]//td[2]")).getText());
		System.out.println("Specific Text is "+specificText);
		
		//To get all the text from entire Table
		
		for(int i = 2; i<=rows; i++)
		{
			for(int j = 1; j<=cols; j++)
			{
				String text = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr["+i+"]//td["+j+"]")).getText();
				System.out.print(text);
				System.out.print("                  ");
				
			}
			System.out.println();
		}
		
		//To count the Total price
		int sum = 0;
		for(int i = 2; i<=rows; i++)
		{
		String price = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr["+i+"]//td[4]")).getText();
		
		 sum = sum+Integer.parseInt(price);
		 
		}
		System.out.println("Total price of all books is "+sum);
		
		
		
		Thread.sleep(5000);
		driver.quit();
	}

}
