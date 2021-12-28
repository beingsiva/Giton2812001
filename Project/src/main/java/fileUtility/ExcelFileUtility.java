package fileUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ExcelFileUtility {
	
	@Test
	public String readFromExcelFile(String sheet, int row, int Cell) throws Exception, IOException {
		FileInputStream fis= new FileInputStream("./Book3.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String Stringvalue = wb.getSheet(sheet).getRow(row).getCell(Cell).getStringCellValue();
		return Stringvalue;
		
		
		
		
	}

}
