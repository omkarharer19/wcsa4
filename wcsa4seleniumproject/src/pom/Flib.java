package pom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	
	public String readexcel(String excelp,String sheetn,int r, int c) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelp);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet(sheetn);
		Row row = s.getRow(r);
		Cell cell = row.getCell(c);
		String data = cell.getStringCellValue();
		return data;
	}
	
	public String readproperty(String propp,String v) throws IOException
	{
		FileInputStream fis = new FileInputStream(propp);
		Properties p = new Properties();
		p.load(fis);
		String value = p.getProperty(v);
		return value;
		
		
	}
	
	public int rowCount(String excelp,String sheetn) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelp);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet(sheetn);
		int l = s.getLastRowNum();
		return l;
		
		
	}

}
