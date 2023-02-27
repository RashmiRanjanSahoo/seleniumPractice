package Demo;

import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteUsingXLSX_Demo {

	public static void main(String[] args) throws IOException {
		String path="./DataFiles/Employee.xlsx";
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet EmployeeDetails = workbook.createSheet();
		
		Object[][] empdata= {{"empid","Name","Job"},
							 {101,"David","Engineer"},
							 {102,"Rahul","Doctor"},
							 {103,"Rocky","Public servant"},
							 {104,"Amit","Professor"},
							};
		
		int rows = empdata.length;
		int col = empdata[0].length;
		System.out.println("The No of rows are"+rows);
		System.out.println("The no of columns are"+col);
		
		for(int r=0;r<rows;r++) {
			XSSFRow row = EmployeeDetails.createRow(r);
			
			for(int c=0;c<col;c++) {
				XSSFCell cell = row.createCell(c);
				Object val = empdata[r][c];
				if(val instanceof String) {
					cell.setCellValue((String)val);
				}
				if(val instanceof Integer) {
					cell.setCellValue((Integer)val);
				}
				if(val instanceof Boolean) {
					cell.setCellValue((Boolean)val);
				}
			}
			FileOutputStream fos=new FileOutputStream(path);
			workbook.write(fos);
			fos.close();
		}
		workbook.close();
		System.out.println("Success");
	}
}
