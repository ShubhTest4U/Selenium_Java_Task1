package testNG_Program;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class GetDataFromXLS {
	
	@Test
	void Get_Data_From_XLS() throws BiffException, IOException
	{
		String file = "C:\\Users\\shubham.kori\\eclipse-workspace\\Selenium_Java_Task\\src\\main\\java\\testNG_Program\\Data_testing.xls";
		File f = new File(file);
		Workbook wk = Workbook.getWorkbook(f);
		Sheet s = wk.getSheet("Login");
		Cell c = s.getCell(0,0);  //Column, Row
		String value = c.getContents();
		System.out.println(value);
		
		Cell c1 = s.getCell(1,0);
		String value1 = c1.getContents();
		System.out.println(value1);
		
	}

}
