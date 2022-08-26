package Practice_Again;

import java.io.FileNotFoundException;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSWite_Again {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream("C:\\Users\\gpatil\\Desktop\\Important\\Data.xlsx");
		
		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet("Data");
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<=5; i++)
		{
			XSSFRow rows = sheet.createRow(i);
			
			for(int j = 0; j<3; j++)
			{
				System.out.println("Enter value for "+i+"Row "+j+"col ");
				rows.createCell(j).setCellValue(sc.next());
				
			}
		}
		
		book.write(file);;
		book.close();
		
		System.out.println("File is ready");

	}

}
