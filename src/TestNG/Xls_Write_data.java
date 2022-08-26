package TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xls_Write_data {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fo = new FileOutputStream("C:\\Users\\gpatil\\Desktop\\TestData\\DataProviderLogin.xlsx");
		
		XSSFWorkbook xw = new XSSFWorkbook();
		XSSFSheet xs = xw.createSheet("Login");
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<=4; i++)
		{
			XSSFRow xr = xs.createRow(i);
			for(int j = 0; j<2; j++)
			{
				System.out.println("Enter value");
				xr.createCell(j).setCellValue(sc.next());
			}
		}
		
		xw.write(fo);
		xw.close();
		
		
		
	}

}
