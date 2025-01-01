package All_Tasks;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class GetDataFromExcel {

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
		
		String file = "C:\\Users\\shubham.kori\\eclipse-workspace\\Selenium_Java_Task\\src\\main\\java\\testNG_Program\\Data_testing.xls";
		File f = new File(file);
		
		Workbook wk = Workbook.getWorkbook(f);
		Sheet s= wk.getSheet("Login");
		
		Cell c = s.getCell(0,0);
		String value = c.getContents();
		System.out.println(value);
		
		Cell c1 = s.getCell(1,0);
		String value1 = c1.getContents();
		System.out.println(value1);

	}

}
