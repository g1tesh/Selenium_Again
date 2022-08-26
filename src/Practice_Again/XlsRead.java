package Practice_Again;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlsRead {
	
	//File-Workbook-sheet- row -Cell

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\gpatil\\Desktop\\TestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int totalrow = sheet.getLastRowNum();
		int toalcols = sheet.getRow(1).getLastCellNum();
		
		System.out.println("Total rows = "+totalrow);
		System.out.println("Total cols = "+toalcols);
		
		for(int i =0; i<=totalrow; i++)
		{
			XSSFRow currentrow = sheet.getRow(i);
			for(int j = 0; j<toalcols; j++)
			{
				XSSFCell currentcell = currentrow.getCell(j);
				System.out.print(currentcell.toString()+"       ");
			}
			System.out.println();
		}
		
		workbook.close();
		file.close();
		
		
	}

}
