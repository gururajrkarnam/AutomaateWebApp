package Utils;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.poi.hslf.usermodel.HSLFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFRow.CellIterator;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class ExcelUtilsDemo {

	public static void main(String args[]) {



		String projectPath = System.getProperty("user.dir");
		Excelutils excel = new Excelutils(projectPath+"/Excel/Data.xlsx","Sheet1");
		excel.GetRowCount();
		excel.GetCellDataString(2, 0);
		excel.GetCellDataNumber(4, 1);


	}}
