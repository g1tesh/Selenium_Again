package Practice_Again;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLS_write {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream("C:\\Users\\gpatil\\Desktop\\Blank.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook();
		
		XSSFSheet ws = wb.createSheet("Data");
		
		for(int i =0; i<5; i++)
		{
			XSSFRow xr = ws.createRow(i);
			
			for(int j = 0; j<3; j++)
			{
				xr.createCell(j).setCellValue("Welcome");
			}
		}
		
		wb.write(file);
		wb.close();
		

	}

}
