package datadrivenTesting;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExcel {

	public static void main(String[] args) throws Exception{
	FileInputStream fis= new FileInputStream("./Book3.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	   for(int i=0;i<=1;i++) {
			for(int j=1;j<=10;j++) {
		String value = wb.getSheet("Sheet1").getRow(j).getCell(i).getStringCellValue();
		System.out.println(value);
		}
	   }
	}
	}
