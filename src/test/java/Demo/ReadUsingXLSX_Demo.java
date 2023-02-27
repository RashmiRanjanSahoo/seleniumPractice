package Demo;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadUsingXLSX_Demo {
	public static void main(String[] args) throws IOException {
		String path="./DataFiles/Countries.xlsx";
		FileInputStream fis=new FileInputStream(path);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		//XSSFSheet sheet = workbook.getSheet("Sheet1");
		XSSFSheet sheet =workbook.getSheetAt(0);
		
		//get number or rows present 
		//int rows = sheet.getLastRowNum();  //11 (Count starts from 0)
		int rows=sheet.getPhysicalNumberOfRows();  //12 (Count starts from 1)
		System.out.println(rows);
		
		//get cell data from sheet by specifying the row and column no
		String val = sheet.getRow(1).getCell(0).getStringCellValue();
		 double idVal = sheet.getRow(1).getCell(1).getNumericCellValue();
		System.out.println(val);
		System.out.println(idVal);
		
		//To handle multiple types of data
		DataFormatter df= new DataFormatter();
		Object obj1=df.formatCellValue(sheet.getRow(1).getCell(0));
		System.out.println(obj1);
		System.out.println(df.formatCellValue(sheet.getRow(1).getCell(1)));
		
		//Printing all data 
		for(int i=0;i<rows;i++) {
			XSSFRow r = sheet.getRow(i);
			int col = r.getPhysicalNumberOfCells();
			for(int j=0;j<col;j++) {
				System.out.print(df.formatCellValue(sheet.getRow(i).getCell(j)));
			}
			System.out.println();
		}
	}
}
