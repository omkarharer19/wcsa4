package jForce;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	public String createAccount(String epath,String sname,int r,int c) throws IOException
	{
		FileInputStream fis = new FileInputStream(epath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet(sname);
		Row row = s.getRow(r);
		Cell cell = row.getCell(c);
		String data = cell.getStringCellValue();
		return data;
	}
}
