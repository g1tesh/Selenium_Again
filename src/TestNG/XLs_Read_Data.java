package TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLs_Read_Data {

	public static void main(String[] args) throws IOException {
		
		FileInputStream FI = new FileInputStream("C:\\Users\\gpatil\\Desktop\\TestData\\DataProviderLogin.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(FI);
		XSSFSheet sheet= wb.getSheet("Login");
		
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(0).getLastCellNum();
		
		for(int i = 0; i<=rows; i++)
		{
			XSSFRow row = sheet.getRow(i); 
			
			for(int j = 0; j<cols; j++)
			{
				String cell = row.getCell(j).toString();
				System.out.println("The value of cell is "+cell);
			}
		}
		
		wb.close();
		
	}

}
