package Mavenpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel1 {
	XSSFSheet sh;
	public String readData(int i,int j) {
		Row r=sh.getRow(i);	
		Cell c=r.getCell(j);
		int cell=c.getCellType();//1
		switch(cell) {
		case Cell.CELL_TYPE_NUMERIC:
		{
			
			double d=c.getNumericCellValue();
			return String.valueOf(d);
		}
		case Cell.CELL_TYPE_STRING:{
			return c.getStringCellValue();
		}
		}
		return null;

		
	}
	public Excel1() throws IOException {
		FileInputStream fp=new FileInputStream("C:\\Users\\ebin\\Downloads\\test1.xlsx");
		XSSFWorkbook wb =new XSSFWorkbook(fp);
		sh=wb.getSheet("Sheet1");
	}

}
