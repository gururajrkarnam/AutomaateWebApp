package Utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils {
	static String projectpath;
	static XSSFWorkbook workbook;
	 static XSSFSheet sheet;
	
	public Excelutils (String ExcelPath, String SheetName) {
		
		
		 try {
			 projectpath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(ExcelPath);
			sheet = workbook.getSheet(SheetName);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
		
	
	}
	
	public static void main(String[] args) {
		GetRowCount();
		GetCellDataString(0,0);
		GetCellDataNumber(1,1);
		
	}
	public static void GetRowCount() {
		
		try {
			 
			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("number of rows:"+rowCount);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void GetCellDataString(int rownum,int colnum) {
		try {
			 
			String CellData = sheet.getRow(rownum).getCell(colnum).getStringCellValue();
			System.out.println(CellData);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void GetCellDataNumber(int rownum, int colnum) {
		try {
			
			double CellData = sheet.getRow(rownum).getCell(colnum).getNumericCellValue();
			System.out.println(CellData);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
