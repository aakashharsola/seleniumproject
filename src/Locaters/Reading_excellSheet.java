package Locaters;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reading_excellSheet {
	
  public static void main(String[] args) throws IOException {
		  
	  FileInputStream file = new FileInputStream ("E:\\vctc XLsheet\\Java Excel Sheet.xlsx");
	  
	  XSSFWorkbook  book = new XSSFWorkbook(file);
	  
	  XSSFSheet sheet = book.getSheet("Java Excel");
	  
	  XSSFRow row = sheet.getRow(0);
	   
	  XSSFCell cell = row.getCell(0);
	  
	  String data = cell.getStringCellValue();
	  
	  System.out.println(data);
	  
}

}
