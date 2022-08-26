package Practice_Again;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xlsRead_Again {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\gpatil\\Desktop\\TestData.xlsx");
		
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheet("Sheet1");
		
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(1).getLastCellNum();
		
		for(int i = 0; i<=rows; i++)
		{
			XSSFRow row = sheet.getRow(i);
			
			for(int j = 0; j<cols; j++)
			{
				XSSFCell cell = row.getCell(j);
				System.out.print(cell.toString()+"          ");
			}
			System.out.println();
		}
		
	}

}
