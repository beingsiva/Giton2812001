package datadrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFromExcel {

	public static void main(String[] args) throws IOException, InvalidFormatException {
		FileInputStream fis= new FileInputStream("./crendentials.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		int row = sheet.getLastRowNum();
		System.out.println(row);
		short col = sheet.getRow(1).getLastCellNum();
		System.out.println(col);
		
		/*for(int r=0;r<=row;r++) {
		Row row1=sheet.getRow(r);
		
		for(int c=0;c<col;c++) {
			Cell cell = row1.getCell(c);
			switch(cell.getCellType()) {
			case STRING:System.out.print(cell.getStringCellValue());
			break;
			}
			System.out.print(" ");
			}
		System.out.println("");
		}*/
	}

}
